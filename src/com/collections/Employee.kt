package com.collections

import java.util.*

data class Employee(
    val emplyId: String,
    val firstName: String,
    val lastName: String,
    val gender: String,
    val hiredDate: String,
    val phone: String,
    val jobTitle: String,
    val salary: Double,
    val department: Department
) {
    override fun toString(): String {
        return "Employee ID : $emplyId\n" +
                "Firstname: $firstName\n" +
                "Lastname: $lastName\n" +
                "Gender: $gender\n" +
                "Hired Date: $hiredDate\n" +
                "Phone: $phone\n" +
                "Job Title: $jobTitle\n" +
                "Salary: ${String.format(Locale.US, "%.2f", salary)}\n" +
                "Department: ${department.department.joinToString(", ")}\n"
    }
}
