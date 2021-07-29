package me.john.amiscaray.dtos

data class DirectNotification(val target: String, override val title: String,
                              override val message: String): AppNotification(title, message)