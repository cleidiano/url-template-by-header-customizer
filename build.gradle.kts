plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    implementation("io.opentelemetry:opentelemetry-sdk-extension-autoconfigure:1.56.0")
    implementation("com.google.auto.service:auto-service:1.1.1")
    implementation("io.opentelemetry.instrumentation:opentelemetry-instrumentation-api-incubator:2.22.0-alpha")
    annotationProcessor("com.google.auto.service:auto-service:1.1.1")
}

tasks.jar {
    manifest {
        attributes["Main-Class"] = "org.example.Main"
    }
}

tasks.test {
    useJUnitPlatform()
}
java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(11))
    }
}