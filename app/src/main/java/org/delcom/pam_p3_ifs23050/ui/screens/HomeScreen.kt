package org.delcom.pam_p3_ifs23050.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import org.delcom.pam_p3_ifs23050.ui.components.BottomNavComponent
import org.delcom.pam_p3_ifs23050.ui.components.TopAppBarComponent
import org.delcom.pam_p3_ifs23050.ui.theme.DelcomTheme
import org.delcom.pam_p3_ifs23050.ui.theme.ZodiacDeepBlue
import org.delcom.pam_p3_ifs23050.ui.theme.ZodiacGold
import org.delcom.pam_p3_ifs23050.ui.theme.ZodiacPurple

@Composable
fun HomeScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.background)
    ) {
        TopAppBarComponent(navController = navController, title = "Home", false)
        Box(modifier = Modifier.weight(1f)) {
            HomeUI()
        }
        BottomNavComponent(navController = navController)
    }
}

@Composable
fun HomeUI() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        // Hero Banner dengan gradient
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(ZodiacDeepBlue, ZodiacPurple)
                    )
                )
                .padding(vertical = 32.dp, horizontal = 16.dp),
            contentAlignment = Alignment.Center
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    text = "✨",
                    fontSize = 48.sp,
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "Delcom Zodiak",
                    style = MaterialTheme.typography.headlineLarge,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    textAlign = TextAlign.Center
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "Temukan rahasia bintang & nasibmu",
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color.White.copy(alpha = 0.8f),
                    textAlign = TextAlign.Center
                )
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Simbol zodiak dalam grid
        Text(
            text = "12 Rasi Bintang",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.onBackground,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 4.dp)
        )

        val zodiacSymbols = listOf(
            "♈" to "Aries", "♉" to "Taurus", "♊" to "Gemini", "♋" to "Cancer",
            "♌" to "Leo", "♍" to "Virgo", "♎" to "Libra", "♏" to "Scorpio",
            "♐" to "Sagitarius", "♑" to "Capricorn", "♒" to "Aquarius", "♓" to "Pisces"
        )

        zodiacSymbols.chunked(4).forEach { rowSymbols ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 12.dp, vertical = 4.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                rowSymbols.forEach { (symbol, name) ->
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Box(
                            modifier = Modifier
                                .size(64.dp)
                                .clip(RoundedCornerShape(16.dp))
                                .background(
                                    brush = Brush.verticalGradient(
                                        colors = listOf(
                                            ZodiacDeepBlue.copy(alpha = 0.15f),
                                            ZodiacPurple.copy(alpha = 0.15f)
                                        )
                                    )
                                ),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(text = symbol, fontSize = 28.sp)
                        }
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = name,
                            style = MaterialTheme.typography.labelSmall,
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            textAlign = TextAlign.Center
                        )
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Info card elemen
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
                .padding(bottom = 16.dp),
            shape = RoundedCornerShape(16.dp),
            elevation = CardDefaults.cardElevation(4.dp),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text(
                    text = "🌌 Empat Elemen Zodiak",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onSurface
                )
                Spacer(modifier = Modifier.height(12.dp))
                listOf(
                    "🔥 Api" to "Aries, Leo, Sagitarius",
                    "🌍 Tanah" to "Taurus, Virgo, Capricorn",
                    "💨 Udara" to "Gemini, Libra, Aquarius",
                    "💧 Air" to "Cancer, Scorpio, Pisces"
                ).forEach { (elemen, zodiaks) ->
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 4.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = elemen,
                            style = MaterialTheme.typography.bodyMedium,
                            fontWeight = FontWeight.SemiBold,
                            modifier = Modifier.weight(0.4f)
                        )
                        Text(
                            text = zodiaks,
                            style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            modifier = Modifier.weight(0.6f)
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true, name = "Light Mode")
@Composable
fun PreviewHomeUI() {
    DelcomTheme {
        HomeUI()
    }
}