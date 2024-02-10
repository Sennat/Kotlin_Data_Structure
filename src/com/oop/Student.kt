package com.oop

data class Student(
    val studentID: String,
    val firstName: String,
    val lastName: String,
    val gender: String,
    val birthDate: String,
    val phone: String
) {
    override fun toString(): String {
        return "Student ID: $studentID\n" +
                "Firstname: $firstName\n" +
                "Lastname: $lastName\n" +
                "Gender: $gender\n" +
                "Birthdate: $birthDate\n" +
                "Telephone: $phone"
    }
}