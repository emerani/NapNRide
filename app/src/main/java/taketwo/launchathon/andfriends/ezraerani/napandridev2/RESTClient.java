package taketwo.launchathon.andfriends.ezraerani.napandridev2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/*
NOTE:
URLs must be properly encoded to be valid and are limited to 8192 characters for all web services.
Be aware of this limit when constructing the URL. (EC)
 */

/**
 * Created by ezraerani on 8/12/16.
 * Edited by elijahchen on 8/13/16.
 */

public class RESTClient {

    public APIClient apiService;

    RESTClient() {
        Gson gson = new GsonBuilder().create();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://maps.googleapis.com/maps/api/directions/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        apiService = retrofit.create(APIClient.class);

    }

    public APIClient getApiClient() {
        return apiService;
    }
}
