package uz.movie.domain.use_case

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import uz.core.common.UiEvents
import uz.movie.domain.model.Movie
import uz.movie.domain.repo.MovieRepository
import javax.inject.Inject

class GetMovieUseCase @Inject constructor(private val movieRepository: MovieRepository) {

    operator fun invoke(apiKey: String, query: String) = flow<UiEvents<List<Movie>>> {
        emit(UiEvents.Loading())
        emit(UiEvents.Success(movieRepository.getMovieList(apiKey, query)))
    }.catch {
        emit(UiEvents.Error(it.message.toString()))
    }.flowOn(Dispatchers.IO)
}