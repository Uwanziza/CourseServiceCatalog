//package com.kotlin.controller
//
//import com.KotlinSpring.controller.GreatingController
//import com.KotlinSpring.service.GreetingsService
//import com.ninjasquad.springmockk.MockkBean
//import io.mockk.every
//import org.junit.jupiter.api.Assertions
//import org.junit.jupiter.api.Test
//import org.springframework.beans.factory.annotation.Autowired
//import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
//
//import org.springframework.test.web.reactive.server.WebTestClient
//
//@WebMvcTest(controllers = [GreatingController::class])
//@AutoConfigureWebTestClient
//class GreetingControllerTest {
//
//    @Autowired
//    lateinit var webTestClient: WebTestClient
//
//    @MockkBean
//    lateinit var greetingsServiceMock: GreetingsService
//    @Test
//    fun retrieveGreeting(){
//        var name="chanelle"
//
//        every { greetingsServiceMock.retrieveGreeting(any()) } returns "$name"
//
//        val result= webTestClient.get()
//            .uri("/v1/greetings/{name}",name)
//            .exchange()
//            .expectStatus().is2xxSuccessful
//            .expectBody(String::class.java)
//            .returnResult()
//        Assertions.assertEquals("$name",result.responseBody)
//    }
//
//}
