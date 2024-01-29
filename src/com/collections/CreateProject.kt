package com.collections

import java.time.LocalDate
import kotlin.random.Random

class CreateProject : Project {
    private lateinit var project: PlannedProject
    private var projList = mutableSetOf<PlannedProject>()
    private val devList = mutableListOf<Map<String, String>>()
    private val randNum = getRandInt()

    override fun createProject(): Set<PlannedProject> {
        println("\n====CREATE NEW PROJECT====")
        val emply = Employees.employees.filter {
            it.department.department.contains("Information Technology")
        }.forEach {

                project = PlannedProject(
                    "PROJ".plus(Random.nextInt(100, 1000)),
                    "EMPLYSYS",
                    getItem("Android Project Manager", it),
                    getProjectDevelopers(it),
                    randNum,
                    LocalDate.of(2024, 1, 28).plusDays(Random.nextLong(365)).toString()
                )
                projList.add(project)

        }
        return projList
    }

    private fun getRandInt() = Random.nextInt(4, 8)

    private fun getItem(str: String, emply: Employee): String {
        return if(str in emply.jobTitle) {
            "{$emply.lastName, ${emply.firstName}}"
        } else ""
    }
    private fun getProjectDevelopers(employee: Employee): MutableList<Map<String, String>> {
        if ("Android" in employee.jobTitle) {
            if (devList.size < randNum) {
                devList.add(mapOf(employee.emplyId to employee.lastName))
            }
        }
        return devList
    }
}