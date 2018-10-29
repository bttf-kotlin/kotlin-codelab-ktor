package com.github.bttfkotlin.kotlincodelabktor.util

import com.github.bttfkotlin.kotlincodelabktor.bean.Event

object EventUtil {

    val unitsString = arrayOf(
            "", "one", "two", "three", "four", "five",
            "six", "seven", "eight", "nine", "ten", "eleven",
            "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
            "seventeen", "eighteen", "nineteen"
    )

    val tenthString = arrayOf(
            "", "", "twenty", "thirty", "fourty", "fifty",
            "sixty", "seventy", "eighty", "ninety"
    )

    val hundredsString = arrayOf(
            "", "one hundred", "two hundred", "three hundred", "four hundred", "five hundred",
            "six hundred", "seven hundred", "eight hundred", "nine hundred"
    )

    val thousandsString = arrayOf(
            "", "one thousand", "two thousand", "three thousand", "four thousand", "five thousand", "six thousand",
            "seven thousand", "eight thousand", "nine thousand", "ten thousand"
    )

    fun getPrettyThousands(thousands: Int): List<String> {
        return listOf(thousandsString[thousands])
    }

    fun getPrettyHundreds(hundreds: Int): List<String> {
        return listOf(hundredsString[hundreds])
    }

    fun getLiaisonWordIfNecessary(thousands: Int, hundreds: Int, tens: Int, units: Int): List<String> {
        return when {
            (thousands != 0 || hundreds != 0) && (tens != 0 || units != 0) -> listOf("and")
            else -> listOf()
        }
    }

    fun getPrettyTensAndUnits(tens: Int, units: Int): List<String> {
        return when (tens) {
            1 -> listOf(unitsString[10 + units])
            else -> listOf(tenthString[tens], unitsString[units])
        }
    }

    fun prettierDate(date: String): String {
        val (thousands, hundreds, tens, units) = date
                .padStart(4, '0')
                .toList()
                .map { numberAsString -> numberAsString.toString() }
                .map { numberAsString -> numberAsString.toInt() }
        return listOf(
                getPrettyThousands(thousands),
                getPrettyHundreds(hundreds),
                getLiaisonWordIfNecessary(thousands, hundreds, tens, units),
                getPrettyTensAndUnits(tens, units))
                .flatMap { it }
                .filter { it.isNotEmpty() }
                .joinToString(separator = " ")
    }

    fun prettier(events: List<Event>): List<Event> {
        return events
                .filter { it.date.isNotEmpty() }
                .map { it.copy(date = prettierDate(it.date)) }
    }
}
