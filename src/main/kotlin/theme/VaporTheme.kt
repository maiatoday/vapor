package theme

import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Typography
import androidx.compose.material.darkColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import theme.VaporColors

/**
 * Vapor theme colors based on vaporwave aesthetics
 */
private val VaporColorPalette = darkColors(
    primary = VaporColors.RobinEggBlue,
    primaryVariant = VaporColors.Cerulean,
    secondary = VaporColors.Mulberry,
    secondaryVariant = VaporColors.RosePompadour,
    background = VaporColors.RaisinBlack,
    surface = VaporColors.VioletJTC,
    error = Color.Red,
    onPrimary = Color.White,
    onSecondary = Color.White,
    onBackground = VaporColors.OrchidPink,
    onSurface = VaporColors.Buff,
    onError = Color.White
)

/**
 * Vapor typography
 */
private val VaporTypography = Typography(
    h1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Bold,
        fontSize = 30.sp
    ),
    h2 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp
    ),
    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    body2 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    )
)

/**
 * Vapor theme composable function
 */
@Composable
fun VaporTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colors = VaporColorPalette,
        typography = VaporTypography,
        content = content
    )
}
