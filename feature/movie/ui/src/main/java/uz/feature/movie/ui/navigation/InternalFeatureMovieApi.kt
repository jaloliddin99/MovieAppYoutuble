package uz.feature.movie.ui.navigation

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import uz.core.common.MovieFeature
import uz.core.feature_api.FeatureApi
import uz.feature.movie.ui.screen.MovieScreen
import uz.feature.movie.ui.screen.MovieSearchViewModel

internal object InternalFeatureMovieApi: FeatureApi {
    override fun registerGraph(
        navController: NavHostController,
        navGraphBuilder: NavGraphBuilder
    ) {
        navGraphBuilder.navigation(startDestination = MovieFeature.movieScreenRoute, route = MovieFeature.nestedRoute){

            composable(MovieFeature.movieScreenRoute){
                val viewModel = hiltViewModel<MovieSearchViewModel>()
                MovieScreen(viewModel = viewModel)
            }
        }
    }
}