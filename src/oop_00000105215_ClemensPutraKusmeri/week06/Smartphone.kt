class smartwatch: Camera, Phone {
  // resolve
  override fun turnOn(){
    super<Camera>.turnOn()
    super<Phone>.turnOn()
    println("Sistem Operasi Smartphone berhasil booting.")
  }
}