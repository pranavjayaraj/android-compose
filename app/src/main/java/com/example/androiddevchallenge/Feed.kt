package com.example.androiddevchallenge

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable

import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.example.androiddevchallenge.components.Puppies
import com.example.androiddevchallenge.model.Puppy
import com.example.androiddevchallenge.model.PuppyRepo

@Composable
fun Feed(
    onPuppyClick: (Long) -> Unit,
    modifier: Modifier = Modifier
) {
    val puppyList = remember { PuppyRepo.getPuppies() }
    Feed(
        puppyList,
        onPuppyClick,
        modifier
    )
}

@Composable
private fun Feed(
    puppies: List<Puppy>,
    onPuppyClick: (Long) -> Unit,
    modifier: Modifier = Modifier
) {
    Column(modifier) {
        Puppies(
            puppies = puppies,
            onPuppyClick = onPuppyClick,
            modifier = modifier
        )
    }
}
