package com.example.projectlayout

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(top = 40.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(id = R.string.prodi),
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = stringResource(id = R.string.univ),
            fontSize = 14.sp,
            fontWeight = FontWeight.SemiBold
        )

        Spacer(modifier = Modifier.height(20.dp))

        // Card 1
        CardWidget(
            bgColor = colorResource(id = R.color.card_1_bg),
            nama = stringResource(id = R.string.nama_1),
            alamat = stringResource(id = R.string.alamat_1),
            namaColor = colorResource(id = R.color.text_yellow),
            alamatColor = colorResource(id = R.color.text_white)
        )

        // Card 2
        CardWidget(
            bgColor = colorResource(id = R.color.card_2_bg),
            nama = stringResource(id = R.string.nama_2),
            telepon = stringResource(id = R.string.telp_2),
            alamat = stringResource(id = R.string.alamat_2),
            namaColor = colorResource(id = R.color.text_yellow),
            alamatColor = colorResource(id = R.color.text_cyan),
            teleponColor = colorResource(id = R.color.text_cyan)
        )

        // Card 3
        CardWidget(
            bgColor = colorResource(id = R.color.card_3_bg),
            nama = stringResource(id = R.string.nama_3),
            telepon = stringResource(id = R.string.telp_3),
            alamat = stringResource(id = R.string.alamat_3),
            namaColor = colorResource(id = R.color.text_white),
            alamatColor = colorResource(id = R.color.text_cyan),
            teleponColor = colorResource(id = R.color.text_cyan)
        )

        // Card 4
        CardWidget(
            bgColor = colorResource(id = R.color.card_4_bg),
            nama = stringResource(id = R.string.nama_4),
            telepon = stringResource(id = R.string.telp_4),
            alamat = stringResource(id = R.string.alamat_4),
            namaColor = colorResource(id = R.color.text_white),
            alamatColor = colorResource(id = R.color.text_cyan),
            teleponColor = colorResource(id = R.color.text_cyan)
        )

        Spacer(modifier = Modifier.weight(1f))

        Text(
            text = stringResource(id = R.string.copyright),
            fontSize = 12.sp,
            modifier = Modifier.padding(bottom = 20.dp)
        )
    }
}