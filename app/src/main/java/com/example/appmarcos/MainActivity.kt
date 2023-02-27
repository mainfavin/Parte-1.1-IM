package com.example.appmarcos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.appmarcos.ui.theme.AppMarcosTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppMarcosTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable //Composable genera lo que se muestra en pantalla. No pueden mostrar nada. El nombre lleva mayuscula.
fun Greeting(name: String) {
    Surface(color = Color(24,56,77)) {
        Text(text = "Hola, me llamo $name!", modifier = Modifier.padding(14.dp))
    }
}

@Preview(showBackground = true) //Etiqueta que muestra la vista previa sin tener que compilar.
@Composable
fun DefaultPreview() {
    AppMarcosTheme {
        Greeting("Marcos")
    }
}