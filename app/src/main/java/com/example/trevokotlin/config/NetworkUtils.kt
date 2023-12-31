package com.example.trevokotlin.config

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class NetworkUtils {
    var getRetrofitInstance: Retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl("http://10.0.0.113:8080/trevo/")
        .build()
    val productService = getRetrofitInstance.create(EndpointsApi::class.java)

}