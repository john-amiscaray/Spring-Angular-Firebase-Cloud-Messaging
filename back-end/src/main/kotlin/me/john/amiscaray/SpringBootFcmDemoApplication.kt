package me.john.amiscaray

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.web.servlet.config.annotation.CorsRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@SpringBootApplication
class SpringBootFcmDemoApplication{

    @Bean
    fun cors(): WebMvcConfigurer {

        return object : WebMvcConfigurer{
            override fun addCorsMappings(registry: CorsRegistry) {
                // Allow our client (on localhost:4200) to send requests anywhere in our backend
                registry.addMapping("/**").allowedOrigins("http://localhost:4200")
            }
        }

    }

}

fun main(args: Array<String>) {
    runApplication<SpringBootFcmDemoApplication>(*args)
}

