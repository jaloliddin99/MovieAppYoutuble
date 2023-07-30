package uz.movie.movieappyoutuble.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import uz.feature.movie.ui.navigation.MovieApi
import uz.movie.movieappyoutuble.navigation.NavigationProvider

@InstallIn(SingletonComponent::class)
@Module
object AppModule {

    @Provides
    fun provideNavigationProvider(movieApi: MovieApi): NavigationProvider{
        return NavigationProvider(movieApi)
    }

}