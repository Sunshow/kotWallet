package net.sunshow.kotwallet.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

/**
 * author: sunshow.
 */
@RestController
class TestController {

    @GetMapping("/test")
    fun test() : Mono<Void> {
        return Mono.empty()
    }
}