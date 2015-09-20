package com.discover.discoverapp.net;

import com.discover.discoverapp.item.Scene;

import retrofit.Callback;

import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;

/**
 * Created by Kevin on 19/09/2015.
 */
public interface Urthecast {
    @GET("/scenes?api_key=9F5B3686A36749039F83&sort=-sensor_platform,cloud_coverage&api_secret=C447D59F1E5648CFACC7D4A5E9A923DF")
    void scenes(
            @Query(value = "geometry_intersects", encodeValue = false) String geometryIntersect,
            Callback<Scene> cb
    );
}
