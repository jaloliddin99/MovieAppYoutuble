package uz.feature.movie.ui.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import uz.core.common.MovieFeature
import uz.core.feature_api.FeatureApi

object InternalFeatureMovieApi: FeatureApi {
    override fun registerGraph(
        navController: NavHostController,
        navGraphBuilder: NavGraphBuilder
    ) {
        navGraphBuilder.navigation(startDestination = MovieFeature.movieScreenRoute, route = MovieFeature.nestedRoute){

            composable(MovieFeature.movieScreenRoute){

            }
        }
    }
}