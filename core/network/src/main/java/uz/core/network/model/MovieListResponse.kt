package uz.core.network.model

data class MovieListResponse(
    val page: Int,
    val movieDTOS: List<MovieDTO>,
    val total_pages: Int,
    val total_results: Int
)