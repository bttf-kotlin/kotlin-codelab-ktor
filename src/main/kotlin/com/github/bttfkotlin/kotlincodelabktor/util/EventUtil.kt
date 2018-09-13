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
            .map { it -> it.toString() } // On passe par un String afin d'avoir la valeur du caractère et non pas la valeur ASCII (exemple : 49 en ASCII => 1)
            .map { it -> it.toInt()} // On récupère la valeur du caractère qui nous servira d'index par la suite
            .map { it -> unitsString[it]}
            .reduce {left, right -> """$left $right"""} // Utilisation du reduce avec un string template pour créer la chaîne finale.
}