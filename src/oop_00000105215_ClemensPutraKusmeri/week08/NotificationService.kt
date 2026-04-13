package oop_00000105215_ClemensPutraKusmeri.week08

object NotificationService {
  fun sendWelcomeMessage(profile: UserProfile?) {
    if (profile == null) {
      println("Profil tidak tersedia")
      return
    }

    println("Mengirim notifikasi ke user ${profile.id}")

    if (profile.displayName != null) {
      println("Halo, ${profile.displayName.uppercase()}!")
    } else {
      println("Halo, pengguna tanpa nama")
    }

    if (profile.email != null) {
      println("Email tujuan: ${profile.email}")
    }
  }
}