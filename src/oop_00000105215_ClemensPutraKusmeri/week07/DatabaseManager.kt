package oop_00000105215_ClemensPutraKusmeri.week07

object DatabaseManager{
  var connectionStatus: String = "Disconnected"

  fun connect(){
    connectionStatus = "Connected to the Server"
    println("Database is ready.")
  }
}