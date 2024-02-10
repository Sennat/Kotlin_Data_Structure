package com.oop

import kotlin.random.Random
import kotlin.system.exitProcess

class StudentActivity {
    private var registrationList = mutableListOf<Map<String, Student>>()
    private lateinit var course: Course
    private lateinit var student: Student
    private var menu = 0

    init {
        println("==== CITY COLLAGE MANAGEMENT SYSTEM ====")
        println("Please Select To Proceed Next Operation")
        menu().forEach { println(it) }
        menu = readln().toInt()

        when (menu) {
            1 -> {
                enrollStudent()
                println("\nPlease Select To Proceed Next Operation")
                menu().forEach { println(it) }
                menu = readln().toInt()
            }

            2 -> {
                getAllCourses()
                println("\nPlease Select To Proceed Next Operation")
                menu().forEach { println(it) }
                menu = readln().toInt()
            }

            3 -> {
                getAllRegistration()
                println("\nPlease Select To Proceed Next Operation")
                menu().forEach { println(it) }
                menu = readln().toInt()
            }

            4 -> {
                val name = readln()
                searchCourseByName(name)
                println("\nPlease Select To Proceed Next Operation")
                menu().forEach { println(it) }
                menu = readln().toInt()
            }

            5 -> {
                courseRegistration()
                println("\nPlease Select To Proceed Next Operation")
                menu().forEach { println(it) }
                menu = readln().toInt()
            }

            6 -> exitProcess(1)
        }
    }

    private fun menu(): Array<String> {
        val array = arrayOf(
            "ENROLL STUDENT ==> 1",
            "COURSES LIST ==> 2",
            "REGISTRATION LIST ==> 3",
            "SEARCH COURSE BY NAME ==> 4",
            "REGISTER COURSE ==> 5",
            "EXIT ==> 6"
        )
        return array
    }


    private fun enrollStudent() {
        print("Enter Your Firstname: \t")
        val firstname = readln()
        print("Enter Your Lastname: \t")
        val lastname = readln()
        print("Enter Your Gender: \t")
        val gender = readln()
        print("Enter Your Birthdate: \t")
        val birthdate = readln()
        print("Enter Your phone eg. (123) 456-7890: \t")
        val phone = readln()
        student = Student(generateStudentID(), firstname, lastname, gender, birthdate, phone)
        StudentEnrollment().enrollStudent(student)
    }

    private fun getAllCourses() {
        Courses.courses.forEach { println(it) }
    }

    private fun courseRegistration() {
        print("Enter Your Firstname: \t")
        val firstname = readln()
        print("Enter Your Lastname: \t")
        val lastname = readln()
        print("Enter Your Gender: \t")
        val gender = readln()
        print("Enter Your Birthdate: \t")
        val birthdate = readln()
        print("Enter Your phone eg. (123) 456-7890: \t")
        val phone = readln()
        Student(generateStudentID(), firstname, lastname, gender, birthdate, phone)

        println("Please enter course ID or course name:\t")
        val courseIDorName = readln()
        Courses.courses.forEach {
            if (it.courseID.contentEquals(courseIDorName) || it.courseName.contentEquals(courseIDorName)) {
                registrationList.add(mapOf(it.courseID to student))
            }
        }
    }

    private fun generateStudentID() = "STD".plus(Random.nextInt(100, 999))

    private fun getAllRegistration() {
        registrationList.add(CourseRegistration().getRegistrationList())
        registrationList.forEach { println(it) }
    }

    private fun searchCourseByName(name: String) {
        Courses.courses.forEach {
            if (it.courseName.contentEquals(name)) {
                println(it)
            } else {
                println("Sorry!! Course not found")
            }
        }
    }

}