package com.github.gacqsto.adventofcode.days

import com.github.gacqsto.adventofcode.utils.adventUtils.readFile

object day2 {

  val input2: List[String] = readFile("src/main/resources/day2/input2.csv")
  val input2Split: Seq[Array[String]] = input2.map(_.split(" ").map(_.trim))

  def part1(): Unit = {
    var h1 = 0
    var d1 = 0
    input2Split.foreach(x => {
      val command = x(0)
      val value = x(1).toInt
      if (command.equals("forward")) {
        h1 += value
      } else if (command.equals("down")) {
        d1 += value
      } else if (command.equals("up")) {
        d1 -= value
      }
    })

    println("horizontal: " + h1 + ", depth: " + d1)
    println("answer: " + h1 * d1)
  }

  def part2(): Unit = {
    var h2 = 0
    var a2 = 0
    var d2 = 0
    input2Split.foreach(x => {
      val command = x(0)
      val value = x(1).toInt
      if (command.equals("forward")) {
        h2 += value
        d2 += value * a2
      } else if (command.equals("down")) {
        a2 += value
      } else if (command.equals("up")) {
        a2 -= value
      }
    })

    println("horizontal: " + h2 + ", depth: " + d2)
    println("answer: " + h2 * d2)
  }

}
