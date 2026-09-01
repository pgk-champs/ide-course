plugins {
    kotlin("jvm") version "2.4.0" apply false
}

subprojects {
    apply(plugin = "org.jetbrains.kotlin.jvm")

    repositories {
        mavenCentral()
    }

    dependencies {
        "testImplementation"(kotlin("test"))
    }

    // Задания хранят исходники прямо в src/ и test/ (без main/kotlin) —
    // так их раскладывает плагин JetBrains Academy.
    extensions.configure<org.jetbrains.kotlin.gradle.dsl.KotlinJvmProjectExtension> {
        sourceSets {
            getByName("main").kotlin.srcDirs("src")
            getByName("test").kotlin.srcDirs("test")
        }
    }

    tasks.withType<Test> {
        useJUnitPlatform()
    }
}
