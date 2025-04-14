package com.ihsanarslan.calculate.calculate_use_case

import com.ihsanarslan.calculate.CaclculateRepository

class CikarUseCase {
    val repository = CaclculateRepository()

    fun cikar(sayi1: Int, sayi2: Int): Int {
        return repository.cikar(sayi1 = sayi1.toString(),sayi2 = sayi2.toString())
    }
}