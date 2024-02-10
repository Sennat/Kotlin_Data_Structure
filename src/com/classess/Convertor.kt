package com.classess

import java.util.*

class Convertor() : Calculation {
    override var title: String = ""
    private var reader = Scanner(System.`in`)
    private var userInput = 0
    private var given = 0F
    private var temperature = 0F

    init {
        title = ("==== Temperature Convertor ====")
        print("Please select 1 for CELSIUS 2 for FAHRENHEIT\t")
        userInput = reader.nextInt()
        do {
            if (userInput == 1 || userInput == 2) {
                break
            } else {
                print("Please select 1 for CELSIUS 2 for FAHRENHEIT\t")
                userInput = reader.nextInt()
            }
        } while (true)
    }

    //Alternator temperature convertor
    override fun operation() {
        when (userInput) {
            1 -> {
                print("Enter CELSIUS temperature\t")
                given = reader.nextFloat()
                temperature = toCelsius(given)
                println("Temperature: ${String.format(Locale.US, "%.2f", temperature)} ℉")
            }

            2 -> {
                print("Enter FAHRENHEIT temperature\t")
                given = reader.nextFloat()
                temperature = toFahrenheit(given)
                println("Temperature: ${String.format(Locale.US, "%.2f", temperature)} ℃")
            }
        }
    }

    //Convert to fahrenheit
    private fun toFahrenheit(value: Float) = (value - 32) * 5 / 9

    //Convert to celsius
    private fun toCelsius(value: Float) = (value * 9 / 5) + 32

}