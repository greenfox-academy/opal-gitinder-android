package com.greenfox.opal.gitinder;

import com.greenfox.opal.gitinder.model.LoginRequest;
import com.greenfox.opal.gitinder.model.response.LoginResponse;
import com.greenfox.opal.gitinder.model.response.ProfileListResponse;
import com.greenfox.opal.gitinder.model.response.Profile;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface ApiService {
    @POST("/login")
    Call<LoginResponse> login(@Body LoginRequest loginRequest);

    @GET("/available/{page}")
    Call<ProfileListResponse> getListOfTinders(@Header("X-GiTinder-token") String token, @Path("page") Integer page);

    @GET("/profile")
    Call<Profile> getProfileInfos(@Header("X-GiTinder-token") String token);
}
