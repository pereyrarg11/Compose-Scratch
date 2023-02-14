package com.pereyrarg11.composescratch

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pereyrarg11.composescratch.ui.theme.ComposeScratchTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeScratchTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    //MyBox()
                    //MyColumn()
                    //MyRow()
                    MyComplexLayout()
                }
            }
        }
    }
}

@Composable
fun MyComplexLayout() {
    Column(Modifier.fillMaxSize()) {
        Box(
            Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.Cyan),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "Cyan")
        }
        MyVerticalSpacer(height = 15)
        Row(
            Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Red),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "Red")
            }
            MyHorizontalSpacer(width = 50)
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Green), contentAlignment = Alignment.Center
            ) {
                Text(text = "Green")
            }
        }
        MyVerticalSpacer(height = 30)
        Box(
            Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.Magenta),
            contentAlignment = Alignment.BottomCenter
        ) {
            Text(text = "Magenta")
        }
    }
}

@Composable
fun MyVerticalSpacer(height: Int) {
    Spacer(modifier = Modifier
        .height(height.dp)
        .fillMaxWidth()
        .background(Color.Black))
}

@Composable
fun MyHorizontalSpacer(width: Int) {
    Spacer(modifier = Modifier
        .width(width.dp)
        .fillMaxHeight()
        .background(Color.Gray))
}

@Composable
fun MyRow() {
    Row(
        Modifier
            .fillMaxSize()
            .horizontalScroll(rememberScrollState())
    ) {
        Text(
            text = "Ejemplo 1", modifier = Modifier
                .background(Color.Cyan)
                .width(100.dp)
        )
        Text(
            text = "Ejemplo 2", modifier = Modifier
                .background(Color.Yellow)
                .width(100.dp)
        )
        Text(
            text = "Ejemplo 3", modifier = Modifier
                .background(Color.Green)
                .width(100.dp)
        )
        Text(
            text = "Ejemplo 4", modifier = Modifier
                .background(Color.Red)
                .width(100.dp)
        )
        Text(
            text = "Ejemplo 5", modifier = Modifier
                .background(Color.Blue)
                .width(100.dp)
        )
        Text(
            text = "Ejemplo 6", modifier = Modifier
                .background(Color.Gray)
                .width(100.dp)
        )
    }
}

@Composable
fun MyColumn() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()), verticalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = "Ejemplo 1", modifier = Modifier
                .background(Color.Cyan)
                .fillMaxWidth()
                .height(100.dp)
        )
        Text(
            text = "Ejemplo 2", modifier = Modifier
                .background(Color.Red)
                .fillMaxWidth()
                .height(100.dp)
        )
        Text(
            text = "Ejemplo 3", modifier = Modifier
                .background(Color.Green)
                .fillMaxWidth()
                .height(100.dp)
        )
        Text(
            text = "Ejemplo 4", modifier = Modifier
                .background(Color.Yellow)
                .fillMaxWidth()
                .height(100.dp)
        )
        Text(
            text = "Ejemplo 5", modifier = Modifier
                .background(Color.Cyan)
                .fillMaxWidth()
                .height(100.dp)
        )
        Text(
            text = "Ejemplo 6", modifier = Modifier
                .background(Color.Red)
                .fillMaxWidth()
                .height(100.dp)
        )
        Text(
            text = "Ejemplo 7", modifier = Modifier
                .background(Color.Green)
                .fillMaxWidth()
                .height(100.dp)
        )
        Text(
            text = "Ejemplo 8", modifier = Modifier
                .background(Color.Yellow)
                .fillMaxWidth()
                .height(100.dp)
        )
        Text(
            text = "Ejemplo 9", modifier = Modifier
                .background(Color.Cyan)
                .fillMaxWidth()
                .height(100.dp)
        )
        Text(
            text = "Ejemplo 10", modifier = Modifier
                .background(Color.Red)
                .fillMaxWidth()
                .height(100.dp)
        )
        Text(
            text = "Ejemplo 11", modifier = Modifier
                .background(Color.Green)
                .fillMaxWidth()
                .height(100.dp)
        )
        Text(
            text = "Ejemplo 12", modifier = Modifier
                .background(Color.Yellow)
                .fillMaxWidth()
                .height(100.dp)
        )
    }
}

@Composable
fun MyBox() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Box(
            modifier = Modifier
                .width(250.dp)
                .height(250.dp)
                .background(Color.Cyan),
            contentAlignment = Alignment.Center,
        ) {
            Text(text = "Esto es un ejemplo")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeScratchTheme {
        //MyBox()
        //MyColumn()
        //MyRow()
        MyComplexLayout()
    }
}