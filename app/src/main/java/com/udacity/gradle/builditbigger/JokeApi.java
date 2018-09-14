package com.udacity.gradle.builditbigger;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JokeApi {
    @GET("joke")
    Call<String> getJoke();
}
