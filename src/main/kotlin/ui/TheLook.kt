package ui

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

val foreGroundColor = Color.Black

// 👀Goto file MeshGradient first
//val foreGroundColor = Color.White

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

    Box(modifier = Modifier.fillMaxSize()) {
//    Box(modifier = Modifier.fillMaxSize().meshGradient(colorPoints1)) { // ⬅️👀
        Column {
            // Display Hello World with blinking cursor
            Row {
                Text(
                    text = text + if (showCursor) "_" else "",
                    modifier = Modifier.padding(16.dp),
                    color = foreGroundColor
                )
            }


            //region 👀 Display the color palette
           // PaletteDisplay(textColor = foreGroundColor)
            //endregion


            //region 👀 Display the sample quirky fonts
//            SampleQuirkyFont(
//                text = "Press Start 2 Play",
//                style = VaporFonts.pressStart2PStyle,
//                color = foreGroundColor
//            )
//
//            SampleQuirkyFont(
//                text = "Rubick Glitch",
//                style = VaporFonts.rubikGlitchStyle,
//                color = foreGroundColor
//            )
//
//            SampleQuirkyFont(
//                text = "Monoton",
//                style = VaporFonts.monotonStyle,
//                color = foreGroundColor
//            )
//
//            SampleQuirkyFont(
//                text = "Neon der Thaw",
//                style = VaporFonts.neonderthawStyle,
//                color = foreGroundColor
//            )
//
//            SampleQuirkyFont(
//                text = "DotGothic16",
//                style = VaporFonts.dotGothic16Style,
//                color = foreGroundColor
//            )
//            // Display the sample quirky fonts
//            SampleQuirkyFont(
//                text = "github.com/maiatoday/vapor",
//                style = VaporFonts.pressStart2PStyle,
//                color = foreGroundColor
//            )
            //endregion
        }
    }
}
