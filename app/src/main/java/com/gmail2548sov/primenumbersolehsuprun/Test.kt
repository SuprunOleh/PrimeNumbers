package com.gmail2548sov.primenumbersolehsuprun

object Test {

    @Throws(NumberFormatException::class)
    private fun isDigit(s: String): Boolean {
        try {
            Integer.parseInt(s)
            return true
        } catch (e: NumberFormatException) {
            return false
        }

    }
}
