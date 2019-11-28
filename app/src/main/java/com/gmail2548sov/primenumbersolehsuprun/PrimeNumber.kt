package com.gmail2548sov.primenumbersolehsuprun

class PrimeNumber {

    fun primenumber (n:Long) {

        //val n: Long = 100


        val primenumbers: ArrayList<Long> = arrayListOf(2)
        var k: Int = 0

        for (i in 3..n step 2) {
            // var l: Long = sqrt(i.toFloat()).toLong() + 1

            k = 0

            for (j in 3..i step 2) {
                if (j * j - 1 < i) {
                    if (i % j == 0L) {
                        k = 1
                        break
                    }
                }
            }

            if (k == 0) {
                primenumbers.add(i)
            }
        }

        var m = primenumbers.size
       /* m = m - 1

        for (i in 0..m) {

            if (i == m) {
                println("${primenumbers.get(m)}")
            } else {
                print("${primenumbers.get(i)}, ")
                if ((i + 1) % 5 == 0) {
                    println("")
                }
            }
        }
        println("${m + 1}") */

    }





}