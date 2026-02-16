package oop_00000105215_ClemensPutraKusmeri.week03

class Employee (val name: String){
  var salary: Int = 0
  set(value){
    println("Mencoba untuk mengprint gaji $value")
    this.salary = value
  }
}