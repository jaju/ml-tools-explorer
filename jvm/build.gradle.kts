plugins {
    java
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(22)
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
