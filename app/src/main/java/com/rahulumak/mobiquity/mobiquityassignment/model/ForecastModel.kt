package com.rahulumak.mobiquity.mobiquityassignment.model


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ForecastModel(
    @SerializedName("city")
    val city: City,
    @SerializedName("cnt")
    val cnt: Int,
    @SerializedName("cod")
    val cod: String,
    @SerializedName("list")
    val list: List<ForecastList>,
    @SerializedName("message")
    val message: Int
): Parcelable {
    @Parcelize
    data class City(
        @SerializedName("coord")
        val coord: Coord,
        @SerializedName("country")
        val country: String,
        @SerializedName("id")
        val id: Int,
        @SerializedName("name")
        val name: String,
        @SerializedName("population")
        val population: Int,
        @SerializedName("sunrise")
        val sunrise: Int,
        @SerializedName("sunset")
        val sunset: Int,
        @SerializedName("timezone")
        val timezone: Int
    ): Parcelable {
        @Parcelize
        data class Coord(
            @SerializedName("lat")
            val lat: Double,
            @SerializedName("lon")
            val lon: Double
        ): Parcelable
    }
    @Parcelize
    data class ForecastList (
        @SerializedName("clouds")
        val clouds: Clouds,
        @SerializedName("dt")
        val dt: Long,
        @SerializedName("dt_txt")
        val dtTxt: String,
        @SerializedName("main")
        val main: Main,
        @SerializedName("pop")
        val pop: Double,
        @SerializedName("sys")
        val sys: Sys,
        @SerializedName("visibility")
        val visibility: Int,
        @SerializedName("weather")
        val weather: List<Weather>,
        @SerializedName("wind")
        val wind: Wind
    ): Parcelable {
        @Parcelize
        data class Clouds(
            @SerializedName("all")
            val all: Int
        ): Parcelable
        @Parcelize
        data class Main(
            @SerializedName("feels_like")
            val feelsLike: Double,
            @SerializedName("grnd_level")
            val grndLevel: Int,
            @SerializedName("humidity")
            val humidity: Int,
            @SerializedName("pressure")
            val pressure: Int,
            @SerializedName("sea_level")
            val seaLevel: Int,
            @SerializedName("temp")
            val temp: Double,
            @SerializedName("temp_kf")
            val tempKf: Double,
            @SerializedName("temp_max")
            val tempMax: Double,
            @SerializedName("temp_min")
            val tempMin: Double
        ): Parcelable
        @Parcelize
        data class Sys(
            @SerializedName("pod")
            val pod: String
        ): Parcelable
        @Parcelize
        data class Weather(
            @SerializedName("description")
            val description: String,
            @SerializedName("icon")
            val icon: String,
            @SerializedName("id")
            val id: Int,
            @SerializedName("main")
            val main: String
        ): Parcelable
        @Parcelize
        data class Wind(
            @SerializedName("deg")
            val deg: Int,
            @SerializedName("speed")
            val speed: Double
        ): Parcelable
    }
}