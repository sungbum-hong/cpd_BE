plugins {
	java
	id("org.springframework.boot") version "4.0.0"
	id("io.spring.dependency-management") version "1.1.7"
}

group = "com.codiyoung"
version = "0.0.1-SNAPSHOT"
description = "Demo project for Spring Boot"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(21)
	}
}

configurations {
	compileOnly {
		extendsFrom(configurations.annotationProcessor.get())
	}
}

repositories {
	mavenCentral()
}

dependencies {
	// Spring Boot 기본
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")

    //웹소켓
    implementation ("org.springframework.boot:spring-boot-starter-web")
    implementation ("org.springframework.boot:spring-boot-starter-websocket")

    //oauth2

    implementation ("org.springframework.boot:spring-boot-starter-oauth2-client")

    //시큐리티
    implementation ("org.springframework.boot:spring-boot-starter-security")
    testImplementation ("org.springframework.boot:spring-boot-starter-test")
   	testImplementation ("org.springframework.security:spring-security-test")


	// Lombok
	compileOnly("org.projectlombok:lombok")
	annotationProcessor("org.projectlombok:lombok")

	// DB
	runtimeOnly("com.mysql:mysql-connector-j")
	runtimeOnly("com.h2database:h2")

	// 테스트
	testImplementation("org.springframework.boot:spring-boot-starter-test")

	//jwt
    	implementation ("io.jsonwebtoken:jjwt-api:0.12.3")
    	implementation ("io.jsonwebtoken:jjwt-impl:0.12.3")
    	implementation ("io.jsonwebtoken:jjwt-jackson:0.12.3")

}

tasks.withType<Test> {
	useJUnitPlatform()
}
