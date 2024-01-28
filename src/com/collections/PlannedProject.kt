package com.collections

import kotlin.random.Random

data class PlannedProject(
    val projID: String,
    val projName: String,
    val projManager: String,
    val projSize: Int,
    val projDate: String
) {
    override fun toString(): String {
        return "Project ID: $projID\n" +
                "Project Name: $projName\n" +
                "Project Manager: $projManager\n" +
                "Project Size: $projSize\n" +
                "Project Date: $projDate\n"
    }

}
