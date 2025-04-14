package com.ihsanarslan.calculate

class CaclculateRepository : Calculate, CalculateExtra {

    override fun topla(sayi1: String, sayi2: String) : Int{
        return sayi1.toInt() + sayi2.toInt()
    }

    override fun cikar(sayi1: String, sayi2: String) : Int{
        return sayi1.toInt() - sayi2.toInt()
    }

    override fun carp(sayi1: String, sayi2: String) : Int{
        return sayi1.toInt() * sayi2.toInt()
    }

    override fun bol(sayi1: String, sayi2: String) : Int{
        return sayi1.toInt() / sayi2.toInt()
    }

    override fun bol2(sayi1: Int, sayi2: Int): Int {
        return 0
    }

}