package uz.movie.domain.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import uz.movie.domain.repo.MovieRepository
import uz.movie.domain.use_case.GetMovieUseCase


@InstallIn(SingletonComponent::class)
@Module
object DomainLayerModule {


    @Provides
    fun provideGetMovieListUseCase(movieRepository: MovieRepository):GetMovieUseCase{
        return GetMovieUseCase(movieRepository)
    }


}