package me.john.amiscaray.dtos

// The subscriber field specifies the token of the subscribing user
data class SubscriptionRequest(val subscriber: String, val topic: String)