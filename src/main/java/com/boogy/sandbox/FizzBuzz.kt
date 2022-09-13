package com.boogy.sandbox

object FizzBuzz {

  /**
   * For a list of numbers 1 to 100
   *
   * If divisible by 3 print Fizz
   * If divisible by 5 print Buzz
   * If divisible by both print FizzBuzz
   * If neither print number
   */
  fun run() {
    //Make a list from 1-100
    val list: List<Int> = listOf(1, 2, 3)

    // start on 1
    var num: Int = list[0] // 1

    // modulus 1 by 3 = 1
    var rem: Int = num % 3 // 1

    // make boolean for Fizz
    var isDivisibleByThree: Boolean = rem == 0 // false

    // does the remainder equal zero
    if (isDivisibleByThree) {
      println("Fizz")
    } else {
      println(num) // "1"
    }

    // no don't print fizz
    // start on 2
    num = list[1] // 2

    // modulus 2 by 3 = 2
    rem = num % 3 // 2

    // make boolean for Fizz
    isDivisibleByThree = rem == 0 // false

    // does the remainder equal zero
    if (isDivisibleByThree) {
      println("Fizz")
    } else {
      println(num) // "2"
    }

    // start on 3
    num = list[2] // 3

    // modulus 3 by 3 = 0
    rem = num % 3 // 3

    // make boolean for Fizz
    isDivisibleByThree = rem == 0 // true

    // does the remainder equal zero
    if (isDivisibleByThree) {
      println("Fizz") // Fizz
    } else {
      println(num)
    }


    // modulus 1 by 5 = 1
    // make boolean for Buzz
    // does the remainder equal zero
    // no don't print fizz
    // repeat


  }

  fun runBetter() {
    val list: List<Int> = listOf(1, 2, 3)

    var num: Int = list[0]

    checkNumber(num)

    num = list[1]

    checkNumber(num)

    num = list[2]

    checkNumber(num)

  }

  fun runBest() {

    (1..20).forEach {
      val num = it

      checkNumber(num)
    }
  }

  fun checkNumber(num: Int) {
    val rem: Int = num % 3
    val isDivisibleByThree: Boolean = rem == 0
    if (isDivisibleByThree) {
      println("Fizz")
    } else {
      println(num)
    }
  }

  @JvmStatic
  fun main(args: Array<String>) {
    run()
    runBetter()
    runBest()
  }
}