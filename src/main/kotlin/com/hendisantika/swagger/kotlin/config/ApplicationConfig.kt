package com.hendisantika.swagger.kotlin.config

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Contact
import io.swagger.v3.oas.models.info.Info
import io.swagger.v3.oas.models.info.License
import org.springdoc.core.models.GroupedOpenApi
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ApplicationConfig {
//    @Bean
//    fun api(): Docket {
//        return Docket(DocumentationType.SWAGGER_2)
//            .apiInfo(getApiInfo())
//            .select()
//            .apis(RequestHandlerSelectors.basePackage("com.hendisantika.swagger.kotlin.controller"))
//            .paths(PathSelectors.any())
//            .build()
//    }
//
//    private fun getApiInfo(): ApiInfo {
//        val contact = Contact("Hendi Santika", "http://hendisantika.wordpress.com", "hendisantika@gmail.com")
//        return ApiInfoBuilder()
//            .title("Example Api Title")
//            .description("Example Api Definition")
//            .version("1.0.0")
//            .license("Apache 2.0")
//            .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0")
//            .contact(contact)
//            .build()
//    }

    @Bean
    fun publicApi(): GroupedOpenApi {
        return GroupedOpenApi.builder()
            .group("base-service")
            .pathsToMatch("/**")
            .build()
    }

    @Bean
    fun customOpenAPI(
        @Value("\${application-description}") appDescription: String?, @Value(
            "\${application-version}"
        ) appVersion: String?
    ): OpenAPI {
        val contact = Contact()
        contact.email = "hendisantika@yahoo.co.id"
        contact.name = "HENDI SANTIKA"
        contact.url = "https://www.s.id/hendisantika"
        return OpenAPI()
            .info(
                Info()
                    .title("Microservice Base Service Application API")
                    .version(appVersion)
                    .description(appDescription)
                    .termsOfService("http://swagger.io/terms/")
                    .license(License().name("Apache 2.0").url("http://springdoc.org"))
                    .contact(contact)
            )
    }

}
