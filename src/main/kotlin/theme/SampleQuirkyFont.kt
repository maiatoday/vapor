package theme

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

/**
 * Displays sample text using a specified font style
 * @param text The text to display, defaults to "Press Start 2 Play"
 * @param style The text style to use, defaults to Press_Start_2P font style
 */
@Composable
fun SampleQuirkyFont(
    text: String = "Press Start 2 Play",
    style: TextStyle = VaporFonts.pressStart2PStyle,
    color: Color = Color.Unspecified,
) {
    Text(
        text = text,
        style = style,
        modifier = Modifier.fillMaxWidth().padding(16.dp),
        textAlign = TextAlign.Center,
        color = color
    )
}
