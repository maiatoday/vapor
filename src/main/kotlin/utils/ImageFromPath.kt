package utils

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.BlurredEdgeTreatment
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ColorMatrix
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.res.loadImageBitmap
import androidx.compose.ui.unit.dp
import java.io.File

/**
 * Loads and displays an image from a file path.
 *
 * @param imagePath Path to the image file to be loaded
 * @param contentDescription Accessible description of the image for screen
 *    readers can be null if no content description is necessary
 * @param modifier Modifier to be applied to the image
 * @param colorFilter Optional color filter to apply when rendering the
 *    image
 */
@Composable
fun ImageFromPath(
    imagePath: String,
    contentDescription: String?,
    modifier: Modifier = Modifier,
    colorFilter: ColorFilter? = null
) {
    val imageBitmap: ImageBitmap = loadImageBitmap(File(imagePath).inputStream())
    Image(
        painter = BitmapPainter(imageBitmap),
        contentDescription = contentDescription,
        modifier = modifier,
        colorFilter = colorFilter,
    )
}

/*
When applied to a color [R, G, B, A]`, the resulting color is computed as:
R' = a*R + b*G + c*B + d*A + e
G' = f*R + g*G + h*B + i*A + j
B' = k*R + l*G + m*B + n*A + o
A' = p*R + q*G + r*B + s*A + t
That resulting color [R', G', B', A'] when has each channel clamped to the `0` to `255` range.
*/

val weirdColorMatrix = floatArrayOf(
    0f, -1f, 0f, 0.5f, 255f,
    0f, -1f, 0f, 0.1f, 255f,
    0f, 0f, -1f, 0.5f, 255f,
    0f, 0f, 0f, 1f, 0f
)

val inverseColorMatrix = floatArrayOf(
    -1f, 0f, 0f, 0f, 255f,
    0f, -1f, 0f, 0f, 255f,
    0f, 0f, -1f, 0f, 255f,
    0f, 0f, 0f, 1f, 0f
)

val inverse = ColorFilter.colorMatrix(ColorMatrix(inverseColorMatrix))

val weirdColorFilter = ColorFilter.colorMatrix(ColorMatrix(weirdColorMatrix))

@Stable
fun Modifier.myBlur(): Modifier =
    this.blur(
        radiusX = 10.dp,
        radiusY = 10.dp,
        edgeTreatment =  BlurredEdgeTreatment.Unbounded
    )


