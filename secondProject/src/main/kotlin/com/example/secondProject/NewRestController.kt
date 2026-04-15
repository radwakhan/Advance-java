package com.example.secondProject

import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

data class Hello(val message: String)

@RestController
class NewRestController {
    @GetMapping("/hello")
    fun getMessage(): Hello {
        val logger= LoggerFactory.getLogger(this::class.java)
        logger.trace(" it works when we trying to investigate something locally")
        logger.debug("less verbose and not for production and more for debbuging issues")
//        trace and debug by default not printed by console
        logger.info("use for status information")
        logger.warn("warn")
        logger.error("error")

        logger.info("info {} {}",1,"abc")
        try {
            val x=1/0
        }catch (e: Throwable){
            logger.error("can't compute x",e)
        }

        return Hello("hi this is radwa")


    }
}