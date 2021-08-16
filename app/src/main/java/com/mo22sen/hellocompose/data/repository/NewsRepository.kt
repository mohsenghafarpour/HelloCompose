package com.mo22sen.hellocompose.data.repository

import com.mo22sen.hellocompose.data.model.News
import com.mo22sen.hellocompose.network.ResultCall

interface NewsRepository {

    suspend fun fetchNews(): ResultCall<News>
}