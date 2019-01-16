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

    fun prettier(events: List<Event>): List<Event> {
        return events.filter { it.date.isNotEmpty()}.map {
            it.copy(date = """${unitsString[it.date[0].toString().toInt()]} ${unitsString[it.date[1].toString().toInt()]} ${unitsString[it.date[2].toString().toInt()]} ${unitsString[it.date[3].toString().toInt()]}""")
        }
    }
}