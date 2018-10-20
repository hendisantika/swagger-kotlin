package com.hendisantika.swagger.kotlin.bean

import io.swagger.annotations.ApiModelProperty

/**
 * Created by IntelliJ IDEA.
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 9/13/17
 * Time: 5:51 AM
 * To change this template use File | Settings | File Templates.
 */
data class Greeting(
        @ApiModelProperty(notes = "Provided user name", required = true)
        val player: String?,

        @ApiModelProperty(notes = "The system generated greeting message", readOnly = true)
        val message: String?
)