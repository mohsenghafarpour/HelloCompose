package com.mo22sen.hellocompose.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mo22sen.hellocompose.data.repository.NewsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val repo: NewsRepository) : ViewModel() {

    fun fetchNews() = viewModelScope.launch {
        repo.fetchNews()
    }

}