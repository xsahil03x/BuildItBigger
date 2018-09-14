package com.udacity.builditbigger.builditbigger.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.magarex.jokeprovider.JokeProvider;

import javax.inject.Named;

/**
 * An endpoint class we are exposing
 */
@Api(
        name = "jokeApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.gradle.udacity.com",
                ownerName = "backend.builditbigger.gradle.udacity.com",
                packagePath = ""
        )
)
public class MyEndpoint {

    @ApiMethod(name = "joke", httpMethod = ApiMethod.HttpMethod.GET)
    public Joke getJoke() {
        Joke joke = new Joke();
        joke.setJoke(JokeProvider.getRandomJoke());
        return joke;
    }

}
