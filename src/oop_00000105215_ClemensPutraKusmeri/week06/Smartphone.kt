package oop_00000105215_ClemensPutraKusmeri.week06

class smartwatch: Camera, Phone {
  // resolve
  override fun turnOn(){
    super<Camera>.turnOn()
    super<Phone>.turnOn()
    println("Sistem Operasi Smartphone berhasil booting.")
  }
}