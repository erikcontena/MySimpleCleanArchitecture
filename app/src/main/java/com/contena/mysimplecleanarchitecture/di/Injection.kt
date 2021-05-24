package com.contena.mysimplecleanarchitecture.di

import com.contena.mysimplecleanarchitecture.data.IMessageDataSource
import com.contena.mysimplecleanarchitecture.data.MessageDataSource
import com.contena.mysimplecleanarchitecture.data.MessageRepository
import com.contena.mysimplecleanarchitecture.domain.IMessageRepository
import com.contena.mysimplecleanarchitecture.domain.MessageInteractor
import com.contena.mysimplecleanarchitecture.domain.MessageUseCase

object Injection {

    fun provideUseCase(): MessageUseCase{
        val repository = provideRepository()
        return MessageInteractor(repository)
    }

    private fun provideRepository(): IMessageRepository{
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource{
        return MessageDataSource()
    }
}