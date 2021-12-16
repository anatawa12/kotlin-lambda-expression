plugins {
    kotlin("jvm") version "1.6.10"
    id("com.github.johnrengelman.shadow") version "7.+"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
    implementation(kotlin("stdlib-jdk8"))
    implementation("org.ow2.asm:asm-util:9.2")
}

tasks.shadowJar.get().classifier = ""
tasks.jar.get().enabled = false
tasks.assemble.get().dependsOn(tasks.shadowJar)
