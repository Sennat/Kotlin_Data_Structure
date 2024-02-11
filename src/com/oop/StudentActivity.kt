package com.oop

import java.util.*
import kotlin.random.Random
import kotlin.system.exitProcess

class StudentActivity {
    //private var studentsList = mutableListOf<Student>()
    private var registrationList = mutableListOf<Map<String, Student>>()
    private lateinit var course: Course
    private lateinit var student: Student
    private var yesNo = ""

    init {
        println("\n==== CITY COLLAGE MANAGEMENT SYSTEM ====")
        menu()
        do {
            print("\nPlease enter Y to proceed or N to exit:\t")
            yesNo = readln().uppercase(Locale.getDefault())
            if (yesNo.contentEquals("Y")) {
                menu()
            } else {
                exitProcess(1)
            }
        } while (true)

    }

    private fun menu() {
        println("Please Select To Proceed Next Operation")
        menuSelector().forEach { println(it) }

        when (readln().toInt()) {
            1 -> enrollStudent()
            2 -> getAllEnrolledStudent()
            3 -> getAllCourses()
            4 -> {
                print("Please enter course name:\t")
                searchCourseByName(readln())
            }

            5 -> registerCourse()
            6 -> {
                print("Please provide student ID:\t")
                searchAllCoursesByStudentID(readln())
            }

            7 -> getAllRegistration()

        }
    }

    private fun menuSelector(): Array<String> {
        val array = arrayOf(
            "1 => ENROLL STUDENT",
            "2 => LIST ENROLLED STUDENTS",
            "3 => LIST ALL COURSES",
            "4 => SEARCH COURSE BY NAME",
            "5 => REGISTER A COURSE",
            "6 => LIST REGISTERED COURSES BY STUDENT ID",
            "7 => LIST ALL REGISTERED STUDENT"
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
        student = Student(
            generateStudentID(),
            firstname.capitalizeWord(),
            lastname.capitalizeWord(),
            gender.capitalizeWord(),
            birthdate,
            phone
        )
        StudentEnrollment().enrollStudent(student)
    }

    private fun getAllEnrolledStudent() {
        if (StudentEnrollment().getEnrolledStudents().isEmpty()) {
            println("Sorry!! the list is empty")
        } else {
            StudentEnrollment().getEnrolledStudents().forEach { println(it) }
        }
    }

    private fun registerCourse() {
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
        Student(
            generateStudentID(),
            firstname.capitalizeWord(), lastname.capitalizeWord(), gender.capitalizeWord(), birthdate, phone
        )

        println("Please enter course ID or course name:\t")
        val courseIDorName = readln()
        Courses.courses.forEach {
            if (it.courseID.contentEquals(courseIDorName) || it.courseName.contentEquals(courseIDorName)) {
                if (!CourseRegistration().getRegistrationList().containsKey(it.courseID)) {
                    registrationList.add(mapOf(it.courseID to student))
                    CourseRegistration().registerCourse(it, student)
                }

                //registrationList.forEach { println(it) }
            }
        }
    }

    private fun getAllCourses() {
        Courses.courses.forEach { println(it) }
    }

    private fun searchAllCoursesByStudentID(studentID: String) {
        CourseRegistration().getRegistrationList().filterKeys { it.contentEquals(studentID.capitalizeWord()) }
    }

    private fun generateStudentID() = "STD".plus(Random.nextInt(100, 999))

    private fun getAllRegistration() {
        if (CourseRegistration().getRegistrationList().isEmpty()) {
            println("Sorry!! Registration list is empty")
        } else {
            CourseRegistration().getRegistrationList().forEach { println(it) }
        }
    }

    private fun searchCourseByName(name: String) {
        Courses.courses.forEach {
            if (it.courseName.contentEquals(name)) {
                println(it)
            } else {
                println("Sorry!! Course couldn't be found")
            }
        }
    }

    private fun String.capitalizeWord(): String {
        return this.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
    }
}