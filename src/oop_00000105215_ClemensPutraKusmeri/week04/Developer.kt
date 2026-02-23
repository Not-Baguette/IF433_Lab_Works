package oop_00000105215_ClemensPutraKusmeri.week04

class Developer(val programmingLanguage: String, name: String, baseSalary: Int): Employee(name, baseSalary){
  override fun work(){
    println("$name sedang ngoding menggunakan $programmingLanguage.")
  }
}