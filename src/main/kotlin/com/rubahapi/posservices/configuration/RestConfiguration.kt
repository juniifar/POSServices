package com.rubahapi.posservices.configuration

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.View
import org.springframework.web.servlet.ViewResolver
import org.springframework.web.servlet.view.BeanNameViewResolver
import org.springframework.web.servlet.view.json.MappingJackson2JsonView

@Configuration
class RestConfiguration {
    @Bean
    fun jsonTemplate(): View? {
        val view = MappingJackson2JsonView()
        view.setPrettyPrint(true)
        return view
    }

    @Bean
    fun viewResolver(): ViewResolver? {
        return BeanNameViewResolver()
    }
}