plugins {
    id("application")
    id("org.sonarqube") version "7.2.3.8318"
}

application {
    // Define the main class for the application.
    mainClass = "hexlet.code.App"
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.test {
    useJUnitPlatform()
}

sonar {
  properties {
    property "sonar.projectKey", "littlec0rgi_third-app"
    property "sonar.organization", "littlec0rgi"
  }
}