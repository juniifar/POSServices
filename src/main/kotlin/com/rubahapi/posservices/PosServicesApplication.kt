package com.rubahapi.posservices

import io.swagger.v3.oas.annotations.OpenAPIDefinition
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2

@OpenAPIDefinition
@SpringBootApplication
class PosServicesApplication

fun main(args: Array<String>) {
	runApplication<PosServicesApplication>(*args)
}
