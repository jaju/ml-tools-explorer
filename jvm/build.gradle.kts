import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.dsl.KotlinVersion
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    java
    kotlin("jvm") version "2.0.21"
}

java {
    sourceCompatibility = JavaVersion.VERSION_22
    targetCompatibility = JavaVersion.VERSION_22
}

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
