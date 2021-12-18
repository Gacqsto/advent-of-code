package com.github.gacqsto.adventofcode.utils

import scala.io.Source

object adventUtils {

  def readFile(filePath: String): List[String] ={
    val bufferedSource = Source.fromFile(filePath)
    bufferedSource.getLines.toList
  }
}
