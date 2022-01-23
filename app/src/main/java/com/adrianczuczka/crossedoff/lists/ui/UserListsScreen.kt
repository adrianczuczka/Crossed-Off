package com.adrianczuczka.crossedoff.lists.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.adrianczuczka.crossedoff.lists.viewmodel.UserListsViewModel
import com.adrianczuczka.crossedoff.ui.theme.AppTheme
import com.google.accompanist.swiperefresh.SwipeRefresh
import com.google.accompanist.swiperefresh.rememberSwipeRefreshState

@Composable
fun UserListsScreen(
    viewModel: UserListsViewModel = viewModel(),
) {
    val lists by viewModel.lists.observeAsState(listOf())
    val isRefreshing by viewModel.isRefreshing.observeAsState(false)

    viewModel.fetchLists()

    SwipeRefresh(
        state = rememberSwipeRefreshState(isRefreshing),
        onRefresh = { viewModel.fetchLists() },
    ) {
        LazyColumn(
            modifier = Modifier.fillMaxSize()
        ) {
            items(lists) {
                UserListsScreenRow(userList = it)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun UserListsScreenPreview() {

}