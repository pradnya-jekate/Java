🔧 What is Maven?
Maven is a build automation and project management tool used primarily for Java projects, though it can be used for other languages too. It uses an XML file (pom.xml) to describe the project, its dependencies, build settings, and more.

🧱 Key Concepts
1. POM (Project Object Model)
File: pom.xml

Central to every Maven project.

Contains:

Project info (name, version, description)

Dependencies (external libraries)

Plugins (to add custom build behavior)

Build configuration

2. Dependencies
Libraries your project needs.

Managed from Maven Central Repository (or others like JCenter, custom repos).

Automatically downloaded to your local .m2 cache.

Example:

xml
Copy
Edit
<dependency>
  <groupId>org.springframework</groupId>
  <artifactId>spring-core</artifactId>
  <version>5.3.20</version>
</dependency>
3. Repositories
Local: .m2/repository (on your machine)

Remote: Maven Central, custom URLs

4. Phases of Maven Build Lifecycle
validate – Validate the project structure

compile – Compile the source code

test – Run unit tests

package – Package compiled code (e.g., into .jar)

install – Install package into local repo

deploy – Deploy to remote repo

🛠 Common Maven Commands
Command	Description
mvn compile	Compiles source code
mvn test	Runs unit tests
mvn package	Packages into JAR/WAR
mvn install	Installs into local repo
mvn clean	Deletes target directory
mvn exec:java -Dexec.mainClass="com.example.Main"	Runs the main class

📦 Directory Structure
bash
Copy
Edit
project/
├── pom.xml
└── src/
    ├── main/
    │   └── java/
    │       └── com/example/App.java
    └── test/
        └── java/
            └── com/example/AppTest.java
🌐 Maven Central
Default repository for most libraries.

You can browse: https://search.maven.org

✅ Advantages
Handles dependencies automatically

Standardized build lifecycle

Easy project setup with archetypes

Supports plugins and profiles

