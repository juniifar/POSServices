package com.rubahapi.posservices.greeting

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController()
class GreetingController {
    val template = "Hello, %s"
    val counter = AtomicLong()

    @GetMapping("/greeting")
    fun greeting(@RequestParam(value="name", defaultValue = "World") name: String):Greeting{
        return Greeting(counter.incrementAndGet(), String.format(template, name))
    }
}