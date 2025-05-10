package theme

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

/** Show a grid of all colors in the VaporColors object */
@Composable
fun PaletteDisplay(textColor: Color = Color.Unspecified) {
    // Use LazyVerticalGrid to display the colors in a grid layout
    LazyVerticalGrid(
        columns = GridCells.Fixed(5), // 5 columns
        modifier = Modifier.fillMaxWidth().padding(16.dp),
        content = {
            items(VaporColors.colorPairs) { (color, name) ->
                ColorChip(color, name, textColor)
            }
        }
    )
}
