package com.example.mareasv7.data

data class Station(val id:String,val code:String,val puerto:String,val lat:String,val lon:String)
data class StationList(val puertos:List<Station>); data class StationEnvelope(val estaciones:StationList)
data class IhmEvent(val fecha:String?=null,val hora:String,val tipo:String,val altura:Double)
data class IhmEventList(val marea:List<IhmEvent>); data class IhmTides(val puerto:String,val fecha:String?=null,val datos:IhmEventList); data class IhmResponse(val mareas:IhmTides)
data class CurrentWeather(val temperature_2m:Double?,val apparent_temperature:Double?,val relative_humidity_2m:Int?,val surface_pressure:Double?,val uv_index:Double?,val wind_speed_10m:Double?,val wind_direction_10m:Double?,val wind_gusts_10m:Double?)
data class HourlyWeather(val time:List<String>?,val temperature_2m:List<Double>?,val uv_index:List<Double>?,val wind_speed_10m:List<Double>?,val wind_gusts_10m:List<Double>?)
data class WeatherResponse(val current:CurrentWeather?,val hourly:HourlyWeather?)
data class MarineCurrent(val wave_height:Double?,val wave_period:Double?,val wave_direction:Double?,val swell_wave_height:Double?,val sea_surface_temperature:Double?)
data class MarineResponse(val current:MarineCurrent?)
data class Point(val x:Double,val y:Double); data class TideEvent(val time:String,val type:String,val height:Double,val offset:Double)
data class Data(val place:String,val lat:Double,val lon:Double,val tide:List<Point>,val events:List<TideEvent>,val level:Double,val rising:Boolean,val temp:Double,val feels:Double,val humidity:Int,val pressure:Double,val uv:Double,val wind:Double,val windDir:Double,val gust:Double,val wave:Double,val period:Double,val waveDir:Double,val swell:Double,val seaTemp:Double,val temp24:List<Point>,val uv24:List<Point>,val wind24:List<Point>,val gust24:List<Point>,val coefficient:Int,val moon:String)
