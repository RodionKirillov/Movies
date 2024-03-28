package com.example.movies;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.PATCH;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {

    @GET("movie?&field=rating.kp&search=7-10&sortField=votes.kp&sortType=-1&limit=30")
    @Headers("X-API-KEY:Y7PVEHS-E0JMSXX-P56XSH3-K25KCKY")
    Single<MovieResponse> loadMovies(@Query("page") int page);


    @GET("movie/{id}")
    @Headers("X-API-KEY:Y7PVEHS-E0JMSXX-P56XSH3-K25KCKY")
    Single<TrailerResponse> loadTrailers(@Path("id") int id);

    @GET("review?page=1&limit=10&selectFields=type&selectFields=review&selectFields=author&sortField=date&sortType=-1")
    @Headers("X-API-KEY:Y7PVEHS-E0JMSXX-P56XSH3-K25KCKY")
    Single<ReviewResponse> loadReviews(@Query("movieId") int movieId);
}
