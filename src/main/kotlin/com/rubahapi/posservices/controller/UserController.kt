package com.rubahapi.posservices.controller

import com.rubahapi.posservices.model.User
import com.rubahapi.posservices.payload.UserPayloadInsert
import com.rubahapi.posservices.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.time.LocalDateTime


@RestController
@CrossOrigin
@RequestMapping("/users")
class UserController {
    @Autowired
    lateinit var userRepository: UserRepository


    @GetMapping("")
    fun index(): MutableList<User> {
        return mutableListOf(User(1, "", "", "", false, null, null))
    }

    @PostMapping("/update")
    fun update():String{
        return "update"
    }

    @PostMapping("/create")
    fun create(@RequestBody newUser: UserPayloadInsert):User{
        val user = User(0, newUser.name, newUser.username, newUser.password,newUser.state, LocalDateTime.now(), LocalDateTime.now())
        return userRepository.save(user)
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