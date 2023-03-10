package com.brosvaby.android.weatherapp.api

import com.brosvaby.android.weatherapp.result.CityResult
import io.reactivex.Observable
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET(Forecast)
    fun getCityForecast(
        @Query("q") q: String,
        @Query("units") units: String = "metric",
        @Query("appid") appid: String
    ): Single<CityResult>

    @GET(Forecast)
    fun getCityForecastByStandard(
        @Query("q") q: String,
        @Query("units") units: String = "standard",
        @Query("appid") appid: String
    ): Observable<CityResult>
}