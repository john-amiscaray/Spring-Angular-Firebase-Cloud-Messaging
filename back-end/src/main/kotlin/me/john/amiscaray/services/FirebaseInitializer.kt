package me.john.amiscaray.services

import com.google.auth.oauth2.GoogleCredentials
import com.google.firebase.FirebaseApp
import com.google.firebase.FirebaseOptions
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Value
import org.springframework.core.io.ClassPathResource
import org.springframework.stereotype.Service
import java.io.IOException
import javax.annotation.PostConstruct

@Service
class FirebaseInitializer {

    @Value("\${app.firebase-config-file}")
    lateinit var firebaseConfigPath: String

    // creates a logger we can use to log messages to the console. This is just to format our console messages nicely.
    var logger: Logger = LoggerFactory.getLogger(FirebaseInitializer::class.java)

    @PostConstruct
    fun initialize(){

        try {
            // Get our credentials to authorize this Spring Boot application.
            val options = FirebaseOptions.builder()
                    .setCredentials(GoogleCredentials.fromStream(ClassPathResource(firebaseConfigPath).inputStream)).build()
            // If our app firebase application was not initialized, do so.
            if (FirebaseApp.getApps().isEmpty()) {
                FirebaseApp.initializeApp(options)
                logger.info("Firebase application has been initialized")
            }
        } catch (e: IOException) {
            logger.error(e.message)
        }

    }

}