import org.jetbrains.compose.desktop.application.dsl.TargetFormat

plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.kotlin.compose)
    alias(libs.plugins.compose.multiplatform)
}

group = "triple3"
version = "1.0.0"

kotlin {
    jvmToolchain(21)
}

dependencies {
    implementation(project(":core"))

    implementation(compose.desktop.currentOs)
    implementation(compose.material3)
    implementation(libs.coroutines.swing)

    testImplementation(kotlin("test"))
}

compose.desktop {
    application {
        mainClass = "triple3.MainKt"

        nativeDistributions {
            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
            packageName = "Triple3Gym"
            packageVersion = "1.0.0"
        }
    }
}

tasks.test {
    useJUnitPlatform()
}