package com.github.bttfkotlin.kotlincodelabktor.util

import com.github.bttfkotlin.kotlincodelabktor.bean.Event

object EventUtil {

    val unitsString = arrayOf(
            "zero", "one", "two", "three", "four", "five",
            "six", "seven", "eight", "nine"
    )

    fun prettier(events: List<Event>): List<Event> {
        return events.filter { it.date.isNotEmpty()}.map {
            it.copy(date = """${unitsString[it.date[0].toString().toInt()]} ${unitsString[it.date[1].toString().toInt()]} ${unitsString[it.date[2].toString().toInt()]} ${unitsString[it.date[3].toString().toInt()]}""")
        }
    }
}