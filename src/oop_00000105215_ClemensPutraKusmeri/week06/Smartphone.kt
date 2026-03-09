package oop_00000105215_ClemensPutraKusmeri.week06

class Smartphone: Camera, Phone {
  // resolve
  override fun turnOn(){
    super<Camera>.turnOn()
    super<Phone>.turnOn()
    println("Sistem Operasi Smartphone berhasil booting.")
  }
}