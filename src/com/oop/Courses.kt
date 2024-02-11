package com.oop

import java.time.LocalDate
import kotlin.random.Random

object Courses {
    private val localDate: LocalDate by lazy { LocalDate.now().plusMonths(Random.nextLong(1, 12)) }

    val courses = listOf<Course>(
        Course(
            "PSY".plus(getRandNum()),
            "Data Structure 1",
            Semester.entries.shuffled().first().toString(),
            12,
            25,
            Instructor("Anna", "Tylor", "BS Computer Science", "Information Technology", "Data Structure"),
            localDate,
            localDate.plusWeeks(12)
        ),
    )

    private fun getRandNum() = Random.nextInt(100, 999)

    //private fun localDate(): LocalDate = localDate.plusMonths(Random.nextLong(1, 12))
}