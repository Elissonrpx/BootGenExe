package com.example.ex_fragments_navcomponent.api

import com.example.ex_fragments_navcomponent.model.Categoria
import retrofit2.Response

class Repository {

    suspend fun listCategoria(): Response<List<Categoria>>{

        return RetrofitInstance.api.listCategoria()
    }

}