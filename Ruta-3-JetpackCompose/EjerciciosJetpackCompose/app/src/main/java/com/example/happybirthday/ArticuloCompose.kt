package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme

class ComposeArticleActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            HappyBirthdayTheme {
                Surface(
                    modifier = Modifier.fillMaxWidth(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeArticle(
                        title = stringResource(R.string.title_article),
                        description = stringResource(R.string.description_article),
                        tutorial = stringResource(R.string.tutorial_article)
                    )
                }
            }
        }
    }
}

@Composable
fun ComposeArticle(
    title: String,
    description: String,
    tutorial: String
) {
    Column {
        ArticleImage()

        ArticleText(
            title = title,
            description = description,
            tutorial = tutorial
        )
    }
}

@Composable
fun ArticleImage() {
    Image(
        painter = painterResource(R.drawable.bg_compose_background),
        contentDescription = null,
        modifier = Modifier.fillMaxWidth()
    )
}

@Composable
fun ArticleText(
    title: String,
    description: String,
    tutorial: String
) {
    Text(
        text = title,
        fontSize = 24.sp,
        modifier = Modifier.padding(16.dp)
    )

    Text(
        text = description,
        modifier = Modifier.padding(
            start = 16.dp,
            end = 16.dp
        ),
        textAlign = TextAlign.Justify
    )

    Text(
        text = tutorial,
        modifier = Modifier.padding(16.dp),
        textAlign = TextAlign.Justify
    )
}

@Preview(showBackground = true)
@Composable
fun ComposeArticlePreview() {
    HappyBirthdayTheme {
        ComposeArticle(
            title = stringResource(R.string.title_article),
            description = stringResource(R.string.description_article),
            tutorial = stringResource(R.string.tutorial_article)
        )
    }
}