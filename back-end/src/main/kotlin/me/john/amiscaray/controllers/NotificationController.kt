package me.john.amiscaray.controllers

import me.john.amiscaray.dtos.SubscriptionRequest
import me.john.amiscaray.dtos.DirectNotification
import me.john.amiscaray.dtos.TopicNotification
import me.john.amiscaray.services.FCMService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class NotificationController(private val fcm: FCMService) {

    @PostMapping("/notification")
    fun sendTargetedNotification(@RequestBody notification: DirectNotification){

        fcm.sendNotificationToTarget(notification)

    }

    @PostMapping("/topic/notification")
    fun sendNotificationToTopic(@RequestBody notification: TopicNotification){

        fcm.sendNotificationToTopic(notification)

    }

    @PostMapping("/topic/subscription")
    fun subscribeToTopic(@RequestBody subscription: SubscriptionRequest){

        fcm.subscribeToTopic(subscription)

    }

}