package com.rubahapi.posservices.controller

import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@CrossOrigin
class DefaultController {

    @GetMapping("/")
    fun helloKotlin(): String{
        return "Hello World"
    }
}