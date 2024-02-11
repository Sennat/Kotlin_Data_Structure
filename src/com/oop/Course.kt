package com.oop

import java.time.LocalDate

data class Course(
    val courseID: String,
    val courseName: String,
    val courseSemester: String,
    val courseDuration: Int,
    val courseSize: Int,
    val courseInstructor: Instructor,
    val courseStart: LocalDate,
    val courseEnd: LocalDate
) {
    override fun toString(): String {
        return "\n==== LIST OF COURSES ====\n" +
                "Course ID: $courseID\n" +
                "Course Name: $courseName\n" +
                "Course Semester: $courseSemester\n" +
                "Course Duration: $courseDuration Weeks\n" +
                "Course Size: $courseSize\n" +
                "Course Instructor: ${courseInstructor.firstName} ${courseInstructor.lastName}\n" +
                "Start Date: $courseStart\n" +
                "End Date: $courseEnd"
    }
}
