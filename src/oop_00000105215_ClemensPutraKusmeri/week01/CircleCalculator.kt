package oop_00000105215_ClemensPutraKusmeri.week01

fun main(args){
  val radius: Double = 7.0
  val pi: Double = 3.14
  val area: Double = pi * radius * radius
  
  println("Radius: $radius, Area: $area")
  println("${checkSize(area)}")
}

fun checkSize(area: Double) = if (area > 100) "This is a Big Circle" else "This is a Small Circle"
