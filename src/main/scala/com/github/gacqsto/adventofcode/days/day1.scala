package com.github.gacqsto.adventofcode.days

import com.github.gacqsto.adventofcode.utils.adventUtils.readFile

object day1 {

  val csvList: List[Int] = readFile("src/main/resources/day1/day1-sonar.csv").map(_.toInt)

  var numberOfIncreases = 0
  var previousReading = csvList.head
  var isIncreased = "(N/A - no previous measurement)"
  println(previousReading + " " + isIncreased)

  for (currentReading <- csvList.tail) {
    if (currentReading > previousReading){
      numberOfIncreases += 1
      isIncreased = "(increased)"
    }
    else {
      isIncreased = "(decreased)"
    }
    println(currentReading + " " + isIncreased)
    previousReading = currentReading
  }
  println("The number of increases is: " + numberOfIncreases)
}
