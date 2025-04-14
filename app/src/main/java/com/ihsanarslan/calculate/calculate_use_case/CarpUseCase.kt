package com.ihsanarslan.calculate.calculate_use_case

import com.ihsanarslan.calculate.CaclculateRepository

class CarpUseCase {
    val repository = CaclculateRepository()

    fun carp(sayi1: Int, sayi2: Int): Int {
        return repository.carp(sayi1 = sayi1.toString(),sayi2 = sayi2.toString())
    }
}