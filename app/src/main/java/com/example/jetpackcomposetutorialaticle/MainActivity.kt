package com.example.jetpackcomposetutorialaticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposetutorialaticle.R.drawable.bg_compose_background
import com.example.jetpackcomposetutorialaticle.ui.theme.JetpackComposeTutorialAticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTutorialAticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeArticleApp()
                }
            }
        }
    }
}

@Composable
fun ComposeArticleApp() {
    ArticleCard(
        title = "Jetpack Compose tutorial",
        shortDescription = stringResource(R.string.shprt_desc),
        longDescription = stringResource(R.string.long_desc),
        imagePainter = painterResource(bg_compose_background),
    )
}

@Composable
 private fun ArticleCard(
    title: String,
    shortDescription: String,
    longDescription: String,
    imagePainter: Painter,
    modifier: Modifier = Modifier,
    ) {
        Column(modifier = modifier)
{
            Image(painter = imagePainter,
                contentDescription =null)
            Text(
                text = title,
                modifier = Modifier.padding(16.dp),
                fontSize = 24.sp
                )
            Text(text = shortDescription,
                modifier = Modifier.padding(start = 16.dp, end =16.dp),
                textAlign = TextAlign.Justify
                )
            Text(text = longDescription,
                modifier = Modifier.padding(16.dp),
                textAlign = TextAlign.Justify
                )
}
}


@Preview(showBackground = true)
@Composable
fun ComposeArticleAppPreview() {
    JetpackComposeTutorialAticleTheme {
        ComposeArticleApp()
    }
}