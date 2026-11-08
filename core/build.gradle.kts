plugins {
    `java-library`
    alias(libs.plugins.kotlin.jvm)
}

group = "com.triple3.gym"
version = "1.0.0"

kotlin {
    jvmToolchain(21)
}

dependencies {
    api(libs.coroutines.core)

    testImplementation(kotlin("test"))
    testImplementation(libs.coroutines.test)
}

tasks.test {
    useJUnitPlatform()
}