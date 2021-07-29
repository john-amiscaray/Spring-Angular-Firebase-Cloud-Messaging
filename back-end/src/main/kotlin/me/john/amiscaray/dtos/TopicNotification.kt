package me.john.amiscaray.dtos

data class TopicNotification(val topic: String, override val title: String,
                             override val message: String): AppNotification(title, message)