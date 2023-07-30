package uz.movie.movieappyoutuble

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import uz.movie.movieappyoutuble.navigation.AppNavigation
import uz.movie.movieappyoutuble.navigation.NavigationProvider
import uz.movie.movieappyoutuble.ui.theme.MovieAppYoutubleTheme
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var navigationProvider: NavigationProvider


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MovieAppYoutubleTheme {
                // A surface container using the 'background' color from the theme
                val navController = rememberNavController()
                App(navHostController = navController, navigationProvider)
            }
        }
    }
}

@Composable
fun App(navHostController: NavHostController,
navigationProvider: NavigationProvider) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background
    ) {
        AppNavigation(navController = navHostController, navigationProvider = navigationProvider)
    }
}