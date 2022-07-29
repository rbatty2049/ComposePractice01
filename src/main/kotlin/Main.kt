// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import androidx.compose.material.MaterialTheme
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState

@Composable
@Preview
fun App() {
    var text by remember { mutableStateOf("Hello, World!") }
    var calcSmp : CalcSmp
    MaterialTheme {
        calcSmp = CalcSmp()
        Button(onClick = {
            text = calcSmp.calcSmp(5).toString()
        }) {
            Text(text)
        }
    }
}

fun main() = application {
    Window(onCloseRequest = ::exitApplication,
            title = "TITLE?",
            state  = rememberWindowState(width = 300.dp, height = 300.dp)
    ) {



        App()
    }
}
