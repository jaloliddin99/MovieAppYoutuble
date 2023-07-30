package uz.movie.domain.repo

import uz.movie.domain.model.Movie

interface MovieRepository {


    suspend fun getMovieList(apiKey: String, query: String): List<Movie>
}