package oop_00000105215_ClemensPutraKusmeri.week01

main(args: Array<String>){
  val radius: Double = 7.0
  val pi: Double = 3.14
  
  val area: Double = pi * radius * radius
  
  println("Radius: $radius, Area: $area")
  
  checkSize(area)
}

fun checkSize(area: Double){
  if (area > 100){
  println("This is a Big Circle")
  } else {
  println("This is a Small Circle")
  }
}
