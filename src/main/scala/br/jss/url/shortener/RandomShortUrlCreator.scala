package br.jss.url.shortener

import scala.util.Random

object RandomShortUrlCreator {
  private val rawAlphabet = "abcdefghijklmnopqrstuvwyz"
  private val rawNumbers = "0123456789"

  private val lowerCaseAlphabetArray = rawAlphabet.toCharArray
  private val upperCaseAlphabetArray = rawAlphabet.toUpperCase.toCharArray
  private val numbersArray = rawNumbers.toCharArray

  def create(): String = {
    var randomUrl = ""
    val availableCharArrays = Array(
      lowerCaseAlphabetArray,
      upperCaseAlphabetArray,
      numbersArray
    )

    for (i <- 0 to 10) {
      val pickedCharArray: Array[Char] = availableCharArrays(Random.nextInt(availableCharArrays.size))
      randomUrl += pickRandomCharFromArray(pickedCharArray)
    }

    randomUrl
  }

  private def pickRandomCharFromArray(array: Array[Char]): Char = array(Random.nextInt(array.size))
}
