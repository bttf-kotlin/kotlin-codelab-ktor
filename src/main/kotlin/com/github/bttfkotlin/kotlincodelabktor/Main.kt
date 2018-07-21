package com.github.bttfkotlin.kotlincodelabktor

import com.github.bttfkotlin.kotlincodelabktor.service.EventService
import com.github.bttfkotlin.kotlincodelabktor.util.EventUtil

fun main(args: Array<String>) = EventUtil.prettier(EventService.getAllEvents()).forEach { println(it) }