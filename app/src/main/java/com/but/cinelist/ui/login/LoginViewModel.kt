package com.but.cinelist.ui.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.but.cinelist.domain.TVRepository
import com.but.cinelist.domain.AnimesRepository
import com.but.cinelist.model.Animes
import com.but.cinelist.model.TVs
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.Dispatchers.Main
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.launch
import retrofit2.Response
import timber.log.Timber
import java.sql.Time

class LoginViewModel: ViewModel() {
    //en privée le le livedata est mutable
    private var _tvLiveData : MutableLiveData<Response<TVs>?> = MutableLiveData<Response<TVs>?>()
    //on expose le liveData en non mutable
    val cardsLiveData : LiveData<Response<TVs>?> = _tvLiveData

    fun fetchCards() {
        //lance une coroutine pour effectuer un traitement
        viewModelScope.launch {
            // appel de l'api
            TVRepository.getTVs()
                //si erreur
                .catch {
                    Timber.e(it)
                }
                .collect {
                    //on post le resultat aux observer
                    _tvLiveData.postValue(it)
                }
        }
    }

    fun getCards(): LiveData<Response<TVs>>{
        var livedata = MutableLiveData<Response<TVs>>()

        viewModelScope.launch {
            val data = TVRepository.getTVs()
            data.catch { e ->
                Timber.e(e)
            }.collect {
                livedata.postValue(it)
            }

        }

        return livedata
    }

}