package ui

import aesthetic.colorPoints1
import aesthetic.meshGradient
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay
import theme.PaletteDisplay
import theme.SampleQuirkyFont
import theme.VaporFonts

/**
 * Hello world. A place to start and setup fonts and colors
 */
@Composable
fun TheLook() {
    val text = "Hello, World!"
    var showCursor by remember { mutableStateOf(true) }

    // Blinking cursor effect
    LaunchedEffect(Unit) {
        while (true) {
            delay(500) // 500ms blink rate
            showCursor = !showCursor
        }
    }

    Box(modifier = Modifier.fillMaxSize().meshGradient(colorPoints1)) {
        Column {
            // Display Hello World with blinking cursor
            Row {
                Text(
                    text = text + if (showCursor) "_" else "",
                    modifier = Modifier.padding(16.dp),
                    color = Color.White
                )
            }

            // Display the color palette
            PaletteDisplay(textColor = Color.White)

            // Display the sample quirky fonts
            SampleQuirkyFont(
                text = "Press Start 2 Play",
                style = VaporFonts.pressStart2PStyle,
                color = Color.White
            )

            SampleQuirkyFont(
                text = "Rubick Glitch",
                style = VaporFonts.rubikGlitchStyle,
                color = Color.White
            )

            SampleQuirkyFont(
                text = "Monoton",
                style = VaporFonts.monotonStyle,
                color = Color.White
            )

            SampleQuirkyFont(
                text = "Neon der Thaw",
                style = VaporFonts.neonderthawStyle,
                color = Color.White
            )

            SampleQuirkyFont(
                text = "DotGothic16",
                style = VaporFonts.dotGothic16Style,
                color = Color.White
            )
        }
    }
}
