package com.collections

import java.time.LocalDate
import java.time.Period
import kotlin.random.Random

//Special class which is a single instance
object Employees {
    val employees: List<Employee> = listOf(
        Employee(
            "EMP100",
            "Bereket",
            "Hailu",
            "Male",
            LocalDate.now().minus(Period.ofDays(Random.nextInt(365 * 30))).toString(),
            "+1 (642) 254-9962",
            "Sales Manager",
            120000.00,
            Department(listOf("Marketing", "Finance"))
        ),
        Employee(
            "EMP101",
            "Bethelhem",
            "Abera",
            "Female",
            LocalDate.now().minus(Period.ofDays(Random.nextInt(365 * 30))).toString(),
            "+1 (742) 853-1262",
            "Software Engineer",
            90000.00,
            Department(listOf("Information Technology"))
        ),
        Employee(
            "EMP102",
            "Solomon",
            "Abebe",
            "Male",
            LocalDate.now().minus(Period.ofDays(Random.nextInt(365 * 30))).toString(),
            "1 (452) 023-8145",
            "Account Executive",
            200000.00,
            Department(listOf("Finance"))
        ),
        Employee(
            "EMP103",
            "Tibebe",
            "Habte",
            "Male",
            LocalDate.now().minus(Period.ofDays(Random.nextInt(365 * 30))).toString(),
            "+1 (952) 220-3462",
            "Marketing Coordinator",
            75000.00,
            Department(listOf("Sales"))
        ),
        Employee(
            "EMP104",
            "Tekeste",
            "Habete Mariam",
            "Male",
            LocalDate.now().minus(Period.ofDays(Random.nextInt(365 * 30))).toString(),
            "+1 (351) 378-1020",
            "Web Designer",
            840000.00,
            Department(listOf("Information Technology"))
        ),
        Employee(
            "EMP105",
            "Selamawit",
            "Tarekegn",
            "Female",
            LocalDate.now().minus(Period.ofDays(Random.nextInt(365 * 30))).toString(),
            "+1 (352) 117-4220",
            "Accounting Consultant",
            65000.00,
            Department(listOf("Finance"))
        ),
        Employee(
            "EMP106",
            "Tefera",
            "Melkamu",
            "Male",
            LocalDate.now().minus(Period.ofDays(Random.nextInt(365 * 30))).toString(),
            "+1 (241) 910-6475",
            "Nurse",
            115000.00,
            Department(listOf("Health"))
        ),
        Employee(
            "EMP107",
            "Tafesse",
            "Lemma",
            "Male",
            LocalDate.now().minus(Period.ofDays(Random.nextInt(365 * 30))).toString(),
            "+1 (745) 621-3012",
            "Android Software Engineer",
            90000.00,
            Department(listOf("Information Technology"))
        ),
        Employee(
            "EMP108",
            "Etsegenet",
            "Degife",
            "Female",
            LocalDate.now().minus(Period.ofDays(Random.nextInt(365 * 30))).toString(),
            "+1 (287) 551-3124",
            "Android Project Manager",
            250000.00,
            Department(listOf("Information Technology"))
        ),
        Employee(
            "EMP109",
            "Kifelom",
            "Aregawi",
            "Male",
            LocalDate.now().minus(Period.ofDays(Random.nextInt(365 * 30))).toString(),
            "+1 (702) 625-0050",
            "Android Software Developer",
            850500.00,
            Department(listOf("Information Technology"))
        ),
        Employee(
            "EMP110",
            "Samrawit",
            "Bereket",
            "Female",
            LocalDate.now().minus(Period.ofDays(Random.nextInt(365 * 30))).toString(),
            "+44 (642) 254-9962",
            "Android Software Developer",
            105000.00,
            Department(listOf("Information Technology"))
        ),
        Employee(
            "EMP111",
            "Tekeste",
            "Samuel",
            "Male",
            LocalDate.now().minus(Period.ofDays(Random.nextInt(365 * 30))).toString(),
            "+1 (642) 254-6974",
            "Senior Android Software Developer",
            120000.00,
            Department(listOf("Information Technology"))
        ),
        Employee(
            "EMP112",
            "Mekebeb",
            "Tesfaye",
            "Male",
            LocalDate.now().minus(Period.ofDays(Random.nextInt(365 * 30))).toString(),
            "+44 (642) 254-9962",
            "Web Developer",
            60000.00,
            Department(listOf("Information Technology"))
        ),
        Employee(
            "EMP113",
            "Daniel",
            "Mezigebu",
            "Male",
            LocalDate.now().minus(Period.ofDays(Random.nextInt(365 * 30))).toString(),
            "+1 (651) 321-9876",
            "Senior Accountant",
            97000.00,
            Department(listOf("Finance"))
        ),
        Employee(
            "EMP114",
            "Meseret",
            "Balcha",
            "Female",
            LocalDate.now().minus(Period.ofDays(Random.nextInt(365 * 30))).toString(),
            "+1 (612) 774-3612",
            "Hr Manager",
            68000.00,
            Department(listOf("Human Resource"))
        )
    )

}