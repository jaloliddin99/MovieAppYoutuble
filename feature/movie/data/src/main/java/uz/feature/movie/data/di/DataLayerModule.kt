package uz.feature.movie.data.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import uz.core.network.dataProvider.MovieDataProvider
import uz.feature.movie.data.repo.MovieRepoImpl
import uz.movie.domain.repo.MovieRepository

@InstallIn(SingletonComponent::class)
@Module
object DataLayerModule {


    @Provides
    fun provideMovieRepo(movieDataProvider: MovieDataProvider): MovieRepository{
        return MovieRepoImpl(movieDataProvider)
    }



}