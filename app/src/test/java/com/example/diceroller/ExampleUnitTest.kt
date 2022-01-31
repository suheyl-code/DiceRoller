package com.example.diceroller

import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun check_numbers() {
        val dice = Dice(6)
        val rollDice = dice.roll()
        assertTrue("Dice produces 1 to 6", rollDice in 1..6)
    }
}