package com.collections

data class Employee(
    val emplyId: String,
    val firstName: String,
    val lastName: String,
    val gender: String,
    val birthDate: String,
    val phone: String,
    val jobTitle: String,
    val salary : Double,
    val department: Department
) {
    override fun toString(): String {
        return "\nEmployee ID : $emplyId\n" +
                "Firstname: $firstName\n" +
                "Lastname: $lastName\n" +
                "Gender: $gender\n" +
                "Birthdate: $birthDate\n" +
                "Phone: $phone\n" +
                "Job Title: $jobTitle\n" +
                "Salary: $salary\n" +
                "Department: ${department.department}"
    }
}
