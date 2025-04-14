package com.ihsanarslan.calculate.calculate_use_case

import com.ihsanarslan.calculate.CaclculateRepository

class ToplaUseCase {

    val repository = CaclculateRepository()

    fun topla(sayi1: Int, sayi2: Int): Int {
        return repository.topla(sayi1 = sayi1.toString(),sayi2 = sayi2.toString())
    }
}