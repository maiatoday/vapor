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
import theme.VaporColors

/**
 * A sunset represented by a circle with a gradient from top to bottom
 * using colors from the VaporPalette.
 *
 * @param modifier Modifier to be applied to the sunset
 * @param size Size of the circle (diameter)
 * @param topColor Top color for the gradient (default: VaporColors.Buff)
 * @param middleColor Middle color for the gradient (default: VaporColors.Mulberry)
 * @param bottomColor Bottom color for the gradient (default: VaporColors.RoyalPurple)
 */
@Composable
fun Sunset(
    modifier: Modifier = Modifier,
    size: Dp = 200.dp,
    topColor: Color = VaporColors.Buff,
    middleColor: Color = VaporColors.Mulberry,
    bottomColor: Color = VaporColors.RoyalPurple,
    retro:Boolean = true
) {
    Canvas(modifier = modifier.size(size)) {
        val width = this.size.width
        val height = this.size.height
        val radius = minOf(width, height) / 2f
        val center = Offset(width / 2f, height / 2f)

        // Create a gradient brush with the three colors from top to bottom
        val brushFull = Brush.verticalGradient(
            colors = listOf(topColor, middleColor, bottomColor),
            startY = 0f,
            endY = height
        )
        // Create a gradient brush with horizontal transparent bands
        val brushRetro = Brush.verticalGradient(
            colorStops = arrayOf(
                0.0f to topColor,
                0.43f to topColor,
                0.43f to Color.Transparent,
                0.45f to Color.Transparent,
                0.45f to topColor,
                0.57f to middleColor,
                0.57f to Color.Transparent,
                0.6f to Color.Transparent,
                0.6f to middleColor,
                0.7f to middleColor,
                0.7f to Color.Transparent,
                0.74f to Color.Transparent,
                0.74f to middleColor,
                0.84f to bottomColor,
                0.84f to Color.Transparent,
                0.9f to Color.Transparent,
                0.9f to bottomColor,
                1.0f to bottomColor
            ),
            startY = 0f,
            endY = height
        )

        // Draw the circle with the gradient
        drawCircle(
            brush = if (retro) brushRetro else brushFull,
            radius = radius,
            center = center
        )
    }
}
