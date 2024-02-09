plugins {
    java
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

tasks.compileJava {
    options.compilerArgs.add("--enable-preview")
    options.compilerArgs.add("--add-modules=jdk.incubator.vector")
}

tasks.withType<JavaExec>().configureEach {
    jvmArgs("--enable-preview",
        "--add-modules=jdk.incubator.vector",
        "--enable-native-access",
        "ALL-UNNAMED")
}
