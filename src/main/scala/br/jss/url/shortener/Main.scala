package br.jss.url.shortener

import java.util.Scanner
import scala.util.matching.Regex
import scala.collection.mutable.HashMap

@main def hello: Unit =
  val regex = Regex("\\b(?:https?|ftp)://[\\S/$.?#].[^\\s]*\\b")
  val scanner = new Scanner(Console.in)
  val table = HashMap.empty[String, String]
  
  print("Target URL: ")
  
  val rawInput: String = scanner.next()
  
  
  if(regex.matches(rawInput)) {
    val result = RandomShortUrlCreator.create()
    table.addOne(rawInput, result)
    table.foreach((k, v) => println(s"${k} - ${v}"))
  }