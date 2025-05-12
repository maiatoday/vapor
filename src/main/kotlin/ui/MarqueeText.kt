package ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.offset
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay
import theme.VaporColors
import theme.VaporFonts

/**
 * Marquee text that scrolls from left to right
 */
@Composable
fun MarqueeText(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = Color.White
) {
    var offset by remember { mutableStateOf(0f) }
    val textLength = text.length * 20f // Approximate width of text

    LaunchedEffect(Unit) {
        while (true) {
            delay(50) // Controls the speed of scrolling
            offset = (offset + 2f) % (textLength * 2) // Reset when it goes off screen
        }
    }

    Box(
        modifier = modifier,
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = text,
            style = VaporFonts.pressStart2PStyle.copy(
                color = color,
                fontSize = 24.sp,
                shadow = Shadow(
                    color = VaporColors.RobinEggBlue,
                    offset = Offset(2f, 2f),
                    blurRadius = 2f
                ),
                textAlign = TextAlign.Center
            ),
            modifier = Modifier.offset(x = (-textLength + offset).dp)
        )
    }
}