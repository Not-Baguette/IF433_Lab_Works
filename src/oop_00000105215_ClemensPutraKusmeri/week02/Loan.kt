package oop_00000105215_ClemensPutraKusmeri.week02
import java.util.Scanner

class Loan(val bookTitle: String, val borrower: String, val loanDuration: Int = 1){
  fun calculateFine() = if(loanDuration>3) ((loanDuration - 3) * 2000) else 0
}

fun main(){
  val scanner = Scanner(System.`in`)
  print("Masukkan Judul: ")
  val title = scanner.nextLine()
  print("Masukkan Nama Peminjam: ")
  val borrower = scanner.nextLine()
  print("Masukkan durasi pinjam: ")
  var duration = scanner.nextInt()
  scanner.nextLine()

  if(duration<0) duration = 1
  /*
  do{
    duration = scanner.nextInt()
    scanner.nextLine()
  }while(duration<0)
  */

  val book1 = Loan(title, borrower, duration)
  println(book1.calculateFine())
}