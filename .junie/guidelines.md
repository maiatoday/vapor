# Vapor Project Overview

## Introduction
Vapor is a desktop application built with Jetpack Compose for Desktop, a modern UI toolkit for Kotlin. The application is a sample demonstration of various graphic techniques in Compose. It is loosely inspired by vaporwave images found in tho `docs/look` folder. It recreates visual elements in the vaporwave aesthetic.

## Project Details
- **Group ID**: net.maiatoday
- **Version**: 1.0-SNAPSHOT
- **Package Name**: vapor
- **Package Version**: 1.0.0

## Technology Stack
- **Language**: Kotlin
- **UI Framework**: Jetpack Compose for Desktop
- **Build System**: Gradle (Kotlin DSL)
- **Kotlin Version**: 2.1.20
- **Compose Version**: 1.7.0

## Project Structure
- **src/main/kotlin**: Contains the Kotlin source code
  - **Main.kt**: Entry point of the application with the Compose UI implementation
  - **aesthetic/**: Contains aesthetic-related components
    - **Triangle.kt**: Component for rendering triangles
  - **theme/**: Contains theme-related components
    - **ColorChip.kt**: Component for displaying color samples
    - **PaletteDisplay.kt**: Component for displaying color palettes
    - **SampleQuirkyFont.kt**: Component for demonstrating custom fonts
    - **VaporColors.kt**: Defines the color scheme for the vaporwave theme
    - **VaporFonts.kt**: Defines the fonts used in the application
    - **VaporTheme.kt**: Defines the overall theme of the application
  - **ui/**: Contains UI components
    - **AllTheThings.kt**: Component that combines multiple UI elements
    - **Solo.kt**: Component for displaying individual elements
    - **TheLook.kt**: Component that defines the overall visual style
- **src/main/resources/**: Contains application resources
  - **fonts/**: Contains custom font files
- **docs/look/**: Contains vaporwave inspiration images
- **build.gradle.kts**: Gradle build configuration
- **gradle.properties**: Gradle and project properties

## Getting Started
To run the application locally:
1. Clone the repository
2. For hot reload run `./gradlew runHot` task

## Development Guidelines
When contributing to this project, please follow these guidelines:
- Use the official Kotlin code style
- Follow the Compose best practices for UI development
- Prefer adding new techniques as separate re-usable composable functions
- Put reusable composable functions in separate kotlin files
- Cleanup by removing any unused imports
- Document your code appropriately
- Do not write any tests as this is a demonstration project
- Do not rerun the project after each task as it is continuously running with hot reload
