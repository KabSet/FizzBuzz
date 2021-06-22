package com.example.fizzbuzz

fun main() {
    for (x in 1..255) {
        var words : ArrayList<String> = ArrayList()

        if (x % 11 ==0) {
            words.add("Bong")
        } else {
            if (x % 3 == 0) {
                words.add("Fizz")
            }
            if (x % 13 == 0) {
                words.add("Fezz")
            }
            if (x % 5 == 0) {
                words.add("Buzz")
            }
            if (x % 7 == 0) {
                words.add("Bang")
            }
            if (words.isEmpty()) {
                println(x)
            } else if (x % 17 == 0) {
                for (element in words.asReversed()) {
                    print(element)
                }
                print("\n")
            } else {
                for (element in words) {
                    print(element)
                }
                print("\n")
            }
        }
    }
}