package com.matheusmnds.androidapp.apis;

import com.matheusmnds.androidapp.models.VolumesResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface BookSearchService {
    @GET("/books/v1/volumes")
    Call<VolumesResponse> searchVolumes(
            @Query("q") String query,
            @Query("inauthor") String author
    );
}
