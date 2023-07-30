package uz.feature.movie.data.repo

import uz.core.network.dataProvider.MovieDataProvider
import uz.feature.movie.data.mapper.toDomainMovieList
import uz.movie.domain.model.Movie
import uz.movie.domain.repo.MovieRepository
import javax.inject.Inject

class MovieRepoImpl @Inject constructor(private val movieDataProvider: MovieDataProvider): MovieRepository {


    override suspend fun getMovieList(apiKey: String, query: String): List<Movie> {
        return movieDataProvider.getMovies(apiKey, query).toDomainMovieList()
    }


}