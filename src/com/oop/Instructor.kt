package com.oop

data class Instructor(
    val firstName: String,
    val lastName: String,
    val education: String,
    val department: String,
    val teaches: String
) {
    override fun toString(): String {
        return "Firstname: $firstName\n" +
                "Lastname: $lastName\n" +
                "Education: $education\n" +
                "Department: $department\n" +
                "Teaches: $teaches"
    }
}
