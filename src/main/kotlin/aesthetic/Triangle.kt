package aesthetic

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import theme.VaporColors

/**
 * Equilateral triangle filled with a gradient
 * made from three colors from the VaporPalette.
 *
 * @param modifier Modifier to be applied to the triangle
 * @param size Size of the triangle (width and height)
 * @param color1 First color for the gradient (default: VaporColors.Mulberry)
 * @param color2 Second color for the gradient (default: VaporColors.RobinEggBlue)
 * @param color3 Third color for the gradient (default: VaporColors.Glaucous)
 */
@Composable
fun Triangle(
    modifier: Modifier = Modifier,
    size: Dp = 200.dp,
    color1: Color = VaporColors.Mulberry,
    color2: Color = VaporColors.RobinEggBlue,
    color3: Color = VaporColors.Glaucous
) {
    Canvas(modifier = modifier.size(size)) {
        val width = this.size.width
        val height = this.size.height
        
        // Calculate the points of the equilateral triangle
        val topPoint = Offset(width / 2f, 0f)
        val bottomLeftPoint = Offset(0f, height)
        val bottomRightPoint = Offset(width, height)
        
        // Create a path for the triangle
        val path = Path().apply {
            moveTo(topPoint.x, topPoint.y)
            lineTo(bottomLeftPoint.x, bottomLeftPoint.y)
            lineTo(bottomRightPoint.x, bottomRightPoint.y)
            close()
        }
        
        // Create a gradient brush with the three colors
        val brush = Brush.linearGradient(
            colors = listOf(color1, color2, color3),
            start = topPoint,
            end = Offset(width / 2f, height)
        )
        
        // Draw the triangle with the gradient
        drawPath(
            path = path,
            brush = brush
        )
    }
}