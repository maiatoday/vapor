package utils

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import kotlin.math.min

@Composable
fun ScribblePath(modifier: Modifier = Modifier, path: Path, brush: Brush, strokeWidth: Dp = 8.dp) {
    val bounds = path.getBounds()
    Spacer(
        modifier = modifier
            .padding(8.dp)
            .aspectRatio(bounds.width / bounds.height)
            .drawWithCache {
                val matrix = fromBoundsToComposeView(bounds, width = size.width, height = size.height)
                path.transform(matrix)
                // fake code to comment in and out to get it to redraw
               // val x = 10
                onDrawBehind {
                    drawPath(
                        path, brush, style = Stroke(
                            width = strokeWidth.value,
                            cap = StrokeCap.Round
                        )
                    )
                }
            })
}

fun fromBoundsToComposeView(
    bounds: Rect = Rect(-1f, -1f, 1f, 1f),
    width: Float,
    height: Float
): Matrix {
    val originalWidth = bounds.right - bounds.left
    val originalHeight = bounds.bottom - bounds.top
    val scale = min(width / originalWidth, height / originalHeight)
    val newLeft = bounds.left - (width / scale - originalWidth) / 2
    val newTop = bounds.top - (height / scale - originalHeight) / 2
    val matrix = Matrix()
    matrix.translate(-newLeft, -newTop)
    matrix.scale(scale, scale)
    return matrix
}
