package com.rubahapi.posservices.repository

import com.rubahapi.posservices.model.User
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository


@Repository
interface UserRepository : CrudRepository<User, Long>
