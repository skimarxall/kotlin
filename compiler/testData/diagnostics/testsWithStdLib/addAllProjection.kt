// !LANGUAGE: +NewInference
// !DIAGNOSTICS: -UNUSED_PARAMETER -UNUSED_VARIABLE

fun <K> select(vararg x: K) = x[0]
interface A
class B: A
class C: A
fun <T> id1(x: T): T = x
fun <R> id2(x: R): R = x

class Out<out R>(x: R)

fun main() {
    val x1 = select(id1 { B() }, id2 { <!TYPE_MISMATCH, TYPE_MISMATCH!>C()<!> })
}
