package com.github.bttfkotlin.kotlincodelabktor

import com.fasterxml.jackson.core.util.DefaultIndenter
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter
import com.fasterxml.jackson.databind.SerializationFeature
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import com.github.bttfkotlin.kotlincodelabktor.service.EventService
import com.github.bttfkotlin.kotlincodelabktor.util.prettier
import io.ktor.application.Application
import io.ktor.application.call
import io.ktor.application.install
import io.ktor.features.CallLogging
import io.ktor.features.Compression
import io.ktor.features.ContentNegotiation
import io.ktor.features.DefaultHeaders
import io.ktor.jackson.jackson
import io.ktor.response.respond
import io.ktor.response.respondText
import io.ktor.routing.get
import io.ktor.routing.routing
import java.util.*

fun main(args: Array<String>): Unit = io.ktor.server.netty.DevelopmentEngine.main(args)

fun Application.module() {
    install(DefaultHeaders)
    install(Compression)
    install(CallLogging)
    install(ContentNegotiation) {
        jackson {
            configure(SerializationFeature.INDENT_OUTPUT, true)
            setDefaultPrettyPrinter(DefaultPrettyPrinter().apply {
                indentArraysWith(DefaultPrettyPrinter.FixedSpaceIndenter.instance)
                indentObjectsWith(DefaultIndenter("  ", "\n"))
            })
            registerModule(JavaTimeModule())  // support java.time.* types
        }
    }
    routing {
        get("/") {
            call.respondText("Hello Jug Montpellier")
        }
        get("/events") {
            var events  = when (call.request.queryParameters["sort"]) {
                "asc" -> EventService.getAllEvents().sortedBy { it.date }
                "desc" -> EventService.getAllEvents().sortedByDescending { it.date }
                else -> EventService.getAllEvents()
            }

            events  = when (call.request.queryParameters["split"]) {
                "before" -> events.partition { it.date.toInt() < 1985 }.first
                "after" -> events.partition { it.date.toInt() < 1985 }.second
                else -> events
            }

            call.respond(if(call.request.queryParameters["prettier"].isNullOrEmpty()) {
                events
            }
            else{
                Date().prettier(events)
            })
        }
    }
}