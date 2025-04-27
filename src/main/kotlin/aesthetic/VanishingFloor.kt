package aesthetic

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import theme.VaporColors

/**
 * A perspective grid composable that draws a receding floor effect. The
 * grid consists of horizontal lines that are parallel and vertical lines
 * that radiate from a vanishing point. Can be toggled between mulberry
 * lines and black/white tiles.
 *
 * @param modifier Modifier to be applied to the floor
 * @param size Size of the floor (width and height)
 * @param rows Number of rows in the grid
 * @param columns Number of columns in the grid
 * @param lineColor Color of the grid lines (default: Mulberry)
 * @param lineWidth Width of the grid lines (default: 2f)
 * @param position Position of the vanishing point on the x-axis (0.0 to
 *    1.0, default: 0.5)
 * @param focalLength Distance from camera to image plane, controls
 *    perspective distortion (default: 500f)
 * @param useTiles Whether to draw black and white tiles instead of
 *    mulberry lines (default: false)
 * @param firstColor A first color for the checkerboard pattern when
 *    useTiles is true (default: Color.White)
 * @param secondColor A second color for the checkerboard pattern when
 *    useTiles is true (default: Color.Black)
 */
@Composable
fun VanishingFloor(
    modifier: Modifier = Modifier,
    size: Dp = 200.dp,
    rows: Int = 10,
    columns: Int = 10,
    lineColor: Color = VaporColors.Mulberry,
    lineWidth: Float = 2f,
    position: Float = 0.5f,
    focalLength: Float = 500f,
    useTiles: Boolean = false,
    firstColor: Color = Color.White,
    secondColor: Color = Color.Black
) {
    Canvas(modifier = modifier.size(size)) {
        val canvasWidth = this.size.width
        val canvasHeight = this.size.height

        // Calculate the vanishing point at the top of the canvas based on the position parameter
        val vanishingPointX = canvasWidth * position
        val vanishingPointY = 0f

        // Define ground plane grid parameters
        val xStart = -canvasWidth / 2f
        val xEnd = canvasWidth * 1.5f
        val zStart = 0f
        val zEnd = canvasHeight * 2f
        val xSpacing = (xEnd - xStart) / columns
        val zSpacing = (zEnd - zStart) / rows

        // Project a 3D point (x, z) to 2D screen coordinates (projectedX, projectedY)
        fun projectPoint(x: Float, z: Float): Offset {
            // Apply perspective projection formula:
            // projectedX = x_vp + (x - x_vp) * (d / (z + d))
            // projectedY = y_vp + (0 - y_vp) * (d / (z + d))
            val scaleFactor = focalLength / (z + focalLength)
            val projectedX = vanishingPointX + (x - vanishingPointX) * scaleFactor
            val projectedY = vanishingPointY + (canvasHeight - vanishingPointY) * scaleFactor
            return Offset(projectedX, projectedY)
        }

        if (useTiles) {
            // Draw black and white tiles in a checkerboard pattern
            for (row in 0 until rows) {
                for (col in 0 until columns) {
                    // Calculate the four corners of the tile
                    val x1 = xStart + col * xSpacing
                    val x2 = xStart + (col + 1) * xSpacing
                    val z1 = zStart + row * zSpacing
                    val z2 = zStart + (row + 1) * zSpacing

                    val topLeft = projectPoint(x1, z1)
                    val topRight = projectPoint(x2, z1)
                    val bottomLeft = projectPoint(x1, z2)
                    val bottomRight = projectPoint(x2, z2)

                    // Determine the color based on a checkerboard pattern
                    val isEvenRow = row % 2 == 0
                    val isEvenCol = col % 2 == 0
                    val color = if (isEvenRow == isEvenCol) firstColor else secondColor

                    // Draw the filled polygon (quadrilateral)
                    val path = androidx.compose.ui.graphics.Path().apply {
                        moveTo(topLeft.x, topLeft.y)
                        lineTo(topRight.x, topRight.y)
                        lineTo(bottomRight.x, bottomRight.y)
                        lineTo(bottomLeft.x, bottomLeft.y)
                        close()
                    }
                    drawPath(
                        path = path,
                        color = color
                    )
                }
            }
        } else {
            // Draw horizontal lines (lines parallel to x-axis)
            for (row in 0..rows) {
                val z = zStart + row * zSpacing
                val startPoint = projectPoint(xStart, z)
                val endPoint = projectPoint(xEnd, z)

                drawLine(
                    color = lineColor,
                    start = startPoint,
                    end = endPoint,
                    strokeWidth = lineWidth
                )
            }

            // Draw vertical lines (lines parallel to z-axis)
            for (column in 0..columns) {
                val x = xStart + column * xSpacing
                val startPoint = projectPoint(x, zStart)
                val endPoint = projectPoint(x, zEnd)

                drawLine(
                    color = lineColor,
                    start = startPoint,
                    end = endPoint,
                    strokeWidth = lineWidth
                )
            }
        }
    }
}
