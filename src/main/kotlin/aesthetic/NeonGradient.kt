package aesthetic

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import theme.neonRobinEggBlueColors

/**
 * A linear gradient that transitions from transparent to RobinEggBlue to white
 * and back to RobinEggBlue to transparent.
 *
 * @param modifier Modifier to be applied to the gradient
 * @param width Width of the gradient
 * @param height Height of the gradient
 * @param horizontal If true, the gradient will be horizontal, otherwise vertical
 */
@Composable
fun NeonGradient(
    modifier: Modifier = Modifier,
    width: Dp = 300.dp,
    height: Dp = 100.dp,
    horizontal: Boolean = true,
    colors: List<Color> = neonRobinEggBlueColors
) {
    Canvas(modifier = modifier.size(width, height)) {
        val canvasWidth = this.size.width
        val canvasHeight = this.size.height
        
        // Create the gradient brush based on orientation
        val brush = if (horizontal) {
            Brush.linearGradient(
                colors = colors,
                start = Offset(0f, 0f),
                end = Offset(canvasWidth, 0f)
            )
        } else {
            Brush.linearGradient(
                colors = colors,
                start = Offset(0f, 0f),
                end = Offset(0f, canvasHeight)
            )
        }
        
        // Draw a rectangle with the gradient
        drawRect(brush = brush)
    }
}

