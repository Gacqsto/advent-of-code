package com.github.gacqsto.adventofcode.days

import com.github.gacqsto.adventofcode.utils.adventUtils.readFile

object day1 {
  val csvList: Seq[String] = readFile("src/main/resources/day1-sonar.csv")

  for (item  <- csvList) {
    println(item)
  }
}
