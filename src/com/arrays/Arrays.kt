package com.arrays

import java.util.*

class Arrays {

    private val strArray = arrayOf("Kotlin", "Java", "Python", "C++", "Swift")
    private val intArray = IntArray(requestNum()) {
        i -> if(i % 2 == 0) i * i else i
    }

    private fun requestNum(): Int {
        val reader = Scanner(System.`in`)
        print("Enter a number: ")
        return reader.nextInt()
    }

    fun createStringArray(): Array<String> {
        return strArray
    }

    fun createIntArray(): IntArray {
        return intArray
    }

}