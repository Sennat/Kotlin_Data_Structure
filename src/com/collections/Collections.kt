package com.collections

class Collections {

    fun iterateData() {
        /*println()
        println("==== PRINT ITERATOR ====")
        Employees.employees.iterator().let {
            while (it.hasNext()) {
                println(it.next())
            }
        }*/

       /* println()
        println("==== PRINT FOR LOOP ====")
        Employees.employees.let {
            for (item in it) {
                println(item)
            }
        }*/

        println()
        println("==== PRINT FOREACH LOOP ====")
        Employees.employees.forEach {
            println(it)
        }

        /*println()
        println("==== PRINT FOREACH BY INDEX ====")
        Employees.employees.forEachIndexed { index, employee ->
            println("$index - $employee").toString()
        }*/
    }

    fun mapData() {
        val employee = Employees.employees.map { id ->
            "${id.emplyId} - ${id.firstName}"
        }.joinToString("\n")

        println()
        println("==== PRINT MAP ====")
        println(employee)
    }

    fun flatMapData() {
        val employee = Employees.employees.flatMap { list -> list.department.department.map { it.toString() } }
        println()
        println("==== PRINT FLATMAP ====")
        println(employee)
    }

    fun filterData() {
        val employee = Employees.employees.filter { it.salary > 75000.00 }.distinct()
        println()
        println("==== PRINT FILTER ====")
        println(employee)
    }

    fun sortData() {
        println()
        println("==== PRINT FILTER ====")
        Employees.employees.sortedBy { item -> item.birthDate }.forEach { println(it) }
    }


}