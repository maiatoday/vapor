package utils

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.res.loadImageBitmap
import java.io.File

/**
 *Generalized composable that can show a bitmap from a path
 * 
 * @param imagePath Path to the image file
 * @param contentDescription Description of the image for accessibility
 * @param modifier Modifier for customizing the layout
 */
@Composable
fun ImageFromPath(
    imagePath: String,
    contentDescription: String?,
    modifier: Modifier = Modifier
) {
    val imageBitmap: ImageBitmap = loadImageBitmap(File(imagePath).inputStream())
    Image(
        painter = BitmapPainter(imageBitmap),
        contentDescription = contentDescription,
        modifier = modifier
    )
}

