package ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import theme.VaporColors
import theme.VaporFonts

/**
 * Title composable with "Compose draw speedrun" text in OrchidPink using
 * RubikGlitch font and subtitle with "Reloaded" text in white using
 * Neonderthaw font
 */
@Composable
fun TitleText(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.End
    ) {
        // Title text using RubikGlitch font and OrchidPink color
        Text(
            text = "Compose draw\nspeedrun",
            style = VaporFonts.rubikGlitchStyle.copy(
                color = Color.White,
                fontSize = 56.sp,
                shadow = Shadow(
                    color = VaporColors.RobinEggBlue,
                    offset = Offset(2f, 2f),
                    blurRadius = 2f)
            ),
            textAlign = TextAlign.End,
        )

        // Subtitle text using Neonderthaw font and white color
        Text(
            modifier = Modifier.padding(top = 8.dp),
            text = "Reloaded",
            style = VaporFonts.neonderthawStyle.copy(
                color = Color.White,
                fontSize = 36.sp,
                shadow = Shadow(
                    color = VaporColors.Mulberry,
                    offset = Offset(2f, 2f),
                    blurRadius = 2f)
            ),
            textAlign = TextAlign.End
        )
    }
}

/** Solo version of RubikGlitchTitle for individual display */
@Composable
fun SoloRubikGlitchTitle() {
    Box(modifier = Modifier.fillMaxSize().background(VaporColors.RaisinBlack)) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            TitleText()
        }

        // Add "なに!?" text at the bottom start, rotated 45 degrees
        Text(
            text = "なに!?",
            style = VaporFonts.rubikGlitchStyle.copy(
                color = Color.White,
                fontSize = 36.sp,
                shadow = Shadow(
                    color = VaporColors.RobinEggBlue,
                    offset = Offset(2f, 2f),
                    blurRadius = 2f)
            ),
            modifier = Modifier
                .align(Alignment.BottomStart)
                .padding(start = 48.dp, bottom = 48.dp)
                .graphicsLayer(rotationZ = -45f)
        )
    }
}
