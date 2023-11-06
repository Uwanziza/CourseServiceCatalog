package com.KotlinSpring.controller

import com.KotlinSpring.service.GreetingsService
import mu.KLogging
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/v1/greetings")
class GreatingController (val greetingsService: GreetingsService){

    companion object:KLogging()
    @GetMapping("/{name}")
    fun retrieveGreeting(@PathVariable("name") name:String): String {
       // println("hello ")
        //return  "Hello $name"
        logger.info("$name")
        return greetingsService.retrieveGreeting(name)
    }
}

//Automated tests
