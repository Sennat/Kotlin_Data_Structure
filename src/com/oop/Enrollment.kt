package com.oop

open class Enrollment {
    companion object {
        private var enrollmentList = mutableListOf<Student>()
    }

    open fun isStudentEnrolled(student: Student): Boolean {
        return if (!enrollmentList.contains(student)) {
            enrollmentList.add(student)
            //enrollmentList.forEach { println(it) }
            true
        } else {
            false
        }
    }

    protected open fun getStudentById(studentID: String): Student? {
        enrollmentList.forEach {
            if (it.studentID == studentID) {
                return it
            }
        }
        return null
    }

    open fun getEnrollmentList(): List<Student> {
        return enrollmentList
    }

}