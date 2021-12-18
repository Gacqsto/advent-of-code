package com.github.gacqsto.adventofcode.days

import com.github.gacqsto.adventofcode.utils.adventUtils.readFile

object day2 {

  val input2: List[String] = readFile("src/main/resources/day2/input2.csv")
  val input2Split: Seq[Array[String]] = input2.map(_.split(" ").map(_.trim))

  def part1(): Unit = {
    var h = 0
    var d = 0
    input2Split.foreach(x => {
      val command = x(0)
      val value = x(1).toInt
      if (command.equals("forward")) {
        h += value
      } else if (command.equals("down")) {
        d += value
      } else if (command.equals("up")) {
        d -= value
      }
    })

    println("horizontal: " + h + ", depth: " + d)
    println("answer: " + h * d)
  }

}
