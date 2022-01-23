package com.adrianczuczka.crossedoff.lists.state

import com.adrianczuczka.crossedoff.lists.model.UserList

data class UserListsState(
    val items: List<UserList>,
)