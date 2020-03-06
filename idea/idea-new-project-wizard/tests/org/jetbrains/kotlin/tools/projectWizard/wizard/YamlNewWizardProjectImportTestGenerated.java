/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.tools.projectWizard.wizard;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@RunWith(JUnit3RunnerWithInners.class)
public class YamlNewWizardProjectImportTestGenerated extends AbstractYamlNewWizardProjectImportTest {
    @TestMetadata("libraries/tools/new-project-wizard/new-project-wizard-cli/testData/buildFileGeneration")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class GradleKts extends AbstractYamlNewWizardProjectImportTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTestGradleKts, this, testDataFilePath);
        }

        public void testAllFilesPresentInGradleKts() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("libraries/tools/new-project-wizard/new-project-wizard-cli/testData/buildFileGeneration"), Pattern.compile("^([^\\.]+)$"), null, false);
        }

        @TestMetadata("android")
        public void testAndroid() throws Exception {
            runTest("libraries/tools/new-project-wizard/new-project-wizard-cli/testData/buildFileGeneration/android/");
        }

        @TestMetadata("jsNodeAndBrowserTargets")
        public void testJsNodeAndBrowserTargets() throws Exception {
            runTest("libraries/tools/new-project-wizard/new-project-wizard-cli/testData/buildFileGeneration/jsNodeAndBrowserTargets/");
        }

        @TestMetadata("jvmTarget")
        public void testJvmTarget() throws Exception {
            runTest("libraries/tools/new-project-wizard/new-project-wizard-cli/testData/buildFileGeneration/jvmTarget/");
        }

        @TestMetadata("kotlinJvm")
        public void testKotlinJvm() throws Exception {
            runTest("libraries/tools/new-project-wizard/new-project-wizard-cli/testData/buildFileGeneration/kotlinJvm/");
        }

        @TestMetadata("nativeForCurrentSystem")
        public void testNativeForCurrentSystem() throws Exception {
            runTest("libraries/tools/new-project-wizard/new-project-wizard-cli/testData/buildFileGeneration/nativeForCurrentSystem/");
        }

        @TestMetadata("simpleMultiplatform")
        public void testSimpleMultiplatform() throws Exception {
            runTest("libraries/tools/new-project-wizard/new-project-wizard-cli/testData/buildFileGeneration/simpleMultiplatform/");
        }

        @TestMetadata("simpleNativeTarget")
        public void testSimpleNativeTarget() throws Exception {
            runTest("libraries/tools/new-project-wizard/new-project-wizard-cli/testData/buildFileGeneration/simpleNativeTarget/");
        }

        @TestMetadata("singleplatformJs")
        public void testSingleplatformJs() throws Exception {
            runTest("libraries/tools/new-project-wizard/new-project-wizard-cli/testData/buildFileGeneration/singleplatformJs/");
        }
    }

    @TestMetadata("libraries/tools/new-project-wizard/new-project-wizard-cli/testData/buildFileGeneration")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class GradleGroovy extends AbstractYamlNewWizardProjectImportTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTestGradleGroovy, this, testDataFilePath);
        }

        public void testAllFilesPresentInGradleGroovy() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("libraries/tools/new-project-wizard/new-project-wizard-cli/testData/buildFileGeneration"), Pattern.compile("^([^\\.]+)$"), null, false);
        }

        @TestMetadata("android")
        public void testAndroid() throws Exception {
            runTest("libraries/tools/new-project-wizard/new-project-wizard-cli/testData/buildFileGeneration/android/");
        }

        @TestMetadata("jsNodeAndBrowserTargets")
        public void testJsNodeAndBrowserTargets() throws Exception {
            runTest("libraries/tools/new-project-wizard/new-project-wizard-cli/testData/buildFileGeneration/jsNodeAndBrowserTargets/");
        }

        @TestMetadata("jvmTarget")
        public void testJvmTarget() throws Exception {
            runTest("libraries/tools/new-project-wizard/new-project-wizard-cli/testData/buildFileGeneration/jvmTarget/");
        }

        @TestMetadata("kotlinJvm")
        public void testKotlinJvm() throws Exception {
            runTest("libraries/tools/new-project-wizard/new-project-wizard-cli/testData/buildFileGeneration/kotlinJvm/");
        }

        @TestMetadata("nativeForCurrentSystem")
        public void testNativeForCurrentSystem() throws Exception {
            runTest("libraries/tools/new-project-wizard/new-project-wizard-cli/testData/buildFileGeneration/nativeForCurrentSystem/");
        }

        @TestMetadata("simpleMultiplatform")
        public void testSimpleMultiplatform() throws Exception {
            runTest("libraries/tools/new-project-wizard/new-project-wizard-cli/testData/buildFileGeneration/simpleMultiplatform/");
        }

        @TestMetadata("simpleNativeTarget")
        public void testSimpleNativeTarget() throws Exception {
            runTest("libraries/tools/new-project-wizard/new-project-wizard-cli/testData/buildFileGeneration/simpleNativeTarget/");
        }

        @TestMetadata("singleplatformJs")
        public void testSingleplatformJs() throws Exception {
            runTest("libraries/tools/new-project-wizard/new-project-wizard-cli/testData/buildFileGeneration/singleplatformJs/");
        }
    }

    @TestMetadata("libraries/tools/new-project-wizard/new-project-wizard-cli/testData/buildFileGeneration")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Maven extends AbstractYamlNewWizardProjectImportTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTestMaven, this, testDataFilePath);
        }

        public void testAllFilesPresentInMaven() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("libraries/tools/new-project-wizard/new-project-wizard-cli/testData/buildFileGeneration"), Pattern.compile("^([^\\.]+)$"), null, false);
        }

        @TestMetadata("android")
        public void testAndroid() throws Exception {
            runTest("libraries/tools/new-project-wizard/new-project-wizard-cli/testData/buildFileGeneration/android/");
        }

        @TestMetadata("jsNodeAndBrowserTargets")
        public void testJsNodeAndBrowserTargets() throws Exception {
            runTest("libraries/tools/new-project-wizard/new-project-wizard-cli/testData/buildFileGeneration/jsNodeAndBrowserTargets/");
        }

        @TestMetadata("jvmTarget")
        public void testJvmTarget() throws Exception {
            runTest("libraries/tools/new-project-wizard/new-project-wizard-cli/testData/buildFileGeneration/jvmTarget/");
        }

        @TestMetadata("kotlinJvm")
        public void testKotlinJvm() throws Exception {
            runTest("libraries/tools/new-project-wizard/new-project-wizard-cli/testData/buildFileGeneration/kotlinJvm/");
        }

        @TestMetadata("nativeForCurrentSystem")
        public void testNativeForCurrentSystem() throws Exception {
            runTest("libraries/tools/new-project-wizard/new-project-wizard-cli/testData/buildFileGeneration/nativeForCurrentSystem/");
        }

        @TestMetadata("simpleMultiplatform")
        public void testSimpleMultiplatform() throws Exception {
            runTest("libraries/tools/new-project-wizard/new-project-wizard-cli/testData/buildFileGeneration/simpleMultiplatform/");
        }

        @TestMetadata("simpleNativeTarget")
        public void testSimpleNativeTarget() throws Exception {
            runTest("libraries/tools/new-project-wizard/new-project-wizard-cli/testData/buildFileGeneration/simpleNativeTarget/");
        }

        @TestMetadata("singleplatformJs")
        public void testSingleplatformJs() throws Exception {
            runTest("libraries/tools/new-project-wizard/new-project-wizard-cli/testData/buildFileGeneration/singleplatformJs/");
        }
    }
}
