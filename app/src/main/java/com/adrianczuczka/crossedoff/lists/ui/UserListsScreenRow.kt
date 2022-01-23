package com.adrianczuczka.crossedoff.lists.ui

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.adrianczuczka.crossedoff.lists.model.UserList

@Composable
fun UserListsScreenRow(
    userList: UserList,
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 8.dp),
    ) {
        Text(
            modifier = Modifier
                .padding(
                    start = 16.dp,
                    top = 8.dp,
                    bottom = 8.dp
                ),
            text = userList.title
        )
    }
}