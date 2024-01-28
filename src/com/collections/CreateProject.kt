package com.collections

import java.time.LocalDate
import kotlin.random.Random

class CreateProject : Project {
    private lateinit var project: PlannedProject
    private var projList = mutableSetOf<PlannedProject>()

    override fun createProject(): Set<PlannedProject> {
        println("\n====CURRENT NEW PROJECT====")
        val emply = Employees.employees.filter {
            it.department.department.contains("Information Technology")
        }.forEach {
            if (it.jobTitle == "Android Project Manager") {
                project = PlannedProject(
                    "PROJ".plus(Random.nextInt(100,1000)),
                    "EMPLYSYS",
                    "${it.lastName}, ${it.firstName}",
                    getRandInt(),
                    LocalDate.now().toString()
                )
                projList.add(project)
            }
        }
        return projList
    }

    private fun getRandInt() = Random.nextInt(4,8) + 1
}