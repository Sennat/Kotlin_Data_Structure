package com.classes

import java.util.*

class Calculator : Calculation {
    private var reader = Scanner(System.`in`)
    private var operator: Char = '+'
    private var result = 0.0
    override var title = ""
    private var numbers = IntArray(2)

    init {
        title = ("==== Simple Calculator ====")
        print("Please select operators(+, -, *, /)\t")
        operator = reader.next().elementAt(0)
        do {
            if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
                break
            } else {
                print("Please select operators(+, -, *, /)\t")
            }
        } while (true)

    }

    override fun operation() {
        print("Enter the two number separating by space\t")
        //val num= readln().trim().split(", ").toList().toTypedArray()
        val num= readln().split(" ").toList().toTypedArray()
        numbers[0] = num[0].toInt()
        numbers[1] = num[1].toInt()

        when (operator) {
            '+' -> {
                println("Result: ${addNumbers(numbers.component1(), numbers.component2())}")
            }

            '-' -> {
                println("Result: ${subtractNumbers(numbers.component1(), numbers.component2())}")
            }

            '*' -> {
                println("Result: ${multiplyNumbers(numbers.component1(), numbers.component2())}")
            }

            '/' -> {
                do {
                    if (numbers.component2() == 0) {
                        print("Sorry! number can't divide by zero, please enter a divider number\t")
                        numbers[1] = reader.nextInt()
                    } else {
                        println("Result: ${divideNumbers(numbers.component1(), numbers.component2()).toDouble()}")
                        break
                    }
                } while (true)
            }
        }
    }

    private fun addNumbers(first: Int, second: Int) = first.plus(second)
    private fun subtractNumbers(first: Int, second: Int) = first.minus(second)
    private fun multiplyNumbers(first: Int, second: Int) = first.times(second)
    private fun divideNumbers(first: Int, second: Int) = first.div(second)

}