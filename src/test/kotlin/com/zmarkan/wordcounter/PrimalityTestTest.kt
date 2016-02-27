package com.zmarkan.wordcounter

import org.junit.Assert
import org.junit.Test

class PrimalityTestTest {

    val sieve = Erathostenes(200).sieve

    @Test fun primeNumbersInErathostenesSieve(){

        val primes = intArrayOf(2, 7, 19, 31)
        primes.forEach { Assert.assertTrue(it.isPrime(sieve))}
    }

    @Test fun nonPrimeNumbersWithErathostenesSieve(){

        val nonPrimes = intArrayOf(4, 6, 99, 50, 150, 156)
        nonPrimes.forEach { Assert.assertFalse(it.isPrime(sieve))}
    }

    @Test fun nonPrimesOutsideOfErathostenesSieve(){

        val nonPrimes = intArrayOf(202, 250, 366, 999)
        nonPrimes.forEach { Assert.assertFalse(it.isPrime(sieve))}
    }

    @Test fun primesOutsideOfErathostenesSieve(){

        val primes = intArrayOf(9941, 8311, 2549, 1907)
        primes.forEach { number -> Assert.assertTrue(number.isPrime(sieve))}
    }
}