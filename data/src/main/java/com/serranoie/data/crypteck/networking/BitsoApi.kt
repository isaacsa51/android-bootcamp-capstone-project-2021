package com.serranoie.data.crypteck.networking

import com.serranoie.data.crypteck.dto.book.AvailableBooksResponse
import com.serranoie.data.crypteck.dto.book.OrderBookResponse
import com.serranoie.data.crypteck.dto.trade.TicketResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface BitsoApi {
    //Books Endpoints
    @GET("/v3/available_books/")
    fun getAvailableBooks(): Call<List<AvailableBooksResponse>>

    @GET("v3/order_book/{book}")
    fun getOpenOrdersBook(@Path("book") book: String): Call<List<OrderBookResponse>>

    //Trades Endpoints
    @GET("/v3/ticker/{book}")
    fun getTickers(@Path("book") book: String): Call<List<TicketResponse>>

    @GET("/v3/trades/{book}")
    fun getRecentTrades(@Path("book") book: String): Call<List<TicketResponse>>
}