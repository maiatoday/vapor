#!/usr/bin/env kotlin

import java.util.Scanner

data class Tag(val tag:String, val description:String)

val tags = listOf(
    Tag("01-start", "start here"),
    Tag("02-palette", "A tastefully curated palette"),
    Tag("03-quirkyFonts", "quirky fonts"),
    Tag("04-triangle", "a gradient equilateral triangle"),
    Tag("05-vanishingFloor", "a vanishing floor tiled or mulberry lines"),
    Tag("06-dolphins", "at least one dolphin"),
    Tag("07-marble", "a pink marble statue"),
    Tag("08-sunset", "a retro sunset"),
    Tag("09-cassette", "retro pixelated cassettes"),
    Tag("10-matrixBlur", "color shifts and blur"),
    Tag("11-meshGradient", "mesh gradient in pastel"),
    Tag("12-palmTree", "a non disappearing Neon Palm tree"),
    Tag("13-whatReloaded", "なに!?  Reloaded title"),
    Tag("14-holofoil", "Holo foil appropriated from the jewel demo"),
    Tag("15-glitch", "double modifier holo foil and glitch"),
    Tag("end", "all of the things")
)

println("Starting tag checkout process...")

// Function to execute git checkout command
fun checkoutTag(tag: Tag) {
    println("Checking out tag: $tag")
    val process = ProcessBuilder("git", "checkout", tag.tag)
        .redirectOutput(ProcessBuilder.Redirect.INHERIT)
        .redirectError(ProcessBuilder.Redirect.INHERIT)
        .start()

    val exitCode = process.waitFor()
    if (exitCode == 0) {
        println("Successfully checked out tag: $tag")
    } else {
        println("Failed to checkout tag: $tag (exit code: $exitCode)")
    }
}

// Loop through each tag, checkout, and pause
for (tagItem in tags) {
    checkoutTag(tagItem)

    // Skip pause after the last tag
    if (tagItem != tags.last()) {
        println("Press Enter to continue to the next checkout...")
        val scanner = Scanner(System.`in`)
        scanner.nextLine() // Wait for user to press Enter
    }
}

println("Tag checkout process completed!")
