package com.collections

data class PlannedProject(
    val projID: String,
    val projName: String,
    val projManager: String,
    val devList: List<Map<String, String>>,
    val projSize: Int,
    val projDate: String
) {
    override fun toString(): String {
        return "Project ID: $projID\n" +
                "Project Name: $projName\n" +
                "Project Manager: $projManager\n" +
                "Developers: ${devList.joinToString { it.entries.joinToString("${it.keys to it.values} , ") }}\n" +
                "Project Size: $projSize\n" +
                "Project Date: $projDate\n"
    }

}
