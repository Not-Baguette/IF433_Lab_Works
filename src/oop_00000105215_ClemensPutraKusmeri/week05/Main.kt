package oop_00000105215_ClemensPutraKusmeri.week05

fun main(){
  println("=== Test MathHelper - Function Overloading ===")
  
  val mathHelper = MathHelper()
  
  // Test hitungLuas untuk persegi
  val luasPersegi = mathHelper.hitungLuas(5)
  println("Luas persegi dengan sisi 5: $luasPersegi")
  
  // Test hitungLuas untuk persegi panjang
  val luasPersegiPanjang = mathHelper.hitungLuas(4, 6)
  println("Luas persegi panjang dengan panjang 4 dan lebar 6: $luasPersegiPanjang")
  
  // Test hitungLuas untuk lingkaran
  val luasLingkaran = mathHelper.hitungLuas(7.0)
  println("Luas lingkaran dengan jari-jari 7.0: $luasLingkaran")
  
  println("\n=== Aktifitas Pegawai ===")
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
    
    // Smart Casting: Cek apakah payment adalah EWallet
    if(payment is EWallet){
      println("\n=> Terdeteksi sebagai EWallet. Melakukan top up...")
      payment.topUp(50000.0)
      println("\n[Mencoba pembayaran Rp75000.0 lagi setelah top up]")
      payment.processPayment(75000.0)
    }
  }
}