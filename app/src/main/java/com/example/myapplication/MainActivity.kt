package com.example.myapplication

import android.graphics.Camera
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.animation.animate
import androidx.compose.foundation.Image
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            NewStory()
        }
    }

    @Composable
    fun NewStory() {
        val image = imageResource(R.drawable.header)
        val typography = MaterialTheme.typography
        MaterialTheme {
            Column(modifier = Modifier.padding(16.dp)){

                val imageModifier = Modifier
                        .preferredHeight(180.dp)
                        .fillMaxWidth()
                        .clip(shape = RoundedCornerShape(4.dp))

                Image(image, modifier = imageModifier, contentScale = ContentScale.Crop)
                Spacer(modifier = Modifier.preferredHeight(16.dp))
                Text("A day wandering through the sandhills in Shark Fin Cove, and a few of the sights I saw", style = typography.h4, maxLines = 3, overflow = TextOverflow.Ellipsis)
                Text("Davenport, California", style = typography.body1)
                Text("December 2018", style = typography.body2)
            }
        }
    }
    @Preview
    @Composable
    fun PreviewGreeting() {
        NewStory()
    }
}
