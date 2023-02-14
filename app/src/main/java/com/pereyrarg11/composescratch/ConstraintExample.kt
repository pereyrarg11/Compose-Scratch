package com.pereyrarg11.composescratch

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
fun MyConstraintLayout() {
    ConstraintLayout(Modifier.fillMaxSize()) {
        val (redBox, blueBox, yellowBox, magentaBox, greenBox) = createRefs()

        Box(modifier = Modifier
            .size(125.dp)
            .background(Color.Red)
            .constrainAs(redBox) {
                start.linkTo(parent.start)
                top.linkTo(parent.top)
                end.linkTo(parent.end)
                bottom.linkTo(parent.bottom)
            })

        Box(modifier = Modifier
            .size(125.dp)
            .background(Color.Blue)
            .constrainAs(blueBox) {
                top.linkTo(redBox.bottom)
                start.linkTo(redBox.end)
            })

        Box(modifier = Modifier
            .size(125.dp)
            .background(Color.Yellow)
            .constrainAs(yellowBox) {
                end.linkTo(redBox.start)
                bottom.linkTo(redBox.top)
            })

        Box(modifier = Modifier
            .size(125.dp)
            .background(Color.Magenta)
            .constrainAs(magentaBox) {
                start.linkTo(redBox.end)
                bottom.linkTo(redBox.top)
            })

        Box(modifier = Modifier
            .size(125.dp)
            .background(Color.Green)
            .constrainAs(greenBox) {
                end.linkTo(redBox.start)
                top.linkTo(redBox.bottom)
            })
    }
}

@Preview
@Composable
fun GuidelineConstraintLayout() {
    ConstraintLayout(Modifier.fillMaxSize()) {
        val topGuide = createGuidelineFromTop(0.1f)
        val startGuide = createGuidelineFromStart(0.25f)

        val redBox = createRef()
        Box(modifier = Modifier
            .size(125.dp)
            .background(Color.Red)
            .constrainAs(redBox) {
                top.linkTo(topGuide)
                start.linkTo(startGuide)
            })
    }
}