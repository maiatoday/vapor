package aesthetic

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import utils.ImageFromPath

/**
 * Composable that displays a cassette image based on the provided option number.
 * 
 * @param option Number between 1 and 10 to select which cassette image to display
 *               (1-6 for standard cassettes, 7-10 for variant cassettes)
 * @param modifier Modifier for customizing the layout
 */
@Composable
fun Cassette(option: Int, modifier: Modifier = Modifier) {
    // Ensure the option is within the valid range (1-10)
    val validOption = option.coerceIn(1, 10)

    // Get the appropriate image path based on the option
    val imagePath = when (validOption) {
        // Standard cassette images (1-6)
        1 -> Res.Images.CASSETTE_1
        2 -> Res.Images.CASSETTE_2
        3 -> Res.Images.CASSETTE_3
        4 -> Res.Images.CASSETTE_4
        5 -> Res.Images.CASSETTE_5
        6 -> Res.Images.CASSETTE_6
        // Variant cassette images (7-10)
        7 -> Res.Images.CASSETTE_V1
        8 -> Res.Images.CASSETTE_V2
        9 -> Res.Images.CASSETTE_V3
        10 -> Res.Images.CASSETTE_V4
        else -> Res.Images.CASSETTE_1 // Default to the first cassette (should never happen due to coerceIn)
    }

    // Determine the content description based on the option
    val contentDescription = if (validOption in 7..10) {
        "Cassette Variant ${validOption - 6}"
    } else {
        "Cassette $validOption"
    }

    // Display the selected cassette image
    ImageFromPath(
        imagePath = imagePath,
        contentDescription = contentDescription,
        modifier = modifier
    )
}
