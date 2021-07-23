package com.example.workindiatanishqsrivastava

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface ProductAPI{

    @GET("volley_array.json")
    fun getProducts() : Call<List<ProductItem>>

    companion object {

        var BASE_URL = "https://run.mocky.io/v3/b6a30bb0-140f-4966-8608-1dc35fa1fadc"

        fun create() : ProductAPI {

            val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .build()
            return retrofit.create(ProductAPI::class.java)

        }
    }
}