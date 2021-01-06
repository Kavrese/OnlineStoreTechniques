package com.example.onlinestoretechniques.model

class ModelProduct (
        var name: String? = null,
        var category: String? = null,
        var brend: String? = null,
        var price: String? = null,
        var description: String = "Отсутсвует",
        var photos: List<String> = arrayListOf("empty"),
        var colors: List<Int> = arrayListOf(0)
)