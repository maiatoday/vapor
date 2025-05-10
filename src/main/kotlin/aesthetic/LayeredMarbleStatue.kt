package aesthetic

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.offset
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.unit.dp
import utils.inverse
import utils.myBlur
import utils.weirdColorFilter

/**
 * Composable that displays a layered marble statue effect with two overlapping statues:
 * one with the blur effect and one with the color matrix effect.
 * 
 * @param modifier Modifier for customizing the layout
 * @param flipHorizontally Whether to flip the statue horizontally
 */
@Composable
fun LayeredMarbleStatue(
    modifier: Modifier = Modifier,
    flipHorizontally: Boolean = false
) {
    Box(modifier = modifier) {
        // Apply horizontal flip if needed
        val scaleX = if (flipHorizontally) -1f else 1f
        
        // First statue with blur effect
        MarbleStatue(
            modifier = Modifier
                .scale(scaleX = scaleX, scaleY = 1f)
                .myBlur(),
            colorFilter = inverse
        )
        
        // Second statue with weird color matrix, offset slightly
        MarbleStatue(
            modifier = Modifier
                .scale(scaleX = scaleX, scaleY = 1f)
                .offset(5.dp, 5.dp),
            colorFilter = weirdColorFilter
        )
    }
}