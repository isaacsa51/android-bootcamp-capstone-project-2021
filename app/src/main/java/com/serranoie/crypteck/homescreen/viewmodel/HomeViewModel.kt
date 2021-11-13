package com.serranoie.crypteck.homescreen.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.serranoie.crypteck.domain.usecases.book.GetAvailableBooksUseCase
import com.serranoie.data.crypteck.di.RemoteGetAvailableBooks
import com.serranoie.data.crypteck.dto.book.AvailableBookImagePayload
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(@RemoteGetAvailableBooks private val getAvailableBooksUseCase: GetAvailableBooksUseCase): ViewModel() {

    private val mutableBookInfo = MutableLiveData<AvailableBookImagePayload>()
    val bookInfo: LiveData<AvailableBookImagePayload> = mutableBookInfo


}