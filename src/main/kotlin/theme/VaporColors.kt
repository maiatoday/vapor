package theme

import androidx.compose.ui.graphics.Color

/**
 * Vapor color palette based on vaporwave aesthetics
 */
object VaporColors {
    // Colors from the palette in aesthetics.md
    val RaisinBlack = Color(0xFF2E2A37)
    val VioletJTC = Color(0xFF4C3045)
    val OrchidPink = Color(0xFFE2B5C5)
    val Cerulean = Color(0xFF3F7291)
    val RoyalPurple = Color(0xFF724396)
    val Mulberry = Color(0xFFDA4394)
    val Buff = Color(0xFFD5A185)
    val Glaucous = Color(0xFF6D84B8)
    val RobinEggBlue = Color(0xFF54BEC8)
    val RosePompadour = Color(0xFFE0768D)

    // List of color pairs (color and name) for the palette display
    val colorPairs = listOf(
        Pair(RaisinBlack, "Raisin Black"),
        Pair(VioletJTC, "Violet JTC"),
        Pair(OrchidPink, "Orchid Pink"),
        Pair(Cerulean, "Cerulean"),
        Pair(RoyalPurple, "Royal Purple"),
        Pair(Mulberry, "Mulberry"),
        Pair(Buff, "Buff"),
        Pair(Glaucous, "Glaucous"),
        Pair(RobinEggBlue, "Robin Egg Blue"),
        Pair(RosePompadour, "Rose Pompadour")
    )
}
