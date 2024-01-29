package com.collections

data class Department(val department: List<String>) {
    override fun toString(): String {
        return "${department.forEach { print(it.toString()) }}"
    }
}
