package uz.feature.movie.ui.screen

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import uz.core.common.UiEvents
import uz.movie.domain.use_case.GetMovieUseCase
import javax.inject.Inject

@HiltViewModel
class MovieSearchViewModel @Inject constructor(private val getMovieUseCase: GetMovieUseCase) :
    ViewModel() {


    private val _movieList = mutableStateOf(MovieSearchStateHolder())
    val movieList: State<MovieSearchStateHolder> get() = _movieList


    private val _query: MutableStateFlow<String> = MutableStateFlow("")
    val query: StateFlow<String> get() = _query


    fun setQuery(s:String){
        _query.value = s
    }
    private val API_KEY = "100bb96de8439f4f233ff84201cad1df"

    init {
        viewModelScope.launch {
            _query.debounce(1000).collectLatest {
                getMovieList(API_KEY, it)
            }
        }
    }


    fun getMovieList(apiKey: String, query: String) = viewModelScope.launch {
        getMovieUseCase(apiKey, query).onEach {
            when(it){
                is UiEvents.Loading ->{
                    _movieList.value = MovieSearchStateHolder(isLoading = true)
                }
                is UiEvents.Error ->{
                    _movieList.value = MovieSearchStateHolder(error = it.message.toString())
                }
                is UiEvents.Success ->{
                    _movieList.value = MovieSearchStateHolder(data = it.data)
                }
            }
        }.launchIn(viewModelScope)
    }

}