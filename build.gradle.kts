import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.3.10"
    id("org.spongepowered.plugin") version "0.8.1"
}

projectBuild()

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}