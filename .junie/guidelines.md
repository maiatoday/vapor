# Vapor Project Overview

## Introduction
Vapor is a desktop application built with Jetpack Compose for Desktop, a modern UI toolkit for Kotlin. The application is a sample demonstration of various graphic techniques in Compose. It is loosely inspired by vaporwave images found in tho `docs/look` folder. 

## Project Details
- **Group ID**: net.maiatoday
- **Version**: 1.0-SNAPSHOT
- **Package Name**: vapor
- **Package Version**: 1.0.0

## Technology Stack
- **Language**: Kotlin
- **UI Framework**: Jetpack Compose for Desktop
- **Build System**: Gradle (Kotlin DSL)
- **Kotlin Version**: 2.0.21
- **Compose Version**: 1.7.0

## Project Structure
- **src/main/kotlin**: Contains the Kotlin source code
  - **Main.kt**: Entry point of the application with the Compose UI implementation
- **build.gradle.kts**: Gradle build configuration
- **gradle.properties**: Gradle and project properties

## Getting Started
To run the application locally:
1. Clone the repository
2. Open the project in IntelliJ IDEA or another IDE that supports Kotlin
3. Run the `main` function in `Main.kt`
4. For hot reload run `./gradlew runHot` task

## Development Guidelines
When contributing to this project, please follow these guidelines:
- Use the official Kotlin code style\
- Follow the Compose best practices for UI development
- Prefer adding new techniques as separate re-usable composable functions
- Document your code appropriately
- Do not write any tests as this is a demonstration project.
- For each task that you complete, add all the modifications in git, and create a git commit when you're done. The message for the commit should be your summary line of the task.
- Do not rerun the project after each task as it is continuously running with hot reload