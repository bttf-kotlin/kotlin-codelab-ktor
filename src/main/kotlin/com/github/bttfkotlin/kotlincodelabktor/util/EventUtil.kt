package com.github.bttfkotlin.kotlincodelabktor.util

import com.github.bttfkotlin.kotlincodelabktor.bean.Event

object EventUtil {

    val unitsString = arrayOf(
            "zero", "one", "two", "three", "four", "five",
            "six", "seven", "eight", "nine"
    )

    fun prettier(events: List<Event>): List<Event> {
        return events.filter { it.date.isNotEmpty()}.map {
            it.copy(date = prettyDate(it.date))
        }
    }

    fun prettyDate(date: String) = date.asSequence()
            .map { it -> it.toString() }
            .map { it -> it.toInt()}
            .map { it -> unitsString[it]}
            .reduce {left, right -> """$left $right"""}
}