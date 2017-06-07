package net.sunshow.kotwallet

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class KotWalletApplication

fun main(args: Array<String>) {
    SpringApplication.run(KotWalletApplication::class.java, *args)
}
