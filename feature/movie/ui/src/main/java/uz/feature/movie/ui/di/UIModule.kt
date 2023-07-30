package uz.feature.movie.ui.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import uz.feature.movie.ui.navigation.MovieApi
import uz.feature.movie.ui.navigation.MovieApiImpl

@InstallIn(SingletonComponent::class)
@Module
object UIModule {

    @Provides
    fun provideMovieApi():MovieApi{
        return MovieApiImpl()
    }
}