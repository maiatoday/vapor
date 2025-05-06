package aesthetic

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import utils.ImageFromPath

/**
 * Composable that displays a marble statue image
 * 
 * @param modifier Modifier for customizing the layout
 */
@Composable
fun MarbleStatue(modifier: Modifier = Modifier) {
    ImageFromPath(
        imagePath = Res.Images.MARBLE_STATUE,
        contentDescription = "Marble Statue",
        modifier = modifier
    )
}