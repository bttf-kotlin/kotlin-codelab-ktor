package com.github.bttfkotlin.kotlincodelabktor

import com.github.bttfkotlin.kotlincodelabktor.bean.Event
import com.github.bttfkotlin.kotlincodelabktor.util.EventUtil
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class EventUtilText {

    @Test
    fun `500 should return five hundred`() {
        val testedDate = "500"

        val events = listOf(Event(testedDate, "test", "test"))
        val event = (EventUtil.prettier(events))[0]
        assertEquals(
                "five hundred",
                event.date)
    }

    @Test
    fun `1985 should return one thousand nine hundred and eighty five`() {
        val testedDate = "1985"

        val events = listOf(Event(testedDate, "test", "test"))
        val event = (EventUtil.prettier(events))[0]
        assertEquals(
                "one thousand nine hundred and eighty five",
                event.date)
    }

    @Test
    fun `1913 should return one thousand nine hundred and thirteen`() {
        val testedDate = "1913"

        val events = listOf(Event(testedDate, "test", "test"))
        val event = (EventUtil.prettier(events))[0]
        assertEquals(
                "one thousand nine hundred and thirteen"
                , event.date)
    }

    @Test
    fun `When there is no date, nothing should be returned`() {
        val events = listOf(Event("", "test", "test"))
        val size = EventUtil.prettier(events).size

        assertEquals(
                0
                , size)
    }
}

