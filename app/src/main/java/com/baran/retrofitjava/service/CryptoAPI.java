package com.baran.retrofitjava.service;

import com.baran.retrofitjava.model.CryptoModel;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;
////https://raw.githubusercontent.com/atilsamancioglu/K21-JSONDataSet/master/crypto.json
public interface CryptoAPI {

    @GET("atilsamancioglu/K21-JSONDataSet/master/crypto.json")
    Observable<List<CryptoModel>> getData();


   // Call<List<CryptoModel>> getData();
}
