package com.zmarkan.wordcounter

import org.junit.Assert
import org.junit.Test

class ErathostenesTest {

    @Test fun calculateSieveOfErathostenes() {
        val primesTo10 = Erathostenes(10).sieve

        Assert.assertEquals(4, primesTo10.size)
        Assert.assertEquals(7, primesTo10.last())

        val primesTo20 = Erathostenes(20).sieve

        Assert.assertEquals(8, primesTo20.size)
        Assert.assertEquals(2, primesTo20.first())
        Assert.assertEquals(19, primesTo20.last())
    }
}


