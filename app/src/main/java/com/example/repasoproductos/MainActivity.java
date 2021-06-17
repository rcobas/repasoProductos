package com.example.repasoproductos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    ArrayList<Producto> lista;
    Adaptador adaptador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView) findViewById(R.id.lv);
        lista = new ArrayList<Producto>();
        lv.setAdapter(adaptador);

        //RETROFIT
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Service.url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        Service servicio = retrofit.create(Service.class);
        Call<List<Producto>> requesCatago = servicio.listaCatalogo();
        requesCatago.enqueue(new Callback<List<Producto>>() {
            @Override
            public void onResponse(Call<List<Producto>> call, Response<List<Producto>> response) {

                if (!response.isSuccessful()) {
                    Log.e("ERROR", "No hay respuesta");
                } else {
                    Log.e("llega", "hola");
                    List<Producto> listado = response.body();
                    Log.e("llega", "después");
                    for (int i=0; i< listado.size(); i++){
                        lista.add(listado.get(i));
                    }
                    /*for (Iterator<Producto> iterator = catalogo.catalogoProductos.iterator(); iterator.hasNext(); ) {

                        Producto producto = iterator.next();

                        lista.add(producto);

                    }*/
                }
            }


            @Override
            public void onFailure(Call<List<Producto>> call, Throwable t) {
                Log.e("ERRORRRRR", t.getMessage());

            }
        });


    }
}


        /*requesCatago.enqueue(new Callback<Catalogo>() {
            @Override
            public void onResponse(Call<Catalogo> call, Response<Catalogo> response) {
                if (!response.isSuccessful()) {
                    Log.e("ERROR", "No hay respuesta");
                } else {
                    Log.e("llega", "hola");
                    Catalogo catalogo = new Catalogo();
                    catalogo=response.body();
                    Log.e("llega", "después");
                    /*for (Iterator<Producto> iterator = catalogo.catalogoProductos.iterator(); iterator.hasNext(); ) {

                        Producto producto = iterator.next();

                        lista.add(producto);

                    }*/





                /*lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                        Producto producto = (Producto) parent.getItemAtPosition(i);
                        Intent intent = new Intent(getApplicationContext(), DetalleItem.class);
                        intent.putExtra("producto", producto);
                        startActivity(intent);
                    }
                });

*/


        /*int[] galeriaTV = {R.drawable.galeria_tv1, R.drawable.galeria_tv2, R.drawable.galeria_tv3};
        int[] galeriaMinicadena = {R.drawable.galeria_microcadena1, R.drawable.galeria_microcadena2, R.drawable.galeria_microcadena3};
        int[] galeriaPlancha = {R.drawable.galeria_plancha1, R.drawable.galeria_plancha2, R.drawable.galeria_plancha3};
        int[] galeriaPortatil = {R.drawable.galeria_portatil1, R.drawable.galeria_portatil2, R.drawable.galeria_portatil3};

        lista.add(new Producto(1, "Televisor LG F21-40", R.drawable.televisor_lg, 399, "Televisor imagen 4K de 40 pulgadas 400Mhz", galeriaTV));
        lista.add(new Producto(2, "Microcadena Sony HT-100sd", R.drawable.minicadena_sony, 199, "Cadena musical conexión USB y iPod 40W", galeriaMinicadena));
        lista.add(new Producto(3, "Plancha Rowenta Soft FX-1", R.drawable.plancha_rowenta, 90, "Plancha profesional 7 funciones de planchado 1800W", galeriaPlancha));
        lista.add(new Producto(4, "Ordenador Portatil Acer R235", R.drawable.portatil_acer, 589.90, "Ordenador Portatil Acer I5, 8GB, SSD240GB", galeriaPortatil));*/


