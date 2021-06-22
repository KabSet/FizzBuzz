package com.example.fizzbuzz

fun main() {
    for (x in 1..195) {
        if (x % 11 ==0) {
            print("Bong")
        } else {
            if (x % 3 == 0) {
                print("Fizz")
            }
            if (x % 13 == 0) {
                print("Fezz")
            }
            if (x % 5 == 0) {
                print("Buzz")
            }
            if (x % 7 == 0) {
                print("Bang")
            }
            if (x % 3 != 0 && x % 5 != 0 && x % 7 != 0) {
                print(x)
            }
        }
        print("\n")
    }
}