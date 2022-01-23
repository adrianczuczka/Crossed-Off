package com.adrianczuczka.crossedoff.lists.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.adrianczuczka.crossedoff.listdetails.repository.ListDetailsRepository
import com.adrianczuczka.crossedoff.lists.model.UserList
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class UserListsViewModel @Inject constructor(
    private val repository: ListDetailsRepository,
) : ViewModel() {

    private val _lists = MutableLiveData<List<UserList>>()
    val lists: LiveData<List<UserList>> get() = _lists

    private val _isRefreshing = MutableLiveData<Boolean>()
    val isRefreshing: LiveData<Boolean> get() = _isRefreshing

    fun fetchLists() {
        _isRefreshing.value = true
        _lists.value = listOf(
            UserList("test title 1"),
            UserList("test title 2"),
            UserList("test title 3")
        )
        _isRefreshing.value = false
    }
}