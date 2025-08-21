plugins {
    application
    id("java")
}

repositories {
    mavenCentral()
}

dependencies {
    // Lombok (correção: "annotationProcessor" estava escrito errado)
    compileOnly("org.projectlombok:lombok:1.18.36")
    annotationProcessor("org.projectlombok:lombok:1.18.36")

    // Dependências de teste
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.3")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")

    // Guava (opcional)
    implementation("com.google.guava:guava:32.1.3-jre")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21)) // Corrigido: uso do .set()
    }
}

application {
    mainClass.set("poo.App") // Corrigido: uso do .set()
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}