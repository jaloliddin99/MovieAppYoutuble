package uz.feature.movie.ui.screen

import uz.movie.domain.model.Movie

data class MovieSearchStateHolder(
    val isLoading: Boolean = false,
    val data: List<Movie> ?= null,
    val error: String = ""
)
