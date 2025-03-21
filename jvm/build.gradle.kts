import org.gradle.internal.deployment.RunApplication
import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.dsl.KotlinVersion
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    java
    kotlin("jvm") version "2.1.10"
}

java {
    sourceCompatibility = JavaVersion.VERSION_23
    targetCompatibility = JavaVersion.VERSION_23
}

kotlin { jvmToolchain(23) }

tasks {
    withType<JavaCompile>().configureEach {
        options.compilerArgs.run {
            //            add("--enable-preview")
            add("-Xlint:preview")
            add("--add-modules=jdk.incubator.vector")
        }
    }

    withType<KotlinCompile>().configureEach {
        compilerOptions {
            apiVersion.set(KotlinVersion.KOTLIN_2_1)
            jvmTarget.set(JvmTarget.JVM_23)
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

    withType<RunApplication>().configureEach {
        kotlin {
            arguments.addAll(
                    listOf(
                            "--enable-preview",
                            "--enable-native-access=ALL-UNNAMED",
                            "--add-modules=jdk.incubator.vector"
                    )
            )
        }
    }
}

repositories {
    mavenLocal()
    mavenCentral()
}
