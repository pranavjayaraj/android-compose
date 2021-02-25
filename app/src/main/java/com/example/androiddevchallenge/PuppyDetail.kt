package com.example.androiddevchallenge

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androiddevchallenge.components.PuppyDetailImage
import com.example.androiddevchallenge.model.Puppy
import com.example.androiddevchallenge.model.PuppyRepo
import com.example.androiddevchallenge.ui.theme.MyTheme

private val BottomBarHeight = 56.dp
private val TitleHeight = 128.dp
private val GradientScroll = 180.dp
private val ImageOverlap = 115.dp
private val MinTitleOffset = 56.dp
private val HzPadding = Modifier.padding(horizontal = 24.dp)

class PuppyDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val id = intent.getLongExtra("id", 0)
        setContent {
            MyTheme {
                PuppyDetail(puppyId = id, upPress = { /*TODO*/ })
            }
        }
    }

    @Composable
    fun PuppyDetail(
        puppyId: Long,
        upPress: () -> Unit
    ) {
        val puppy = remember(puppyId) { PuppyRepo.getPuppy(puppyId) }

        Box(Modifier.fillMaxSize()) {
            val scroll = rememberScrollState(0)
            Header()
            Body(puppy, scroll)
            Image(puppy.imageUrl)
            Title(puppy)
        }
    }

    @Composable
    private fun Header() {
        Spacer(
            modifier = Modifier
                .height(280.dp)
                .fillMaxWidth()
        )
    }


    @Composable
    private fun Up(upPress: () -> Unit) {
        IconButton(
            onClick = upPress,
            modifier = Modifier
                .padding(horizontal = 16.dp, vertical = 10.dp)
                .size(36.dp)
        ) {
            Icon(
                imageVector = Icons.Outlined.ArrowBack,
                contentDescription = "Back"
            )
        }
    }

    @Composable
    private fun Body(
        puppy: Puppy,
        scroll: ScrollState
    ) {
        Column {
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(MinTitleOffset)
            )
            Column(
                modifier = Modifier.verticalScroll(scroll)
            ) {
                Spacer(Modifier.height(GradientScroll))
                Column {
                    Spacer(Modifier.height(ImageOverlap))
                    Spacer(Modifier.height(TitleHeight))

                    Spacer(Modifier.height(16.dp))
                    Text(
                        text = stringResource(R.string.detail_header),
                        style = MaterialTheme.typography.overline,
                        modifier = HzPadding
                    )
                    Spacer(Modifier.height(4.dp))
                    Text(
                        text = puppy.detail,
                        style = MaterialTheme.typography.body1,
                        modifier = HzPadding
                    )

                    Spacer(Modifier.height(4.dp))

                    Spacer(Modifier.height(16.dp))

                    Spacer(
                        modifier = Modifier
                            .padding(bottom = BottomBarHeight)
                            .height(8.dp)
                    )
                }
            }
        }
    }

    @Composable
    private fun Title(puppy: Puppy) {
        Column(
            verticalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.padding(top = 300.dp)
                .heightIn(min = TitleHeight)
        ) {
            Spacer(Modifier.height(16.dp))
            Text(
                text = "Adopt ${puppy.name}",
                style = MaterialTheme.typography.h4,
                modifier = HzPadding
            )
            Spacer(Modifier.height(4.dp))
            Text(
                text = "${puppy.age.toString()} years old",
                fontSize = 20.sp,
                style = MaterialTheme.typography.h6,
                modifier = HzPadding
            )

            Spacer(Modifier.height(8.dp))
        }
    }

    @Composable
    private fun Image(
        imageUrl: String,
    ) {
        PuppyDetailImage(
            imageUrl = imageUrl
        )
    }
}