import org.gradle.kotlin.dsl.KotlinBuildScript
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.kotlin
import org.gradle.kotlin.dsl.repositories

fun KotlinBuildScript.projectBuild() {

    repositories {
        mavenCentral()
    }

    dependencies {
        implementation(kotlin("stdlib-jdk8"))
    }
}