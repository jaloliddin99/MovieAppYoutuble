package uz.core.network

import retrofit2.http.GET
import retrofit2.http.Query
import uz.core.network.model.MovieListResponse

interface ApiService {

    //https://api.themoviedb.org/3/search/movie?api_key=100bb96de8439f4f233ff84201cad1df&query=Harry
    @GET("search/movie")
    suspend fun getMovie(
        @Query("api_key") apiKey: String,
        @Query("query") query: String
    ): MovieListResponse
}