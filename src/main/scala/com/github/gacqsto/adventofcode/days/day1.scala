package com.github.gacqsto.adventofcode.days

import com.github.gacqsto.adventofcode.utils.adventUtils.readFile

object day1 {

  val sonarReadings: List[Int] =
    readFile("src/main/resources/day1/input1.csv").map(_.toInt)

  def countIncreasesFromList(list: List[Int]): Int = {
    var numberOfIncreases = 0
    var previousReading = list.head
    var movement = "(N/A - no previous measurement)"
    println(previousReading + " " + movement)

    for (currentReading <- list.tail) {
      if (currentReading > previousReading) {
        numberOfIncreases += 1
        movement = "(increased)"
      } else {
        movement = "(decreased)"
      }
      println(currentReading + " " + movement)
      previousReading = currentReading
    }
    println("The number of increases is: " + numberOfIncreases)
    numberOfIncreases
  }

  def part1(): Unit = {
    countIncreasesFromList(sonarReadings)
  }

  def part2(): Unit = {
    val sonarReadingsLength = sonarReadings.length

    val rollingSumOfReadings = (0 to (sonarReadingsLength - 3))
      .map(x => sonarReadings(x) + sonarReadings(x + 1) + sonarReadings(x + 2))
      .toList

    countIncreasesFromList(rollingSumOfReadings)
  }

}
