package com.oop

class StudentEnrollment : Enrollment {
    private var enrollmentList = mutableListOf<Student>()

    fun enrollStudent(student: Student) {
        if (isStudentEnrolled(student)) {
            println("Opps! Student already enrolled")
        } else {
            enrollmentList.add(student)
        }
    }

    override fun isStudentEnrolled(student: Student): Boolean {
        return enrollmentList.contains(student)
    }

    fun getEnrolledStudents(): List<Student> {
        return enrollmentList
    }

}