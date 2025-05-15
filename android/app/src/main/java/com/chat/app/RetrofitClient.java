package com.chat.app;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    // URL base del servidor en Render
    private static final String BASE_URL = "https://backend-app-chat.onrender.com/";

    private static Retrofit retrofit = null;

    // Método para obtener el cliente Retrofit
    public static Retrofit getClient() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL) // Configurar la URL base
                .addConverterFactory(GsonConverterFactory.create()) // Convertidor para JSON
                .build();
        }
        return retrofit;
    }
}