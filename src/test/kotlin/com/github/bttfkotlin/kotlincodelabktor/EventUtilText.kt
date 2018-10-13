package com.github.bttfkotlin.kotlincodelabktor

import com.github.bttfkotlin.kotlincodelabktor.bean.Event
import com.github.bttfkotlin.kotlincodelabktor.util.prettier
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.util.*

class EventUtilText {

    @Test
    fun `1985 should return one nine eight five`() {
        val testedDate = "1985"

        val events = listOf(Event(testedDate, "test", "test"))
        val event = (Date().prettier(events))[0]
        assertEquals(
                "one thousand nine hundred and eighty five"
                , event.date)
    }

    @Test
    fun `1913 should return one thousand nine hundred and thirteen`() {
        val testedDate = "1913"

        val events = listOf(Event(testedDate, "test", "test"))
        val event = (Date().prettier(events))[0]
        assertEquals(
                "one thousand nine hundred and thirteen"
                , event.date)
    }

    @Test
    fun `When there is no date, nothing should be return`() {
        val events = listOf(Event("", "test", "test"))
        val size = Date().prettier(events).size

        assertEquals(
                0
                        , size)
    }
}

