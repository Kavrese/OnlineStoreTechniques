package com.example.onlinestoretechniques.model

import com.example.onlinestoretechniques.DataProducts

class ModelProductBrand (
    var listPhones: ArrayList<ModelProduct> = DataProducts().listPhones,
    var listTablets: ArrayList<ModelProduct> = DataProducts().listTablets,
    var listTv: ArrayList<ModelProduct> = DataProducts().listTv,
    var listLaptops: ArrayList<ModelProduct> = DataProducts().listLaptops,
    var listCamera: ArrayList<ModelProduct> = DataProducts().listCamera,
    var listWatch: ArrayList<ModelProduct> = DataProducts().listWatch,
    var listHead: ArrayList<ModelProduct> = DataProducts().listHead,
    var listMice: ArrayList<ModelProduct> = DataProducts().listMice,
    var listKey: ArrayList<ModelProduct> = DataProducts().listKey,
    var listPrint: ArrayList<ModelProduct> = DataProducts().listPrint,
)