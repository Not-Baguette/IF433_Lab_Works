package oop_00000105215_ClemensPutraKusmeri.week06

class Button(override val name: String): Clickable {
  override fun click(){
    println("Tombol '$name' berhasil diclick")
  }
}