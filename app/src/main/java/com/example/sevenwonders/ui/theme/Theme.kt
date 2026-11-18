package com.example.sevenwonders.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val GoldPrimary = Color(0xFFB8860B)
val GoldLight = Color(0xFFDAA520)
val SandstoneBg = Color(0xFFFAF6F0)
val SurfaceCream = Color(0xFFFFFFFF)
val DeepBronze = Color(0xFF2C221E)
val MutedSepia = Color(0xFF6B5D54)
val TerracottaAccent = Color(0xFFA04020)

private val LightColorScheme = lightColorScheme(
    primary = GoldPrimary,
    onPrimary = Color.White,
    primaryContainer = Color(0xFFF5E6C4),
    onPrimaryContainer = DeepBronze,
    secondary = TerracottaAccent,
    onSecondary = Color.White,
    background = SandstoneBg,
    onBackground = DeepBronze,
    surface = SurfaceCream,
    onSurface = DeepBronze,
    surfaceVariant = Color(0xFFEFE7DB),
    onSurfaceVariant = MutedSepia
)

private val DarkColorScheme = darkColorScheme(
    primary = GoldLight,
    onPrimary = Color(0xFF1F1600),
    primaryContainer = Color(0xFF4A3600),
    onPrimaryContainer = Color(0xFFF5E6C4),
    secondary = Color(0xFFE07A5F),
    onSecondary = Color(0xFF2D0A00),
    background = Color(0xFF181412),
    onBackground = Color(0xFFF3ECE4),
    surface = Color(0xFF241E1B),
    onSurface = Color(0xFFF3ECE4),
    surfaceVariant = Color(0xFF332B26),
    onSurfaceVariant = Color(0xFFC7B9AE)
)

@Composable
fun SevenWondersTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme
    MaterialTheme(
        colorScheme = colorScheme,
        content = content
    )
}
