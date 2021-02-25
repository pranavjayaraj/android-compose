package com.example.androiddevchallenge.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.model.Puppy
import dev.chrisbanes.accompanist.coil.CoilImage

@Composable
fun Puppies(
    puppies: List<Puppy>,
    onPuppyClick: (Long) -> Unit,
    modifier: Modifier = Modifier,
) {
    LazyColumn(
        modifier = modifier,
        contentPadding = PaddingValues(start = 12.dp, end = 12.dp)
    ) {
        items(puppies) { puppy ->
            PuppyItem(puppy, onPuppyClick)
        }
    }
}


@Composable
fun PuppyItem(
    puppy: Puppy,
    onPuppyClick: (Long) -> Unit
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .clickable(onClick = { onPuppyClick(puppy.id) })
            .padding(8.dp)
    ) {
        PuppyImage(
            imageUrl = puppy.imageUrl
        )
        Text(
            text = puppy.name,
            style = MaterialTheme.typography.h5,
            modifier = Modifier.padding(top = 8.dp)
        )
    }
}


@Composable
fun PuppyImage(
    imageUrl: String
) {
    val modifier = Modifier
        .height(180.dp)
        .fillMaxWidth()
    CoilImage(
        data = imageUrl,
        contentDescription = "contentDescription",
        modifier = modifier,
        contentScale = ContentScale.Crop
    )
}

@Composable
fun PuppyDetailImage(
    imageUrl: String
) {
    val modifier = Modifier
        .height(250.dp)
        .fillMaxWidth()
    CoilImage(
        data = imageUrl,
        contentDescription = "contentDescription",
        modifier = modifier,
        contentScale = ContentScale.Crop
    )
}

