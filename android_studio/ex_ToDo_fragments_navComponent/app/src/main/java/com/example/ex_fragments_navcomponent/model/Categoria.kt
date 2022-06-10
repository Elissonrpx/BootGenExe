package com.example.ex_fragments_navcomponent.model

data class Categoria(
    var id: Long,
    var descricao: String,
    var categoria: List<Tarefa>
) {
}