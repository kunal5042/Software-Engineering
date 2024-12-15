```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		 xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>3.3.4</version>
		<relativePath/> <!-- lookup parent from repository -->
	</parent>
	<groupId>com.linkedin.kunal5042</groupId>
	<artifactId>demo</artifactId>
	<version>0.0.1-SNAPSHOT</version>
	<name>QueryBase</name>
	<description> QueryBase is an internal knowledge-sharing and collaboration platform designed to streamline communication among developers, tech leads, and managers within the company. It serves as a centralized hub where team members can document, discuss, and access technical solutions, best practices, and recurring issues.  The platform promotes cross-functional collaboration by breaking down silos, enabling employees to engage in open discussions without the need for excessive meetings or scattered conversations across different tools. By providing a dynamic, searchable knowledge base, QueryBase helps reduce the time spent solving problems, fosters innovation, and ensures institutional knowledge is retained, even when employees leave.  Key features include upvoting and reviewing answers, integration with tools like JIRA and Confluence, dynamic documentation that evolves over time, and robust security to protect sensitive company information. QueryBase encourages a culture of recognition for knowledge sharing, making it a valuable tool for developers, tech leads, and management to enhance productivity and foster a collaborative, tech-driven environment.</description>
	<url/>
	<licenses>
		<license/>
	</licenses>
	<developers>
		<developer>
			<email> kunalwadhwa.cse@gmail.com</email>
		</developer>
	</developers>
	<scm>
		<connection/>
		<developerConnection/>
		<tag/>
		<url/>
	</scm>
	<properties>
		<java.version>17</java.version>
		<spring-ai.version>1.0.0-M3</spring-ai.version>
	</properties>
	<dependencies>
<!--		Purpose: Provides production-ready features such as monitoring and management endpoints for Spring Boot applications.
Use Case: When you want to expose operational endpoints (like health, metrics, etc.) for your application.
-->
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-actuator</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jdbc</artifactId>
		</dependency>
<!--		Purpose: Adds support for Spring Data JPA, enabling easy interaction with JPA-based data access.
Use Case: When you need to use Java Persistence API (JPA) for database operations with an ORM like Hibernate.
-->
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-mongodb</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-redis</artifactId>
		</dependency>
<!--		Purpose: Allows you to expose Spring Data repositories as RESTful endpoints automatically.
Use Case: When you want to quickly create a RESTful API for your data repositories.
-->
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-rest</artifactId>
		</dependency>
<!--		Purpose: Provides support for JDBC operations in Spring applications.
Use Case: When you need to execute SQL queries directly without using an ORM.
-->
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-jdbc</artifactId>
		</dependency>
<!--		Purpose: Provides support for sending emails via JavaMailSender.
Use Case: When your application needs to send email notifications.
-->
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-mail</artifactId>
		</dependency>
<!--		Purpose: Provides support for OAuth2 client functionalities.
Use Case: When your application needs to authenticate users using OAuth2 providers like Google or Facebook.
-->
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-oauth2-client</artifactId>
		</dependency>
<!--		Purpose: Adds security features to your Spring application, including authentication and authorization.
Use Case: When you need to secure your application and restrict access to certain endpoints.
-->
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-security</artifactId>
		</dependency>
<!--		Purpose: Provides support for building web applications, including RESTful APIs.
Use Case: When you are developing a web application with Spring Boot.
-->
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
<!--		Purpose: A client library for building applications and microservices where the input and output data are stored in Kafka clusters.
Use Case: When you want to process data streams from Kafka.
-->
		<dependency>
			<groupId>org.apache.kafka</groupId>
			<artifactId>kafka-streams</artifactId>
		</dependency>
<!--		Purpose: A starter for integrating Ollama with Spring Boot.
Use Case: When you want to use Ollama in your Spring application for AI functionalities.
-->
		<dependency>
			<groupId>org.springframework.ai</groupId>
			<artifactId>spring-ai-ollama-spring-boot-starter</artifactId>
		</dependency>
<!--		Purpose: Provides integration with Apache Kafka for Spring applications.
Use Case: When you want to produce or consume messages to/from Kafka topics.
-->
		<dependency>
			<groupId>org.springframework.kafka</groupId>
			<artifactId>spring-kafka</artifactId>
		</dependency>
<!--		Purpose: Provides support for event-driven architecture in Modulith applications.
Use Case: When you want to implement event-driven patterns in a modular application.
-->
<!--		<dependency>-->
<!--			<groupId>org.springframework.modulith</groupId>-->
<!--			<artifactId>spring-modulith-events-api</artifactId>-->
<!--		</dependency>-->
<!--		Purpose: The core module of Spring Modulith for building modular applications.
Use Case: When you are building a modular application using Spring Modulith.
-->
<!--		<dependency>-->
<!--			<groupId>org.springframework.modulith</groupId>-->
<!--			<artifactId>spring-modulith-starter-core</artifactId>-->
<!--		</dependency>-->
<!--		Purpose: Provides JDBC support in a Spring Modulith application.
Use Case: When you need to interact with relational databases in a modular architecture.
-->
<!--		<dependency>-->
<!--			<groupId>org.springframework.modulith</groupId>-->
<!--			<artifactId>spring-modulith-starter-jdbc</artifactId>-->
<!--		</dependency>-->
<!--		<dependency>-->
<!--			<groupId>org.springframework.modulith</groupId>-->
<!--			<artifactId>spring-modulith-starter-jpa</artifactId>-->
<!--		</dependency>-->
<!--		<dependency>-->
<!--			<groupId>org.springframework.modulith</groupId>-->
<!--			<artifactId>spring-modulith-starter-mongodb</artifactId>-->
<!--		</dependency>-->
		<dependency>
			<groupId>org.springframework.session</groupId>
			<artifactId>spring-session-data-redis</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.session</groupId>
			<artifactId>spring-session-jdbc</artifactId>
		</dependency>
<!--		Purpose: Provides tools for improving the development experience, such as automatic restarts and live reload.
Use Case: When you want a smoother development experience with automatic updates.
-->
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-devtools</artifactId>
			<scope>runtime</scope>
			<optional>true</optional>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-docker-compose</artifactId>
			<scope>runtime</scope>
			<optional>true</optional>
		</dependency>
		<dependency>
			<groupId>org.springframework.ai</groupId>
			<artifactId>spring-ai-spring-boot-docker-compose</artifactId>
			<scope>runtime</scope>
			<optional>true</optional>
		</dependency>
		<dependency>
			<groupId>org.projectlombok</groupId>
			<artifactId>lombok</artifactId>
			<optional>true</optional>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-testcontainers</artifactId>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>org.springframework.ai</groupId>
			<artifactId>spring-ai-spring-boot-testcontainers</artifactId>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>org.springframework.kafka</groupId>
			<artifactId>spring-kafka-test</artifactId>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>org.springframework.restdocs</groupId>
			<artifactId>spring-restdocs-mockmvc</artifactId>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>org.springframework.security</groupId>
			<artifactId>spring-security-test</artifactId>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>org.testcontainers</groupId>
			<artifactId>junit-jupiter</artifactId>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>org.testcontainers</groupId>
			<artifactId>kafka</artifactId>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>org.testcontainers</groupId>
			<artifactId>mongodb</artifactId>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>org.testcontainers</groupId>
			<artifactId>ollama</artifactId>
			<scope>test</scope>
		</dependency>
	</dependencies>
	<dependencyManagement>
		<dependencies>
			<dependency>
				<groupId>org.springframework.ai</groupId>
				<artifactId>spring-ai-bom</artifactId>
				<version>${spring-ai.version}</version>
				<type>pom</type>
				<scope>import</scope>
			</dependency>
		</dependencies>
	</dependencyManagement>

	<build>
		<plugins>
			<plugin>
				<groupId>org.asciidoctor</groupId>
				<artifactId>asciidoctor-maven-plugin</artifactId>
				<version>2.2.1</version>
				<executions>
					<execution>
						<id>generate-docs</id>
						<phase>prepare-package</phase>
						<goals>
							<goal>process-asciidoc</goal>
						</goals>
						<configuration>
							<backend>html</backend>
							<doctype>book</doctype>
						</configuration>
					</execution>
				</executions>
				<dependencies>
					<dependency>
						<groupId>org.springframework.restdocs</groupId>
						<artifactId>spring-restdocs-asciidoctor</artifactId>
						<version>${spring-restdocs.version}</version>
					</dependency>
				</dependencies>
			</plugin>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
				<configuration>
					<excludes>
						<exclude>
							<groupId>org.projectlombok</groupId>
							<artifactId>lombok</artifactId>
						</exclude>
					</excludes>
				</configuration>
			</plugin>
		</plugins>
	</build>
	<repositories>
		<repository>
			<id>spring-milestones</id>
			<name>Spring Milestones</name>
			<url>https://repo.spring.io/milestone</url>
			<snapshots>
				<enabled>false</enabled>
			</snapshots>
		</repository>
	</repositories>

</project>

```

