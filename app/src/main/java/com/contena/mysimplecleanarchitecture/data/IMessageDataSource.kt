package com.contena.mysimplecleanarchitecture.data

import com.contena.mysimplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}