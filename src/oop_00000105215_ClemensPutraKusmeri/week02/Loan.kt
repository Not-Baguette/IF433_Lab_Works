package oop_00000105215_ClemensPutraKusmeri.week02

class Loan(val bookTitle: String, val borrower: String, val loanDuration: Int = 1){
  fun calculateFine() = if(loanDuration>3) ((loanDuration - 3) * 2000) else 0
}

/* TEST
fun main(){
  val book1 = Loan("the ones that walk away from omelas", "Naomi", 10)
  println(book1.calculateFine())
}
*/