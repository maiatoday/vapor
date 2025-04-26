package theme

import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.Font
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp
import java.io.File

/**
 * Vapor quirky fonts
 */
object VaporFonts {
    val RubikGlitch = FontFamily(
        androidx.compose.ui.text.platform.Font(
            "fonts/RubikGlitch-Regular.ttf",
            weight = FontWeight.Normal,
            style = FontStyle.Normal
        )
    )

    val Neonderthaw = FontFamily(
        androidx.compose.ui.text.platform.Font(
            "fonts/Neonderthaw-Regular.ttf",
            weight = FontWeight.Normal,
            style = FontStyle.Normal
        )
    )

    val Monoton = FontFamily(
        androidx.compose.ui.text.platform.Font(
            "fonts/Monoton-Regular.ttf",
            weight = FontWeight.Normal,
            style = FontStyle.Normal
        )
    )

    val PressStart2P = FontFamily(
        androidx.compose.ui.text.platform.Font(
            "fonts/PressStart2P-Regular.ttf",
            weight = FontWeight.Normal,
            style = FontStyle.Normal
        )
    )

    // Text styles for quirky fonts
    val rubikGlitchStyle = TextStyle(
        fontFamily = RubikGlitch,
        fontWeight = FontWeight.Normal,
        fontSize = 24.sp
    )

    val neonderthawStyle = TextStyle(
        fontFamily = Neonderthaw,
        fontWeight = FontWeight.Normal,
        fontSize = 24.sp
    )

    val monotonStyle = TextStyle(
        fontFamily = Monoton,
        fontWeight = FontWeight.Normal,
        fontSize = 24.sp
    )

    val pressStart2PStyle = TextStyle(
        fontFamily = PressStart2P,
        fontWeight = FontWeight.Normal,
        fontSize = 24.sp
    )
}
