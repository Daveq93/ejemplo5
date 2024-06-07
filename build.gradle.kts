plugins {
    id("java")
    id("io.quarkus") version "3.11.1"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

java{
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

val quarkusVersion = "3.11.1"

dependencies {
    implementation(enforcedPlatform("io.quarkus:quarkus-bom:${quarkusVersion}"))
    //arc es el motor cdi
    implementation("io.quarkus:quarkus-arc") //CDI: sirve para no poner la version en las dependencias
    implementation("io.quarkus:quarkus-resteasy-reactive")//REST: version de jaxrs en su version reactiva
    implementation("io.quarkus:quarkus-resteasy-reactive-jackson")//JSON

    //implementation("io.quarkus:quarkus-hibernate-orm-panache")//JPA+Hibernate
    //implementation("com.h2database:h2:2.2.224")
}
