package oop_00000105215_ClemensPutraKusmeri.week06

class smartwatch : Watch(), BluetoothConnectable, Rechargeable {
  override fun showTime(){
    println("Layar OLED menyala: 14:00 WIB")
  }

  override fun connectBluetooth(){
    println("Mencari perangkat HP di sekitar untuk Pairing...")
  }

  override fun chargeBattery(){
    println("Mengisi daya menggunakan charger magnetik 15W")
  }
}