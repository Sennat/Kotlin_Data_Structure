package com.oop

class StudentEnrollment : Enrollment() {

    fun enrollStudent(student: Student) {
        if (isStudentEnrolled(student)) {
            println("Student ${student.firstName} has been enrolled")
        } else {
            println("Student ${student.firstName} couldn't be enrolled")
        }
    }

    fun getEnrolledStudent(studentID: String): Student? = getStudentById(studentID)

    fun getEnrolledStudents(): List<Student> {
        return getEnrollmentList()
    }

}