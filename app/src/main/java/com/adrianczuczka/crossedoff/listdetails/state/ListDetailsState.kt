package com.adrianczuczka.crossedoff.listdetails.state

import com.adrianczuczka.crossedoff.lists.model.UserList

data class ListDetailsState(
    val items: List<UserList>,
)