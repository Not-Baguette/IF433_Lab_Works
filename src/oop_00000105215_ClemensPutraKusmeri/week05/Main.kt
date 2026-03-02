package oop_00000105215_ClemensPutraKusmeri.week05

fun main(){
  val dosen1 = Dosen(nama="Pak Alex", nidn="0123456")
  val admin1 = Admin(nama="Bu Siti")

  val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

  println("=== Aktifitas Pegawai ===")
  for(pegawai in daftarPegawai){
    pegawai.bekerja()
    when(pegawai){
      is Dosen -> {
        println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
        pegawai.mengajar()
      } is Admin -> {
        println("=> Terdeteksi sebagai Admin")
        pegawai.doAdminWork()
      }
    }
  }

  println("\n=== Simulasi Pembayaran ===")
  val eWallet = EWallet("Budi Santoso", 50000.0)
  val creditCard = CreditCard("Budi Santoso", 100000.0)

  val payments: List<PaymentMethod> = listOf(eWallet, creditCard)

  for(payment in payments){
    println("\n[Mencoba pembayaran Rp75000.0]")
    payment.processPayment(75000.0)
  }
}