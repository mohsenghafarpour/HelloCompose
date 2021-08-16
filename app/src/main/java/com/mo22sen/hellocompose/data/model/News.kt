package com.mo22sen.hellocompose.data.model

import com.google.gson.annotations.SerializedName

data class News(
    @SerializedName("status")
    val status: String,
    @SerializedName("totalResults")
    val totalResult: Int,
    @SerializedName("articles")
    val articles: List<Article>
)
