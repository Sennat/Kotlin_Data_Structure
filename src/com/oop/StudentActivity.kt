package com.oop

import java.util.*
import kotlin.random.Random
import kotlin.system.exitProcess

class StudentActivity {
    private lateinit var course: Course
    private lateinit var student: Student
    private var yesNo = ""

    init {
        println("\n==== CITY COLLAGE MANAGEMENT SYSTEM ====")
        println("---------------------------------------------------------")
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
        println("Please Select To Proceed Next Operation:\t")
        menuSelector().forEach { println("$it\t") }

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
                print("Please provide student Id:\t")
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
        print("Enter Firstname:\t")
        val firstname = readln()
        print("Enter Lastname:\t")
        val lastname = readln()
        print("Enter Gender:\t")
        val gender = readln()
        print("Enter Birthdate:\t")
        val birthdate = readln()
        print("Enter phone # Ex. (123) 456-7890:\t")
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
        println(StudentEnrollment().getEnrolledStudent(student.studentID))

    }

    private fun getAllEnrolledStudent() {
        if (StudentEnrollment().getEnrolledStudents().isEmpty()) {
            println("Sorry!! Enrollment list is empty")
        } else {
            StudentEnrollment().getEnrolledStudents().forEach { println(it) }
        }
    }

    private fun registerCourse() {
        print("Enter student Id:\t")
        val studentID = readln()
        print("Please enter course ID or course NAME:\t")
        val courseIDorName = readln()

        Courses.courses.forEach {
            if (it.courseID.contentEquals(courseIDorName) || it.courseName.contentEquals(courseIDorName)) {
                if (StudentEnrollment().getEnrolledStudent(studentID) != null &&
                    !CourseRegistration().getRegistrationList().containsKey(it.courseID)
                ) StudentEnrollment().getEnrolledStudent(studentID)
                    ?.let { student ->
                        CourseRegistration().registerCourse(
                            it,
                            student
                        )
                    } else println("Sorry!! You have to enrolled first to register the course.")
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
            CourseRegistration().getRegistrationList().forEach {
                println(
                    "==== ALL REGISTERED STUDENTS BY COURSE ID ====\n" +
                    "Course Id: ${it.key}\n" +
                    "Student Id: ${it.value.studentID}\n" +
                    "Student Firstname: ${it.value.firstName}\n" +
                    "Student Lastname: ${it.value.lastName}\n" +
                    "-------------------------------\n"
                )
            }
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