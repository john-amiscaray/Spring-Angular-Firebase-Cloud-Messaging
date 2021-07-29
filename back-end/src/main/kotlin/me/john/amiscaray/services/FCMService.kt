package me.john.amiscaray.services

import org.springframework.stereotype.Service
import com.google.firebase.messaging.*
import me.john.amiscaray.dtos.SubscriptionRequest
import me.john.amiscaray.dtos.DirectNotification
import me.john.amiscaray.dtos.TopicNotification


@Service
class FCMService {

    fun sendNotificationToTarget(notification: DirectNotification){

        val message = Message.builder()
                .setWebpushConfig(
                        WebpushConfig.builder()
                                .setNotification(
                                        WebpushNotification.builder()
                                                .setTitle(notification.title)
                                                .setBody(notification.message)
                                                .setIcon("https://assets.mapquestapi.com/icon/v2/circle@2x.png")
                                                .build()
                                ).build()
                )
                .setToken(notification.target)
                .build()
        FirebaseMessaging.getInstance().sendAsync(message)

    }

    fun sendNotificationToTopic(notification: TopicNotification){

        val message = Message.builder()
                .setWebpushConfig(
                        WebpushConfig.builder()
                                .setNotification(
                                        WebpushNotification.builder()
                                                .setTitle(notification.title)
                                                .setBody(notification.message)
                                                .setIcon("https://assets.mapquestapi.com/icon/v2/incident@2x.png")
                                                .build()
                                ).build()
                ).setTopic(notification.topic)
                .build()

        FirebaseMessaging.getInstance().sendAsync(message)

    }

    fun subscribeToTopic(subscription: SubscriptionRequest){

        FirebaseMessaging.getInstance().subscribeToTopic(listOf(subscription.subscriber), subscription.topic)

    }

}