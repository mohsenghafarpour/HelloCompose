package com.mo22sen.hellocompose.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mo22sen.hellocompose.data.model.News
import com.mo22sen.hellocompose.data.repository.NewsRepository
import com.mo22sen.hellocompose.network.ResultCall
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val repo: NewsRepository) : ViewModel() {

    private val _news = MutableLiveData<News>()
    val news: LiveData<News>
        get() = _news

    fun fetchNews() = viewModelScope.launch {
        when (val result = repo.fetchNews()) {
            is ResultCall.Success -> {
                _news.value = result.data
            }
            is ResultCall.Error -> {
            }
        }
    }

}