package com.zmarkan.wordcounter

import java.util.*

fun String.toWord(): Word{
    return Word(this)
}

fun Pair<Word, Int>.compareTo(other: Pair<Word, Int>): Int {
    return this.second.compareTo(other.second)
}

fun Int.isPrime(erathostenesSieve: List<Int>): Boolean {

    //Apply sieve
    if(erathostenesSieve.isNotEmpty() && this <= erathostenesSieve.last()){
        return erathostenesSieve.contains(this)
    }
    erathostenesSieve.forEach { if(this % it == 0) return false }

    //If we can't use the sieve the prime calculated according to the Miller-Rabin test
    //source: https://en.wikipedia.org/wiki/Miller%E2%80%93Rabin_primality_test
    var d = this-1
    var s = 0
    while(d % 2 == 0){
        d /= 2
        s += 1
    }

    for(i in 1..2){
        val a = 2 + Random().nextInt(this - 4)
        var x = this.modulusOfExponent(a, d)

        if(x == 1 || x == this-1) continue

        for (r in (1..s-1)){
            x = this.modulusOfExponent(x, 2)
            if (x == 1) return false
            if (x == this-1) break
        }
        if (x != this-1) return false
    }
    return true
}

fun Int.modulusOfExponent(a: Int, d: Int): Int {
    var exponent = d
    var prod = 1
    var base = a % this
    while(exponent > 0){
        if(exponent.isOdd()) prod = (prod * base) % this
        exponent = exponent.shr(1)
        base = (base * base) % this
    }
    return prod
}

fun Int.isOdd(): Boolean{
    return this % 2 != 0
}
