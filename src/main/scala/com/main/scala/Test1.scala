package com.main.scala

object Test1 {
  
  def sayHello1() = 
  {
    "Hello1"
  }
  
  def sayHello2() 
  {
      "Hello2"
  }
  
  def main(args: Array[String]): Unit = {
    println(sayHello1())
    println(sayHello2())
  }

}