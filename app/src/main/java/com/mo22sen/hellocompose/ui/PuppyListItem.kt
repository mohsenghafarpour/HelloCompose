package com.mo22sen.hellocompose.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.mo22sen.hellocompose.data.model.Article
import com.mo22sen.hellocompose.theme.gray100
import com.mo22sen.hellocompose.theme.typography

@Composable
fun NewsListItem(article: Article) {
    Card(
        modifier = Modifier
            .padding(horizontal = 8.dp, vertical = 8.dp)
            .fillMaxWidth(),
        elevation = 2.dp,
        backgroundColor = gray100,
        shape = RoundedCornerShape(corner = CornerSize(16.dp)),
    ) {
        Row(Modifier.clickable { }) {
            Column(
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth()
                    .align(Alignment.CenterVertically)
            ) {
                Image(
                    painter = rememberImagePainter(article.image),
                    contentDescription = null,
                    modifier = Modifier.size(width = 450.dp,height = 150.dp),
                    alignment = Alignment.Center
                )
                Text(text = article.title, style = typography.h6)
                Text(text = article.description, style = typography.caption)
            }
        }
    }
}
