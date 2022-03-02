package com.lucascabral.core.data.repository

import androidx.paging.PagingSource
import com.lucascabral.core.domain.model.Character

interface CharactersRepository {

    fun getCharacters(query: String): PagingSource<Int, Character>
}