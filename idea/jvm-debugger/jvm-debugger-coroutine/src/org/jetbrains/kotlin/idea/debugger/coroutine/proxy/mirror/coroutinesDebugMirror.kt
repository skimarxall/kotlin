/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.debugger.coroutine.proxy.mirror

import com.sun.jdi.Field
import com.sun.jdi.Method
import com.sun.jdi.ObjectReference
import com.sun.jdi.ThreadReference
import org.jetbrains.kotlin.idea.debugger.evaluate.DefaultExecutionContext

class CoroutineInfo(context: DefaultExecutionContext) :
    BaseMirror<MirrorOfCoroutineInfo>("kotlinx.coroutines.debug.CoroutineInfo", context) {
    private val coroutineContextMirror = CoroutineContext(context)
    private val coroutineStackFrameMirror = CoroutineStackFrame(context)
    private val contextFieldRef: Field = makeField("context")
    private val creationStackBottom: Field = makeField("creationStackBottom")
    private val sequenceNumber: Field = makeField("sequenceNumber")
    private val creationStackTraceMethod: Method = makeMethod("getCreationStackTrace")
    private val stateMethod: Method = makeMethod("getState")

    private val lastObservedFrame: Field = makeField("lastObservedFrame")
    private val lastObservedThread: Field = makeField("lastObservedThread")

    override fun fetchMirror(value: ObjectReference, context: DefaultExecutionContext): MirrorOfCoroutineInfo {
        val state = objectValue(value, stateMethod, context)
        val creationStackBottomObjectReference = objectValue(value, creationStackBottom)
        val childcontinuation = childContinuationMirror.mirror(state, context)
        val cc = objectValue(value, contextFieldRef)
        val coroutineContext = if (cc is ObjectReference) coroutineContextMirror.mirror(cc, context) else null
        return MirrorOfCoroutineInfo(value, coroutineContext, creationStackBottom, sequenceNumber, creationStackTrace, state, lastObservedThread, lastObservedFrame)
    }

}

data class MirrorOfCoroutineInfo(
    val that: ObjectReference,
    val context: MirrorOfCoroutineContext?,
    val creationStackBottom: MirrorOfCoroutineStackFrame?,
    val sequenceNumber: Long?,
    val creationStackTrace: List<MirrorOfStackTraceElement>?,
    val state: String?,
    val lastObservedThread: ThreadReference?,
    val lastObservedFrame: MirrorOfCoroutineStackFrame?
)

class CoroutineStackFrame(context: DefaultExecutionContext) :
    BaseMirror<MirrorOfCoroutineStackFrame>("kotlin.coroutines.jvm.internal.CoroutineStackFrame", context) {
    private val stackTraceElementMirror = StackTraceElement(context)
    private val callerFrameField: Field = makeField("callerFrame")
    private val getStackTraceElementMethod: Method = makeMethod("getStackTraceElement")

    override fun fetchMirror(value: ObjectReference, context: DefaultExecutionContext): MirrorOfCoroutineStackFrame? {
        val objectReference = objectValue(value, callerFrameField)
        val callerFrame = if (objectReference is ObjectReference)
            this.mirror(objectReference, context) else null
        val stackTraceElementReference = objectValue(value, getStackTraceElementMethod, context)
        val stackTraceElement =
            if (stackTraceElementReference is ObjectReference) stackTraceElementMirror.mirror(stackTraceElementReference, context) else null
        return MirrorOfCoroutineStackFrame(value, callerFrame, stackTraceElement)
    }
}

data class MirrorOfCoroutineStackFrame(
    val that: ObjectReference,
    val callerFrame: MirrorOfCoroutineStackFrame?,
    val stackTraceElement: MirrorOfStackTraceElement?
)

class StackTraceElement(context: DefaultExecutionContext) :
    BaseMirror<MirrorOfStackTraceElement>("java.lang.StackTraceElement", context) {
    private val declaringClassObjectField: Field = makeField("declaringClassObject")
    private val classLoaderNameField: Field = makeField("classLoaderName")
    private val moduleNameField: Field = makeField("moduleName")
    private val moduleVersionField: Field = makeField("moduleVersion")
    private val declaringClassField: Field = makeField("declaringClass")
    private val methodNameField: Field = makeField("methodName")
    private val fileNameField: Field = makeField("fileName")
    private val lineNumberField: Field = makeField("lineNumber")
    private val formatField: Field = makeField("format")

    override fun fetchMirror(value: ObjectReference, context: DefaultExecutionContext): MirrorOfStackTraceElement? {
        val declaringClassObject = objectValue(value, declaringClassObjectField)
        val classLoaderName = stringValue(value, classLoaderNameField)
        val moduleName = stringValue(value, moduleNameField)
        val moduleVersion = stringValue(value, moduleVersionField)
        val declaringClass = stringValue(value, declaringClassField)
        val methodName = stringValue(value, methodNameField)
        val fileName = stringValue(value, fileNameField)
        val lineNumber = intValue(value, lineNumberField)
        val format = byteValue(value, formatField)
        return MirrorOfStackTraceElement(
            value,
            declaringClassObject,
            classLoaderName,
            moduleName,
            moduleVersion,
            declaringClass,
            methodName,
            fileName,
            lineNumber,
            format
        )
    }
}

data class MirrorOfStackTraceElement(
    val that: ObjectReference,
    val declaringClassObject: ObjectReference?,
    val classLoaderName: String?,
    val moduleName: String?,
    val moduleVersion: String?,
    val declaringClass: String?,
    val methodName: String?,
    val fileName: String?,
    val lineNumber: Int?,
    val format: Byte?
)