package com.example.repasoproductos;

import org.json.JSONObject;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Service {

    public static final String url= "http://10.0.2.2:80/JSONARRAYRETROFIT/";
    @GET("Productos.json")
    Call<List<Producto>> listaCatalogo();
}
