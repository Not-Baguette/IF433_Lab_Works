package oop_00000105215_ClemensPutraKusmeri.week07

fun main(){
  println("=== TEST SINGLETON ===")
  println("Status: ${DatabaseManager.connectionStatus}")
  DatabaseManager.connect()

  println("\n=== TEST COMPANION OBJECT ===")
  val client = NetworkClient.createClient()
  client.connect()

  println("\n=== TEST REGULAR CLASS ===")
  val reg1 = RegularUser("Clemens", 19)
  val reg2 = RegularUser("Clemens", 19)
  println(reg1)
  println("Sama? ${reg1 == reg2}")

  println("\n=== TEST DATA CLASS ===")
  val data1 = DataUser("Clemens", 19)
  val data2 = DataUser("Clemens", 19)
  println(data1)
  println("Sama? ${data1 == data2}")
}