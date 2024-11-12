package ru.quipy.logic.user

import ru.quipy.api.user.events.UserChangedNameEvent
import ru.quipy.api.user.events.UserCreatedEvent
import java.util.*

fun UserAggregateState.createUser(userName: String): UserCreatedEvent {
    return UserCreatedEvent(UUID.randomUUID(), userName)
}

fun UserAggregateState.changeUserName(userName: String, userId: UUID): UserChangedNameEvent {
    if (this.userName == userName) {
        throw IllegalArgumentException("Username for user with id=$userId should be different")
    }

    return UserChangedNameEvent(userId, userName)
}