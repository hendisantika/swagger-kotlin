package com.hendisantika.swagger.kotlin.bean

import io.swagger.annotations.ApiModelProperty

data class Greeting(
    @ApiModelProperty(notes = "Provided user name", required = true)
    val player: String?,

    @ApiModelProperty(notes = "The system generated greeting message", readOnly = true)
    val message: String?
)