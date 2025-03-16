# Vapor Project Overview

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
- **Kotlin Version**: 2.0.21
- **Compose Version**: 1.7.0

## Features
The application currently demonstrates a simple UI with a button that changes text when clicked, showcasing the reactive nature of Compose.

## Project Structure
- **src/main/kotlin**: Contains the Kotlin source code
  - **Main.kt**: Entry point of the application with the Compose UI implementation
- **build.gradle.kts**: Gradle build configuration
- **gradle.properties**: Gradle and project properties

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

## Development Guidelines
When contributing to this project, please follow these guidelines:
- Use the official Kotlin code style\
- Follow the Compose best practices for UI development
- Document your code appropriately
- Do not write any tests as this is a demonstration project.
- For each task that you complete, add all the modifications in git, and create a git commit when you're done. The message for the commit should be your summary line of the task.