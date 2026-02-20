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
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
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
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
    ) {
        // Gambar & Nama
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = zodiac.gambar),
                contentDescription = zodiac.nama,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(220.dp),
                contentScale = ContentScale.Fit
            )

            Text(
                text = zodiac.nama,
                style = MaterialTheme.typography.headlineLarge,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()
            )

            Text(
                text = zodiac.periode,
                style = MaterialTheme.typography.titleMedium,
                color = MaterialTheme.colorScheme.primary,
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()
            )

            Text(
                text = zodiac.elemen,
                style = MaterialTheme.typography.titleMedium,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 4.dp)
            )
        }

        // Deskripsi
        ZodiacInfoCard(title = "Deskripsi", content = zodiac.deskripsi)

        // Sifat
        ZodiacInfoCard(title = "Sifat & Karakter", content = zodiac.sifat)

        // Kecocokan
        ZodiacInfoCard(title = "Kecocokan Zodiak 💑", content = zodiac.kecocokan)
    }
}

@Composable
fun ZodiacInfoCard(title: String, content: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 16.dp),
        shape = MaterialTheme.shapes.medium,
        elevation = CardDefaults.cardElevation(4.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Text(
                text = title,
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.SemiBold
            )
            HorizontalDivider(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 4.dp)
            )
            Text(
                text = content,
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.padding(top = 8.dp)
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