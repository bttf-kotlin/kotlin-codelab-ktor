package com.github.bttfkotlin.kotlincodelabktor

import com.github.bttfkotlin.kotlincodelabktor.service.EventService

fun main(args: Array<String>) =
    EventService.getAllEvents().forEach { println(it) }
