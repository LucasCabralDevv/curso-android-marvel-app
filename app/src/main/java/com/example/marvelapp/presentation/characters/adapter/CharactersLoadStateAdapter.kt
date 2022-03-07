package com.example.marvelapp.presentation.characters.adapter

import android.view.ViewGroup
import androidx.paging.LoadState
import androidx.paging.LoadStateAdapter
import com.example.marvelapp.presentation.characters.viewholder.CharactersLoadMoreStateViewHolder

class CharactersLoadStateAdapter(
    private val retry: () -> Unit
) : LoadStateAdapter<CharactersLoadMoreStateViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup, loadState: LoadState
    ) = CharactersLoadMoreStateViewHolder.create(parent, retry)

    override fun onBindViewHolder(
        holder: CharactersLoadMoreStateViewHolder,
        loadState: LoadState
    ) = holder.bind(loadState)
}