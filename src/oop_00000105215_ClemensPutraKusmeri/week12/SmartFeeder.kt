package oop_00000105215_ClemensPutraKusmeri.week12

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {
    require(requestedGram > 0) { "Porsi kibble harus lebih dari 0 gr" }
    
    if (isJammed) {
        throw DispenserJamException()
    }
    
    // Implementation will continue in next steps
    return 0
}
