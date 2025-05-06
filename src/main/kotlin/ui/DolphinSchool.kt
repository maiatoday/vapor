package ui

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

/**
 * DolphinSchoolTop - Displays pink dolphins in the middle at the top
 */
@Composable
fun DolphinSchoolTop(modifier: Modifier = Modifier) {
    // Pink dolphins in the middle at the top (slightly larger)
    Row(
        modifier = modifier.padding(bottom = 16.dp),
        horizontalArrangement = Arrangement.Center
    ) {
        PinkDolphin(modifier = Modifier.size(180.dp))
        Spacer(modifier = Modifier.width(16.dp))
        PinkDolphin2(modifier = Modifier.size(180.dp))
    }
}

/**
 * DolphinSchoolBottom - Displays regular dolphins on the left and right
 */
@Composable
fun DolphinSchoolBottom(modifier: Modifier = Modifier) {
    // Regular dolphins on the left and right
    Row(
        modifier = modifier.padding(top = 8.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Dolphin(modifier = Modifier.size(120.dp))
        Spacer(modifier = Modifier.width(100.dp))
        Dolphin2(modifier = Modifier.size(120.dp))
    }
}

/**
 * DolphinSchool - Displays dolphins with pink ones in the middle at the top
 * and regular ones on the left and right
 */
@Composable
fun DolphinSchool(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        DolphinSchoolTop()
        DolphinSchoolBottom()
    }
}
