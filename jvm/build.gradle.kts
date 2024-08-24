import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.dsl.KotlinVersion

plugins {
    java
    kotlin("jvm") version "2.0.20"
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(22)
    }
}

kotlin {
    compilerOptions {
        apiVersion.set(org.jetbrains.kotlin.gradle.dsl.KotlinVersion.KOTLIN_2_0)
        jvmTarget.set(JvmTarget.JVM_22)
    }
    javaToolchains {
        jvmToolchain(22)
    }
}

tasks.compileJava {
    options.compilerArgs.add("--enable-preview")
    options.compilerArgs.add("--add-modules=jdk.incubator.vector")
    options.compilerArgs.add("-Xlint:preview")
}

tasks.withType<JavaExec>().configureEach {
    jvmArgs("--enable-preview",
        "--add-modules=jdk.incubator.vector",
        "--enable-native-access",
        "ALL-UNNAMED")
}

tasks.compileKotlin {
    compilerOptions {
        languageVersion.set(KotlinVersion.KOTLIN_2_0)
        jvmTarget.set(JvmTarget.JVM_22)
    }
}

repositories {
    mavenCentral()
}
