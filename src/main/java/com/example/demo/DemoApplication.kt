package com.example.demo

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.stereotype.Controller


@SpringBootApplication
open class DemoApplication : CommandLineRunner {


    @Throws(Exception::class)
    override fun run(vararg args: kotlin.String) {
        println("Hello ")

    }

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            CommandLineRunner {
                args ->
                println("hellodd")
            }
            SpringApplication.run(DemoApplication::class.java, *args)
        }
    }
}
