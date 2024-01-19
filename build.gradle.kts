plugins {
    id("java")
}

group = "jdk026.hw6"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.1")
}

tasks.jar {
    manifest {
        attributes(
                "Main-Class" to "jdk026.hw6.Main"
        )
    }
    from(sourceSets.main.get().output)
}

tasks.test {
    useJUnitPlatform()
}

sourceSets {
    main {
        java.srcDirs("src")
    }
}
