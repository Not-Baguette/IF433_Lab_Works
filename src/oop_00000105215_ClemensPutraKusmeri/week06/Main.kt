package oop_00000105215_ClemensPutraKusmeri.week06

fun processCheckout(method: PaymentMethod, amount: Double){
  println("-> Memulai checkout...")
  method.pay(amount)
}

fun main(){
  val myWatch = Smartwatch()
  myWatch.showTime()

  val myPhone = Smartphone()
  myPhone.turnOn()

  val pay1 = Gopay()
  val pay2 = CreditCard()

  println("\n=== TESTING CHECKOUT ===")
  processCheckout(pay1, 50000.0)
  processCheckout(pay2, 150000.0)

  println("=== SMART HOME ===")
  val cctv = SmartCCTV("0", "Ezviz Dapur")
  val speaker = SmartSpeaker("1", "Google Nest Dapur")
  val lamp = SmartLamp("2", "Ruang Tamu")

  val hub = SmartHomeHub()
  hub.addDevice(cctv)
  hub.addDevice(speaker)
  hub.addDevice(lamp)

  hub.activateSecurityMode()
  println("\n")
  hub.turnOffAllSwitches()
}