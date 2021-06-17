package io.gigiperih.composable

import android.graphics.Typeface
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.fontResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.gigiperih.composable.ui.theme.ComposableTheme
import io.gigiperih.composable.ui.theme.Mischka
import io.gigiperih.composable.ui.theme.SteelGray

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DefaultPreview()
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposableTheme {
        Column {
            TopAppBar(elevation = 0.dp) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(
                        color = SteelGray,
                        fontWeight = FontWeight.Bold,
                        text = "gaga"
                    )
                }
            }

            Greeting(name = "Gilang Ganteng")
        }
    }
}