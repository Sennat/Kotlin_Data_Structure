package com.oop

class CourseRegistration : Registration {
    private var registrationList = mutableMapOf<String, Student>()

    override fun registerCourse(course: Course, student: Student) {
        if (!isStudentRegistered(student)) {
            registrationList[Courses.courses.random().courseID] = student
        }
    }

    private fun isStudentRegistered(student: Student): Boolean {
        return registrationList.containsKey(student.studentID)
    }

    fun getRegistrationList(): MutableMap<String, Student> {
        return registrationList
    }

}