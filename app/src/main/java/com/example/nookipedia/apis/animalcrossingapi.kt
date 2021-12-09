package com.example.nookipedia.apis

import com.example.nookipedia.json.bugjson.bugjsonItem
import com.example.nookipedia.json.fishjason.fishjsonItem
import com.example.nookipedia.json.seajson.seajsonItem
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers

interface animalcrossingapi {

    @Headers("X-API-KEY: 91fd543a-28da-4b8d-af55-07a3d9fd6670")
    @GET("/nh/fish")
    fun getfish(): Call<List<fishjsonItem>>



    @Headers("X-API-KEY: 91fd543a-28da-4b8d-af55-07a3d9fd6670")
    @GET("/nh/bugs")
    fun getbug(): Call<List<bugjsonItem>>


    @Headers("X-API-KEY: 91fd543a-28da-4b8d-af55-07a3d9fd6670")
    @GET("/nh/sea")
    fun getsea(): Call<List<seajsonItem>>


}