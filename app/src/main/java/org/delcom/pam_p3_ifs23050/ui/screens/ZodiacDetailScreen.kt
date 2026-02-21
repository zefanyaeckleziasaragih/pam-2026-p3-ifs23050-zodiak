package org.delcom.pam_p3_ifs23050.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import org.delcom.pam_p3_ifs23050.data.DummyData
import org.delcom.pam_p3_ifs23050.data.ZodiacData
import org.delcom.pam_p3_ifs23050.helper.RouteHelper
import org.delcom.pam_p3_ifs23050.ui.components.BottomNavComponent
import org.delcom.pam_p3_ifs23050.ui.components.LoadingUI
import org.delcom.pam_p3_ifs23050.ui.components.TopAppBarComponent
import org.delcom.pam_p3_ifs23050.ui.theme.DelcomTheme
import org.delcom.pam_p3_ifs23050.ui.theme.ZodiacDeepBlue
import org.delcom.pam_p3_ifs23050.ui.theme.ZodiacPurple

@Composable
fun ZodiacDetailScreen(
    navController: NavHostController,
    zodiacName: String
) {
    var zodiac by remember { mutableStateOf<ZodiacData?>(null) }

    LaunchedEffect(Unit) {
        zodiac = DummyData.getZodiacData().find { it.nama == zodiacName }
        if (zodiac == null) {
            RouteHelper.back(navController)
        }
    }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.background)
    ) {
        if (zodiac != null) {
            TopAppBarComponent(navController = navController, title = zodiacName, true)
            Box(modifier = Modifier.weight(1f)) {
                ZodiacDetailUI(zodiac = zodiac!!)
            }
            BottomNavComponent(navController = navController)
        } else {
            LoadingUI()
        }
    }
}

@Composable
fun ZodiacDetailUI(zodiac: ZodiacData) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        // Hero header dengan gradient biru-ungu
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(ZodiacDeepBlue, ZodiacPurple)
                    )
                )
                .padding(vertical = 24.dp, horizontal = 16.dp),
            contentAlignment = Alignment.Center
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Image(
                    painter = painterResource(id = zodiac.gambar),
                    contentDescription = zodiac.nama,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp),
                    contentScale = ContentScale.Fit
                )

                Text(
                    text = zodiac.nama,
                    style = MaterialTheme.typography.headlineLarge,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    color = Color.White,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 8.dp)
                )

                Text(
                    text = zodiac.periode,
                    style = MaterialTheme.typography.titleMedium,
                    color = Color.White.copy(alpha = 0.85f),
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth()
                )

                Text(
                    text = zodiac.elemen,
                    style = MaterialTheme.typography.titleMedium,
                    textAlign = TextAlign.Center,
                    color = Color(0xFFFFD700),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 4.dp)
                )
            }
        }

        Column(modifier = Modifier.padding(16.dp)) {
            ZodiacInfoCard(title = "✨ Deskripsi", content = zodiac.deskripsi)
            ZodiacInfoCard(title = "🌟 Sifat & Karakter", content = zodiac.sifat)
            ZodiacInfoCard(title = "💑 Kecocokan Zodiak", content = zodiac.kecocokan)
        }
    }
}

@Composable
fun ZodiacInfoCard(title: String, content: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 16.dp),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(6.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
    ) {
        Column(modifier = Modifier.fillMaxWidth()) {
            // Header card dengan gradient
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        brush = Brush.horizontalGradient(
                            colors = listOf(
                                ZodiacDeepBlue.copy(alpha = 0.9f),
                                ZodiacPurple.copy(alpha = 0.9f)
                            )
                        ),
                        shape = RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp)
                    )
                    .padding(horizontal = 16.dp, vertical = 12.dp)
            ) {
                Text(
                    text = title,
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
            }

            Text(
                text = content,
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.padding(16.dp),
                color = MaterialTheme.colorScheme.onSurface
            )
        }
    }
}

@Preview(showBackground = true, name = "Light Mode")
@Composable
fun PreviewZodiacDetailUI() {
    DelcomTheme {
        ZodiacDetailUI(zodiac = DummyData.getZodiacData()[0])
    }
}