package com.rubahapi.posservices.controller

import com.rubahapi.posservices.model.User
import org.springframework.web.bind.annotation.*

@RestController
@CrossOrigin
@RequestMapping("/users")
class UserController {

    @GetMapping("")
    fun index(): MutableList<User> {
        return mutableListOf(User(1, "", "", "", false, null, null))
    }

    @PostMapping("/update")
    fun update():String{
        return "update"
    }

    @PostMapping("/create")
    fun create():String{
        return "create"
    }


    @GetMapping("/select")
    fun select():String{
        return "select"
    }

    @PostMapping("/delete")
    fun delete():String{
        return "delete"
    }
}