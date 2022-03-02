package com.lucascabral.core.data.repository

interface CharactersRemoteDataSource<T> {

    suspend fun fetchCharacters(query: Map<String, String>): T
}