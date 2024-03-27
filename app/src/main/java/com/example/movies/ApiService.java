package com.example.movies;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface ApiService {

    @GET("movie?&field=rating.kp&search=7-10&sortField=votes.kp&sortType=-1&limit=30")
    @Headers("X-API-KEY:Y7PVEHS-E0JMSXX-P56XSH3-K25KCKY")
    Single<MovieResponse> loadMovies(@Query("page") int page);
}
