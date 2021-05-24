package com.contena.mysimplecleanarchitecture.data

import com.contena.mysimplecleanarchitecture.domain.IMessageRepository
import com.contena.mysimplecleanarchitecture.domain.MessageEntity

class MessageRepository(private val messageDataSource: IMessageDataSource): IMessageRepository {
    override fun getWelcomeMessage(name: String): MessageEntity = messageDataSource.getMessageFromSource(name)
}