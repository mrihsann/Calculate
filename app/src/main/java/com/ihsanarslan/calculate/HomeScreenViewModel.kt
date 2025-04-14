package com.ihsanarslan.calculate

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ihsanarslan.calculate.calculate_use_case.BolUseCase
import com.ihsanarslan.calculate.calculate_use_case.CarpUseCase
import com.ihsanarslan.calculate.calculate_use_case.CikarUseCase
import com.ihsanarslan.calculate.calculate_use_case.ToplaUseCase

class HomeScreenViewModel : ViewModel(){

    val topla = ToplaUseCase()
    val cikar = CikarUseCase()
    val carp = CarpUseCase()
    val bol = BolUseCase()

    var sonuc = MutableLiveData<Int>(0)

    fun topla(sayi1: String, sayi2: String){
        sonuc.value = topla.topla(sayi1 = sayi1.toInt(),sayi2 = sayi2.toInt())
    }

    fun cikar(sayi1: String, sayi2: String){
        sonuc.value = cikar.cikar(sayi1 = sayi1.toInt(),sayi2 = sayi2.toInt())
    }

    fun carp(sayi1: String, sayi2: String){
        sonuc.value = carp.carp(sayi1 = sayi1.toInt(),sayi2 = sayi2.toInt())
    }

    fun bol(sayi1: String, sayi2: String){
        sonuc.value = bol.bol(sayi1 = sayi1.toInt(),sayi2 = sayi2.toInt())
    }

}