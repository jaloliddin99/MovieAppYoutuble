package uz.feature.movie.data.mapper

import uz.core.network.model.MovieListResponse
import uz.movie.domain.model.Movie


fun MovieListResponse.toDomainMovieList(): List<Movie>{
    return this.movieDTOS.map {
        Movie(it.poster_path)
    }
}