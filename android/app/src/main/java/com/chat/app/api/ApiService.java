package com.chat.app;

import retrofit2.Call;
import retrofit2.http.GET;
import java.util.List;
import java.util.Map;

public interface ApiService {
    // Endpoint para obtener la lista de alumnos
    @GET("/api/alumnos") // La ruta debe coincidir con la del servidor
    Call<List<Map<String, Object>>> getAlumnos();
}