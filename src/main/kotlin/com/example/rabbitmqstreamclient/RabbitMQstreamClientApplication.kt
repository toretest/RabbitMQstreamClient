package com.example.rabbitmqstreamclient

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RabbitMQstreamClientApplication

fun main(args: Array<String>) {
    runApplication<RabbitMQstreamClientApplication>(*args)
}
