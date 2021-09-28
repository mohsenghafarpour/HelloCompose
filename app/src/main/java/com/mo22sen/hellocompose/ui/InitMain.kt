package com.mo22sen.hellocompose.ui

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mo22sen.hellocompose.data.model.News

@Composable
fun InitMainActivity(viewModel : MainViewModel) {
    Scaffold(
        content = {
//            Text(text = "Hello Compose", color = Color.DarkGray, fontSize = 32.sp)
            viewModel.news.value?.let { NewsContent(news = it) }
        }
    )
}

@Composable
fun NewsContent(news: News) {
    val newsList = remember { news.articles }
    LazyColumn(
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
    ) {
        items(
            items = newsList,
            itemContent = {
                NewsListItem(article = it)
            }
        )
    }
}