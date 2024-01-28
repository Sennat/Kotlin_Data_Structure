package com.arrays

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val array = Arrays()
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Data Structure Create an Array")

    array.createStringArray().forEach { println("List of programing languages: $it") }
    println("")
    array.createIntArray().forEach { println("List of numbers: $it") }
}