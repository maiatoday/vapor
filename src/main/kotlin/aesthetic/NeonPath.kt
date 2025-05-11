package aesthetic

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import theme.neonRobinEggBlueColors

/**
 * A neon path that uses the linear gradient from transparent to RobinEggBlue to white
 * and back to RobinEggBlue to transparent.
 *
 * @param modifier Modifier to be applied to the path
 * @param width Width of the canvas
 * @param height Height of the canvas
 * @param strokeWidth Width of the path stroke
 */
@Composable
fun NeonPath(
    modifier: Modifier = Modifier,
    width: Dp = 300.dp,
    height: Dp = 300.dp,
    strokeWidth: Float = 10f,
    colors: List<Color> = neonRobinEggBlueColors
) {
    Canvas(modifier = modifier.size(width, height)) {
        val canvasWidth = this.size.width
        val canvasHeight = this.size.height
        
        // Create a path
        val path = Path().apply {
            // Start at the top left
            moveTo(canvasWidth * 0.1f, canvasHeight * 0.1f)
            
            // Draw a wavy line
            quadraticTo(
                canvasWidth * 0.5f, canvasHeight * 0.9f,
                canvasWidth * 0.9f, canvasHeight * 0.1f
            )

            // Add another curve
            quadraticTo(
                canvasWidth * 0.7f, canvasHeight * 0.5f,
                canvasWidth * 0.9f, canvasHeight * 0.9f
            )

            // Connect back to the start
            quadraticTo(
                canvasWidth * 0.3f, canvasHeight * 0.7f,
                canvasWidth * 0.1f, canvasHeight * 0.1f
            )
        }
        
        // Create the gradient brush along the path
        val brush = Brush.linearGradient(
            colors = colors,
            start = Offset(0f, 0f),
            end = Offset(canvasWidth, canvasHeight)
        )
        
        // Draw the path with the gradient
        drawPath(
            path = path,
            brush = brush,
            style = Stroke(
                width = strokeWidth,
                cap = StrokeCap.Round
            )
        )
    }
}