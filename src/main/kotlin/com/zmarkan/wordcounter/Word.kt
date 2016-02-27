package com.zmarkan.wordcounter

class Word(origin: String) {
    val origin = origin.toLowerCase()

    override fun hashCode(): Int {
        return origin.hashCode()
    }

    override fun equals(other: Any?): Boolean {
        if (other is Word)
            return origin.equals(other.origin)

        else return false
    }

    override fun toString(): String {
        return origin
    }
}