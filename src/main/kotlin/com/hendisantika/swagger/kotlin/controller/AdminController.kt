package com.hendisantika.swagger.kotlin.controller

import com.hendisantika.swagger.kotlin.bean.Greeting
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/admin")
@Tag(name = "admin", description = "Rest API for administrative operations")
class AdminController {
    @RequestMapping(
        value = ["/hello/{name}"],
        method = arrayOf(RequestMethod.GET),
        produces = arrayOf("application/json")
    )
    @Operation(summary = "Display greeting message to admin user")
    @ApiResponses(
        value = *arrayOf(
            ApiResponse(responseCode = "200", description = "OK"),
            ApiResponse(responseCode = "401", description = "You are not authorized access the resource"),
            ApiResponse(responseCode = "404", description = "The resource not found")
        )
    )
    fun message(@PathVariable name: String): Greeting {
        return Greeting(name, "Hello admin " + name)
    }

}
