package com.example.ex_fragments_navcomponent.api

import com.example.ex_fragments_navcomponent.model.Categoria
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET ("categoria")
    suspend fun listCategoria(): Response<List<Categoria>>
}