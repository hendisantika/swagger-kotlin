package com.hendisantika.swagger.kotlin.controller

import com.hendisantika.swagger.kotlin.bean.Greeting
import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import io.swagger.annotations.ApiResponse
import io.swagger.annotations.ApiResponses
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController



/**
 * Created by IntelliJ IDEA.
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 9/13/17
 * Time: 6:13 AM
 * To change this template use File | Settings | File Templates.
 */

@RestController
@RequestMapping("/admin")
@Api(value = "admin", description = "Rest API for administrative operations", tags = arrayOf("Admin API"))
class AdminController {
    @RequestMapping(value = "/hello/{name}", method = arrayOf(RequestMethod.GET), produces = arrayOf("application/json"))
    @ApiOperation(value = "Display greeting message to admin user", response = Greeting::class)
    @ApiResponses(value = *arrayOf(ApiResponse(code = 200, message = "OK"), ApiResponse(code = 401, message = "You are not authorized access the resource"), ApiResponse(code = 404, message = "The resource not found")))
    fun message(@PathVariable name: String): Greeting {
        return Greeting(name, "Hello admin " + name)
    }

}