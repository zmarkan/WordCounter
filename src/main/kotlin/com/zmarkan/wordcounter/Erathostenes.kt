package com.zmarkan.wordcounter

class Erathostenes(sieveSize: Int) {

    val sieve = setupSieve(sieveSize)

    fun setupSieve(sieveSize: Int) : List<Int>{
        var values = Array(sieveSize +1, { x -> true})
        val sieveSizeSqrt = Math.sqrt(sieveSize.toDouble()).toInt()

        (2..sieveSizeSqrt).forEach {
            var i = it
            (i * i..sieveSize).step(i).forEach {
                values[it] = false
            }
        }

        return values.indices.filter { index -> index >= 2 && values[index] }
    }
}