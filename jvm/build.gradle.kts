import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.dsl.KotlinVersion
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    java
    kotlin("jvm") version "2.0.20"
}

tasks {
    withType<JavaCompile>().configureEach {
        options.compilerArgs.add("--enable-preview")
        options.compilerArgs.add("-Xlint:preview")
        options.compilerArgs.add("--add-modules=jdk.incubator.vector")
        options.release.set(22)
    }

    withType<KotlinCompile>().configureEach {
        compilerOptions {
            apiVersion.set(KotlinVersion.KOTLIN_2_0)
            jvmTarget.set(JvmTarget.JVM_22)
        }
        kotlinDaemonJvmArguments.add("--enable-preview")
        kotlinDaemonJvmArguments.add("--add-modules=jdk.incubator.vector")
    }

    withType<JavaExec>().configureEach {
        jvmArgs(
            "--enable-preview",
            "--enable-native-access=ALL-UNNAMED",
            "--add-modules=jdk.incubator.vector"
        )
    }
}

repositories {
    mavenLocal()
    mavenCentral()
}
