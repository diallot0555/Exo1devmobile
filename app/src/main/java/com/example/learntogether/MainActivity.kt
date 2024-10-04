package com.example.learntogether

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learntogether.ui.theme.LearnTogetherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearnTogetherTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MonAppliaction(
                       "",
                        "",
                        ""
                    )
                }
            }
        }
    }
}

@Composable
fun MonAppliaction ( name: String, deuxiemeText: String, troisiemeText: String,  modifier: Modifier = Modifier) {
    // Premier composable Text
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Image(
            painter = painterResource(R.drawable.bg_compose_background_exo1amadou),
            contentDescription = "image de fond "
        )
        Text(
            text = name,
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp),
        )

        // Deuxième composable Text
        Text(
            text = deuxiemeText,
            modifier = Modifier.padding( start=16.dp, end = 16.dp),
            textAlign = TextAlign.Justify,

        )
        // Troisième composable Text
        Text(
            text = troisiemeText,
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify,

        )
    }
}

@Preview(showBackground = true)
@Composable
fun AmadouImagePreview() {
    LearnTogetherTheme {
        MonAppliaction(
            stringResource(R.string.titre),
            stringResource(R.string.deuxiemeText),
            stringResource(R.string.troisiemeText)
        )
    }
}