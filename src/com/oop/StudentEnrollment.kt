package com.oop

class StudentEnrollment : Enrollment {
    private var enrollmentList = mutableListOf<Student>()
    override fun isStudentEnrolled(student: Student): Boolean {
        return enrollmentList.contains(student)
    }

    fun enrollStudent(student: Student) {
        if (!isStudentEnrolled(student)) {
            enrollmentList.add(student)
        }
    }

    fun getEnrolledStudents(): List<Student> {
        return enrollmentList
    }

}