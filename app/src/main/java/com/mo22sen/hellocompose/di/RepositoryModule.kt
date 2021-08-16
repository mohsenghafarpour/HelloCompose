package com.mo22sen.hellocompose.di

import com.mo22sen.hellocompose.data.repository.NewsRepository
import com.mo22sen.hellocompose.data.repository.NewsRepositoryImpl
import com.mo22sen.hellocompose.network.api.NewsService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    fun subscribeRepository(service: NewsService): NewsRepository {
        return NewsRepositoryImpl(service)
    }
}