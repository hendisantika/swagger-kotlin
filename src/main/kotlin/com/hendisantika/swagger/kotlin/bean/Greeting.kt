package com.hendisantika.swagger.kotlin.bean

import io.swagger.v3.oas.annotations.media.Schema

data class Greeting(
    @Schema(name = "Provided user name", required = true)
    val player: String?,

    @Schema(name = "The system generated greeting message", readOnly = true)
    val message: String?
)
