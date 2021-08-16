package com.mo22sen.hellocompose.data.repository

import com.mo22sen.hellocompose.data.model.News
import com.mo22sen.hellocompose.network.ResultCall
import com.mo22sen.hellocompose.network.api.NewsService
import com.mo22sen.hellocompose.utils.safeApiCall

class NewsRepositoryImpl(private val newsService: NewsService) : NewsRepository {

    override suspend fun fetchNews(): ResultCall<News> = safeApiCall {
        val response = newsService.getNews()
        return@safeApiCall ResultCall.Success(response)
    }
}