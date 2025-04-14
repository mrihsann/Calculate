package com.ihsanarslan.calculate.calculate_use_case

import com.ihsanarslan.calculate.CaclculateRepository

class BolUseCase {

    val repository = CaclculateRepository()

    fun bol(sayi1: Int, sayi2: Int): Int {
        return repository.bol(sayi1 = sayi1.toString(),sayi2 = sayi2.toString())
    }
}