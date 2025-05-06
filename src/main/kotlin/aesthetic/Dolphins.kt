package aesthetic

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import utils.ImageFromPath

@Composable
fun PinkDolphin(modifier: Modifier = Modifier) {
    ImageFromPath(
        imagePath = Res.Images.PINK_DOLPHIN_1,
        contentDescription = "Pink Dolphin",
        modifier = modifier
    )
}

@Composable
fun PinkDolphin2(modifier: Modifier = Modifier) {
    ImageFromPath(
        imagePath = Res.Images.PINK_DOLPHIN_2,
        contentDescription = "Pink Dolphin",
        modifier = modifier
    )
}

@Composable
fun Dolphin(modifier: Modifier = Modifier) {
    ImageFromPath(
        imagePath = Res.Images.DOLPHIN_1,
        contentDescription = "Dolphin",
        modifier = modifier
    )
}

@Composable
fun Dolphin2(modifier: Modifier = Modifier) {
    ImageFromPath(
        imagePath = Res.Images.DOLPHIN_2,
        contentDescription = "Dolphin",
        modifier = modifier
    )
}