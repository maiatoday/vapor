package utils

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.res.loadImageBitmap
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

// ⚡️colorFilters

