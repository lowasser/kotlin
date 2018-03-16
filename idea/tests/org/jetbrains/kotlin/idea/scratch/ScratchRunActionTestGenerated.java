/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.scratch;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@RunWith(JUnit3RunnerWithInners.class)
public class ScratchRunActionTestGenerated extends AbstractScratchRunActionTest {
    @TestMetadata("idea/testData/scratch")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Compiling extends AbstractScratchRunActionTest {
        public void testAllFilesPresentInCompiling() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/scratch"), Pattern.compile("^(.+)\\.kts$"), TargetBackend.ANY, false);
        }

        @TestMetadata("extensionFunction.kts")
        public void testExtensionFunction() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/scratch/extensionFunction.kts");
            doCompilingTest(fileName);
        }

        @TestMetadata("for.kts")
        public void testFor() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/scratch/for.kts");
            doCompilingTest(fileName);
        }

        @TestMetadata("generics.kts")
        public void testGenerics() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/scratch/generics.kts");
            doCompilingTest(fileName);
        }

        @TestMetadata("klass.kts")
        public void testKlass() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/scratch/klass.kts");
            doCompilingTest(fileName);
        }

        @TestMetadata("simple.kts")
        public void testSimple() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/scratch/simple.kts");
            doCompilingTest(fileName);
        }

        @TestMetadata("simpleFun.kts")
        public void testSimpleFun() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/scratch/simpleFun.kts");
            doCompilingTest(fileName);
        }

        @TestMetadata("stdlibFun.kts")
        public void testStdlibFun() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/scratch/stdlibFun.kts");
            doCompilingTest(fileName);
        }

        @TestMetadata("unresolved.kts")
        public void testUnresolved() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/scratch/unresolved.kts");
            doCompilingTest(fileName);
        }

        @TestMetadata("userOutput.kts")
        public void testUserOutput() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/scratch/userOutput.kts");
            doCompilingTest(fileName);
        }

        @TestMetadata("var.kts")
        public void testVar() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/scratch/var.kts");
            doCompilingTest(fileName);
        }

        @TestMetadata("when.kts")
        public void testWhen() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/scratch/when.kts");
            doCompilingTest(fileName);
        }
    }

    @TestMetadata("idea/testData/scratch")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Repl extends AbstractScratchRunActionTest {
        public void testAllFilesPresentInRepl() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/scratch"), Pattern.compile("^(.+)\\.kts$"), TargetBackend.ANY, false);
        }

        @TestMetadata("extensionFunction.kts")
        public void testExtensionFunction() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/scratch/extensionFunction.kts");
            doReplTest(fileName);
        }

        @TestMetadata("for.kts")
        public void testFor() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/scratch/for.kts");
            doReplTest(fileName);
        }

        @TestMetadata("generics.kts")
        public void testGenerics() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/scratch/generics.kts");
            doReplTest(fileName);
        }

        @TestMetadata("klass.kts")
        public void testKlass() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/scratch/klass.kts");
            doReplTest(fileName);
        }

        @TestMetadata("simple.kts")
        public void testSimple() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/scratch/simple.kts");
            doReplTest(fileName);
        }

        @TestMetadata("simpleFun.kts")
        public void testSimpleFun() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/scratch/simpleFun.kts");
            doReplTest(fileName);
        }

        @TestMetadata("stdlibFun.kts")
        public void testStdlibFun() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/scratch/stdlibFun.kts");
            doReplTest(fileName);
        }

        @TestMetadata("unresolved.kts")
        public void testUnresolved() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/scratch/unresolved.kts");
            doReplTest(fileName);
        }

        @TestMetadata("userOutput.kts")
        public void testUserOutput() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/scratch/userOutput.kts");
            doReplTest(fileName);
        }

        @TestMetadata("var.kts")
        public void testVar() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/scratch/var.kts");
            doReplTest(fileName);
        }

        @TestMetadata("when.kts")
        public void testWhen() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/scratch/when.kts");
            doReplTest(fileName);
        }
    }

    @TestMetadata("idea/testData/scratch/multiFile")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class MultiFile extends AbstractScratchRunActionTest {
        public void testAllFilesPresentInMultiFile() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/scratch/multiFile"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, false);
        }

        @TestMetadata("inlineFun")
        public void testInlineFun() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/scratch/multiFile/inlineFun/");
            doMultiFileTest(fileName);
        }

        @TestMetadata("javaDep")
        public void testJavaDep() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/scratch/multiFile/javaDep/");
            doMultiFileTest(fileName);
        }
    }
}
