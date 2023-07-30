package uz.core.network.dataProvider

import uz.core.network.ApiService
import javax.inject.Inject

class MovieDataProvider @Inject constructor(private val apiService: ApiService) {

    suspend fun getMovies(apiKey: String, query: String) = apiService.getMovie(apiKey, query)

}