package com.github.bttfkotlin.kotlincodelabktor.util

import com.github.bttfkotlin.kotlincodelabktor.bean.Event
import java.util.*


fun Date.prettier(events: List<Event>): List<Event> {

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

    return events.filter { it.date.isNotEmpty() && it.date.length == 4 }
            .map {
                val tenthAndUnit: String = when ("""${it.date[2]}${it.date[3]}""".toInt()) {
                    in 0..19 -> unitsString["""${it.date[2]}${it.date[3]}""".toInt()]
                    else -> """${tenthString[it.date[2].toString().toInt()]} ${unitsString[it.date[3].toString().toInt()]}"""
                }

                it.copy(date = """${thousandsString[it.date[0].toString().toInt()]} ${hundredsString[it.date[1].toString().toInt()]} and $tenthAndUnit""")
            }

}