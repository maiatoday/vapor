# Vapor

A simple desktop application built with Jetpack Compose for Desktop.

## Introduction
Vapor is a desktop application built with Jetpack Compose for Desktop, a modern UI toolkit for Kotlin. The application is a sample demonstration of various graphic techniques in Compose.

## Project Details
- **Group ID**: net.maiatoday
- **Version**: 1.0-SNAPSHOT
- **Package Name**: vapor
- **Package Version**: 1.0.0

## Technology Stack
- **Language**: Kotlin
- **UI Framework**: Jetpack Compose for Desktop
- **Build System**: Gradle (Kotlin DSL)
- **Kotlin Version**: 2.1.20-RC3
- **Compose Version**: 1.7.0

## Features
The application currently demonstrates a simple UI with a button that changes text when clicked, showcasing the reactive nature of Compose:
- Initial text: "Hello, World!"
- After clicking: "Hello, Desktop!"

## Project Structure
- **src/main/kotlin**: Contains the Kotlin source code
  - **Main.kt**: Entry point of the application with the Compose UI implementation
- **build.gradle.kts**: Gradle build configuration
- **gradle.properties**: Gradle and project properties
- **gradle/libs.versions.toml**: Dependency version management

## Build and Distribution
The project is configured to generate native distributions for:
- macOS (DMG)
- Windows (MSI)
- Linux (DEB)

## Getting Started
To run the application locally:
1. Clone the repository
2. Open the project in IntelliJ IDEA or another IDE that supports Kotlin
3. Run the `main` function in `Main.kt`

Alternatively, you can run it from the command line:
```
./gradlew run
```
