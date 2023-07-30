package uz.movie.movieappyoutuble.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import uz.core.common.MovieFeature

@Composable
fun AppNavigation(
    navController: NavHostController,
    navigationProvider: NavigationProvider
) {

    NavHost(navController = navController, startDestination = MovieFeature.nestedRoute){
        navigationProvider.movieApi.registerGraph(
            navController,
            this
        )
    }
}