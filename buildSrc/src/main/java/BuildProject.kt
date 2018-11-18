import org.gradle.kotlin.dsl.KotlinBuildScript
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.kotlin
import org.gradle.kotlin.dsl.repositories

fun KotlinBuildScript.projectBuild() {

    group = Properties.pluginGroup
    version = Properties.pluginVersion

    repositories {
        mavenCentral()
    }

    dependencies {
        implementation(kotlin("stdlib-jdk8"))
        implementation(Dependencies.sponge)
    }
}