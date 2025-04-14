package com.ihsanarslan.calculate

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeScreenViewModel : ViewModel(){

    val matRepository = CaclculateRepository()

    var sonuc = MutableLiveData<Int>(0)

    fun topla(sayi1: String, sayi2: String){
        sonuc.value = matRepository.topla(sayi1 = sayi1,sayi2 = sayi2)
    }

    fun cikar(sayi1: String, sayi2: String){
        sonuc.value = matRepository.cikar(sayi1 = sayi1,sayi2 = sayi2)
    }

    fun carp(sayi1: String, sayi2: String){
        sonuc.value = matRepository.carp(sayi1 = sayi1,sayi2 = sayi2)
    }

    fun bol(sayi1: String, sayi2: String){
        sonuc.value = matRepository.bol(sayi1 = sayi1,sayi2 = sayi2)
    }

}