package com.adrianczuczka.crossedoff.listdetails.viewmodel

import androidx.lifecycle.ViewModel
import com.adrianczuczka.crossedoff.listdetails.repository.ListDetailsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ListDetailsViewModel @Inject constructor(
    private val repository: ListDetailsRepository,
) : ViewModel() {
}