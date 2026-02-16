package oop_00000105215_ClemensPutraKusmeri.week03

class Employee (val name: String){
  private var performanceRating: Int = 3

  fun increasePerformance(){
    performanceRating++
    println("Kinerja $name meningkat! Rating: $PerformanceRating")
  }

  fun printStatus{
      println("Nama: $name, Rating: $PerformanceRating")
  }

  var salary: Int = 0
  set(value){
    if(value<0){
      println("ERROR: Gaji tidak boleh negatif! Di-set ke 0.")
      field = 0
    } else{
      field = value
    }
  }
}