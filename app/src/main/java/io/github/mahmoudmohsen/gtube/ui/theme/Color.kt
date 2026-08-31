package io.github.mahmoudmohsen.gtube.ui.theme

import androidx.compose.ui.graphics.Color

// gtube Brand Colors (Gojo Satoru inspired palette)
val GojoElectricBlue = Color(0xFF1E90FF)   // Primary — Gojo's electric-blue eyes
val GojoDeepBlue = Color(0xFF0B5FB0)       // Pressed/darker variant
val GojoSkyBlue = Color(0xFF4DA6FF)        // Light accent
val GojoHollowPurple = Color(0xFF8A2BE2)   // Hollow Purple technique accent
val GojoRed = Color(0xFFFF1744)            // Red technique accent
val GojoDarkNavy = Color(0xFF0A0E27)      // Background — Gojo's dark uniform
val GojoMidnight = Color(0xFF050913)      // OLED background
val GojoSurfaceNavy = Color(0xFF121A33)   // Surface
val GojoHairWhite = Color(0xFFFFFFFF)     // Hair / on-primary
val GojoSnowMist = Color(0xFFF5F9FF)       // Light surface tint

// Legacy aliases (kept so existing references still resolve)
val YouTubeRed = GojoElectricBlue
val YouTubeDark = GojoDarkNavy
val YouTubeGray = Color(0xFF282828)

// Dark Theme Colors
val Black = Color(0xFF000000)
val DarkBackground = GojoDarkNavy
val DarkSurface = GojoSurfaceNavy
val DarkSurfaceVariant = Color(0xFF1E2A4D)

// Light Theme Colors
val White = Color(0xFFFFFFFF)
val LightBackground = GojoHairWhite
val LightSurface = GojoSnowMist
val LightSurfaceVariant = Color(0xFFE1EBFA)

// Text Colors
val TextPrimary = Color(0xFFFFFFFF)
val TextSecondary = Color(0xFFA0B4D8)
val TextTertiary = Color(0xFF7186AA)

// Accent Colors
val SuccessColor = Color(0xFF4CAF50)
val ErrorColor = Color(0xFFFF5252)
val Warning = Color(0xFFFFB74D)
val Info = GojoElectricBlue

// Shimmer Colors
val ShimmerColorShades = listOf(
    Color(0xFF1A2540),
    Color(0xFF223055),
    Color(0xFF1A2540)
)

// Light Theme Color Scheme
object LightThemeColors {
    val Primary: Color = GojoElectricBlue
    val OnPrimary: Color = White
    val Secondary: Color = GojoSkyBlue
    val OnSecondary: Color = Black
    val Background: Color = LightBackground
    val Surface: Color = LightSurface
    val Text: Color = GojoDarkNavy
    val TextSecondary: Color = Color(0xFF4A6A99)
    val Border: Color = Color(0xFFD7E3FA)
    val Success: Color = SuccessColor
    val Error: Color = ErrorColor
}

// Dark Theme Color Scheme
object DarkThemeColors {
    val Primary: Color = GojoElectricBlue
    val OnPrimary: Color = White
    val Secondary: Color = GojoSkyBlue
    val OnSecondary: Color = Black
    val Background: Color = DarkBackground
    val Surface: Color = DarkSurface
    val Text: Color = TextPrimary
    val TextSecondary: Color = Color(0xFFA0B4D8)
    val Border: Color = Color(0xFF2A3A66)
    val Success: Color = SuccessColor
    val Error: Color = ErrorColor
}

// OLED Theme Color Scheme
object OLEDThemeColors {
    val Primary: Color = GojoElectricBlue
    val OnPrimary: Color = White
    val Secondary: Color = GojoSkyBlue
    val OnSecondary: Color = Black
    val Background: Color = GojoMidnight
    val Surface: Color = Color(0xFF0A1230)
    val Text: Color = TextPrimary
    val TextSecondary: Color = Color(0xFFA0B4D8)
    val Border: Color = Color(0xFF1A2540)
    val Success: Color = SuccessColor
    val Error: Color = ErrorColor
}

// Ocean Blue Theme Color Scheme
object OceanBlueThemeColors {
    val Primary: Color = Color(0xFF006994)
    val OnPrimary: Color = White
    val Secondary: Color = Color(0xFF4FC3F7)
    val OnSecondary: Color = Black
    val Background: Color = Color(0xFF0A1929)
    val Surface: Color = Color(0xFF1A2332)
    val Text: Color = Color(0xFFE3F2FD)
    val TextSecondary: Color = Color(0xFF90CAF9)
    val Border: Color = Color(0xFF2A3F5F)
    val Success: Color = Color(0xFF26C6DA)
    val Error: Color = Color(0xFFEF5350)
}

// Forest Green Theme Color Scheme
object ForestGreenThemeColors {
    val Primary: Color = Color(0xFF2E7D32)
    val OnPrimary: Color = White
    val Secondary: Color = Color(0xFF66BB6A)
    val OnSecondary: Color = Black
    val Background: Color = Color(0xFF0D1F12)
    val Surface: Color = Color(0xFF1B2D1F)
    val Text: Color = Color(0xFFE8F5E9)
    val TextSecondary: Color = Color(0xFFA5D6A7)
    val Border: Color = Color(0xFF2F4C33)
    val Success: Color = Color(0xFF4CAF50)
    val Error: Color = Color(0xFFEF5350)
}

// Sunset Orange Theme Color Scheme
object SunsetOrangeThemeColors {
    val Primary: Color = Color(0xFFFF6F00)
    val OnPrimary: Color = White
    val Secondary: Color = Color(0xFFFFAB40)
    val OnSecondary: Color = Black
    val Background: Color = Color(0xFF1F0F08)
    val Surface: Color = Color(0xFF2D1810)
    val Text: Color = Color(0xFFFFECB3)
    val TextSecondary: Color = Color(0xFFFFCC80)
    val Border: Color = Color(0xFF4A2C1A)
    val Success: Color = Color(0xFFFFB74D)
    val Error: Color = Color(0xFFEF5350)
}

// Purple Nebula Theme Color Scheme
object PurpleNebulaThemeColors {
    val Primary: Color = Color(0xFF7B1FA2)
    val OnPrimary: Color = White
    val Secondary: Color = Color(0xFFBA68C8)
    val OnSecondary: Color = Black
    val Background: Color = Color(0xFF1A0C26)
    val Surface: Color = Color(0xFF2A1A3D)
    val Text: Color = Color(0xFFF3E5F5)
    val TextSecondary: Color = Color(0xFFCE93D8)
    val Border: Color = Color(0xFF3D2957)
    val Success: Color = Color(0xFFAB47BC)
    val Error: Color = Color(0xFFEF5350)
}

// Midnight Black Theme Color Scheme
object MidnightBlackThemeColors {
    val Primary: Color = Color(0xFF00BCD4)
    val OnPrimary: Color = Black
    val Secondary: Color = Color(0xFF64B5F6)
    val OnSecondary: Color = Black
    val Background: Color = Color(0xFF000000)
    val Surface: Color = Color(0xFF0A0A0A)
    val Text: Color = Color(0xFFFFFFFF)
    val TextSecondary: Color = Color(0xFFB0BEC5)
    val Border: Color = Color(0xFF1A1A1A)
    val Success: Color = Color(0xFF00E676)
    val Error: Color = Color(0xFFFF5252)
}

// Rose Gold Theme Color Scheme
object RoseGoldThemeColors {
    val Primary: Color = Color(0xFFE91E63)
    val OnPrimary: Color = White
    val Secondary: Color = Color(0xFFFF6090)
    val OnSecondary: Color = Black
    val Background: Color = Color(0xFF1A0D12)
    val Surface: Color = Color(0xFF2D1821)
    val Text: Color = Color(0xFFFCE4EC)
    val TextSecondary: Color = Color(0xFFF48FB1)
    val Border: Color = Color(0xFF4A2535)
    val Success: Color = Color(0xFFEC407A)
    val Error: Color = Color(0xFFEF5350)
}

// Arctic Ice Theme Color Scheme
object ArcticIceThemeColors {
    val Primary: Color = Color(0xFF00BCD4)
    val OnPrimary: Color = Black
    val Secondary: Color = Color(0xFF80DEEA)
    val OnSecondary: Color = Black
    val Background: Color = Color(0xFF0E1821)
    val Surface: Color = Color(0xFF1A2830)
    val Text: Color = Color(0xFFE0F7FA)
    val TextSecondary: Color = Color(0xFF80DEEA)
    val Border: Color = Color(0xFF2A3F4A)
    val Success: Color = Color(0xFF26C6DA)
    val Error: Color = Color(0xFFEF5350)
}

// Crimson Red Theme Color Scheme
object CrimsonRedThemeColors {
    val Primary: Color = Color(0xFFDC143C)
    val OnPrimary: Color = White
    val Secondary: Color = Color(0xFFFF4757)
    val OnSecondary: Color = White
    val Background: Color = Color(0xFF1A0A0A)
    val Surface: Color = Color(0xFF2D1414)
    val Text: Color = Color(0xFFFFEBEE)
    val TextSecondary: Color = Color(0xFFEF9A9A)
    val Border: Color = Color(0xFF4A1F1F)
    val Success: Color = Color(0xFFEF5350)
    val Error: Color = Color(0xFFFF1744)
}

// Royal Gold Theme (Premium/Luxury)
object RoyalGoldThemeColors {
    val Primary: Color = Color(0xFFFFD700)
    val OnPrimary: Color = Black
    val Secondary: Color = Color(0xFFC5A000)
    val OnSecondary: Color = Black
    val Background: Color = Color(0xFF050505)
    val Surface: Color = Color(0xFF141414)
    val Text: Color = Color(0xFFFFF8E1)
    val TextSecondary: Color = Color(0xFFBDB76B)
    val Border: Color = Color(0xFF333333)
    val Success: Color = Color(0xFFCDDC39)
    val Error: Color = Color(0xFFD32F2F)
}

// Nordic Horizon Theme (Cool/Muted)
object NordicHorizonThemeColors {
    val Primary: Color = Color(0xFF88C0D0)
    val OnPrimary: Color = Black
    val Secondary: Color = Color(0xFF81A1C1)
    val OnSecondary: Color = Black
    val Background: Color = Color(0xFF242933)
    val Surface: Color = Color(0xFF2E3440)
    val Text: Color = Color(0xFFECEFF4)
    val TextSecondary: Color = Color(0xFFD8DEE9)
    val Border: Color = Color(0xFF434C5E)
    val Success: Color = Color(0xFFA3BE8C)
    val Error: Color = Color(0xFFBF616A)
}

// Espresso Theme (Warm/Cozy)
object EspressoThemeColors {
    val Primary: Color = Color(0xFFD7CCC8)
    val OnPrimary: Color = Black
    val Secondary: Color = Color(0xFFA1887F)
    val OnSecondary: Color = White
    val Background: Color = Color(0xFF181210)
    val Surface: Color = Color(0xFF241A17)
    val Text: Color = Color(0xFFEFEBE9)
    val TextSecondary: Color = Color(0xFFBCAAA4)
    val Border: Color = Color(0xFF3E2723)
    val Success: Color = Color(0xFF8D6E63)
    val Error: Color = Color(0xFFD84315)
}

// Gunmetal Theme (Industrial/Sleek)
object GunmetalThemeColors {
    val Primary: Color = Color(0xFF78909C)
    val OnPrimary: Color = Black
    val Secondary: Color = Color(0xFF546E7A)
    val OnSecondary: Color = White
    val Background: Color = Color(0xFF0F1216)
    val Surface: Color = Color(0xFF1A1F26)
    val Text: Color = Color(0xFFECEFF1)
    val TextSecondary: Color = Color(0xFFCFD8DC)
    val Border: Color = Color(0xFF263238)
    val Success: Color = Color(0xFF26A69A)
    val Error: Color = ErrorColor
}

// --- NEW LIGHT THEMES ---

object MintLightThemeColors {
    val Primary: Color = Color(0xFF00BFA5)
    val OnPrimary: Color = White
    val Secondary: Color = Color(0xFF64FFDA)
    val OnSecondary: Color = Black
    val Background: Color = White
    val Surface: Color = Color(0xFFF1F8F7)
    val Text: Color = Color(0xFF00332E)
    val TextSecondary: Color = Color(0xFF455A64)
    val Border: Color = Color(0xFFE0F2F1)
    val Success: Color = Color(0xFF4CAF50)
}

object RoseLightThemeColors {
    val Primary: Color = Color(0xFFEC407A)
    val OnPrimary: Color = White
    val Secondary: Color = Color(0xFFF48FB1)
    val OnSecondary: Color = Black
    val Background: Color = Color(0xFFFFF8F9)
    val Surface: Color = Color(0xFFFCE4EC)
    val Text: Color = Color(0xFF4A0E1C)
    val TextSecondary: Color = Color(0xFF880E4F)
    val Border: Color = Color(0xFFF8BBD0)
    val Success: Color = Color(0xFFE91E63)
}

object SkyLightThemeColors {
    val Primary: Color = Color(0xFF0288D1)
    val OnPrimary: Color = White
    val Secondary: Color = Color(0xFF29B6F6)
    val OnSecondary: Color = Black
    val Background: Color = Color(0xFFF9FCFF)
    val Surface: Color = Color(0xFFE1F5FE)
    val Text: Color = Color(0xFF013354)
    val TextSecondary: Color = Color(0xFF0277BD)
    val Border: Color = Color(0xFFB3E5FC)
    val Success: Color = Color(0xFF03A9F4)
}

object CreamLightThemeColors {
    val Primary: Color = Color(0xFF8D6E63)
    val OnPrimary: Color = White
    val Secondary: Color = Color(0xFFBCAAA4)
    val OnSecondary: Color = Black
    val Background: Color = Color(0xFFFFFBF0)
    val Surface: Color = Color(0xFFF5F5DC)
    val Text: Color = Color(0xFF3E2723)
    val TextSecondary: Color = Color(0xFF5D4037)
    val Border: Color = Color(0xFFD7CCC8)
    val Success: Color = Color(0xFF795548)
}
