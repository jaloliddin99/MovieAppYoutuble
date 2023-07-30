package uz.feature.movie.ui.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import uz.core.feature_api.FeatureApi

interface MovieApi: FeatureApi {


}

class MovieApiImpl: MovieApi{
    override fun registerGraph(navController: NavHostController, navGraphBuilder: NavGraphBuilder) {
        InternalFeatureMovieApi.registerGraph(
            navController, navGraphBuilder
        )
    }

}