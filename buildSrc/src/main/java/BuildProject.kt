import org.gradle.kotlin.dsl.*

fun KotlinBuildScript.projectBuild() {

    group = "com.m4kvn"
    version = "1.0-SNAPSHOT"

    repositories {
        mavenCentral()
    }

    dependencies {
        implementation(kotlin("stdlib-jdk8"))
        implementation(Dependencies.sponge)
    }
}