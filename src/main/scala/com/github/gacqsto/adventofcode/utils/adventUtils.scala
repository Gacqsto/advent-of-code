package com.github.gacqsto.adventofcode.utils

import scala.io.Source

object adventUtils {

  def readFile(filePath: String): List[String] ={
    val bufferedSource = Source.fromFile(filePath)
    val lines = bufferedSource.getLines.toList
    bufferedSource.close()
    lines
  }
}
