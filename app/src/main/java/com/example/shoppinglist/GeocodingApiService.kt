package com.example.shoppinglist

import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface GeocodingApiService {

    @GET("maps/api/geocode/json")
    suspend fun getAddressFromCoordinates(
        @Query("latlng") latlng: String,
        @Query("key") apiKey: String,
        @Header("X-Android-Package") androidPackage: String = "com.example.shoppinglist",
        @Header("X-Android-Cert") sha1: String = "49:98:59:46:3C:FD:32:4A:60:8D:BD:F4:DA:99:7E:55:96:1E:FF:47"
    ) : GeocodingResponse
}