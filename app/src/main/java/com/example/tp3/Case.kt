package com.example.tp3

import java.io.Serializable

class Case( priceGar: Int , price:Int, description: String , link:String, img : Int ):Serializable{
    val priceGar = priceGar
    val price = price
    val description = description
    val link = link
    val img = img
}