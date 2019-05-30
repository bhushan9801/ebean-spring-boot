package com.helios.ebean

import com.helios.ebean.domains.AppUser
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api")
class AppController(val service: AppService) {

    @GetMapping("users")
    fun getUsers(): List<AppUser> {
        return service.getUsers()
    }
}
