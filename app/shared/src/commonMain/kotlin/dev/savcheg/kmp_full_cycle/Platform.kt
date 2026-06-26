package dev.savcheg.kmp_full_cycle

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform