package com.example.repasoproductos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

/*public class DetalleItem extends AppCompatActivity implements View.OnClickListener {
    TextView detallenombre;
    TextView detalleprecio;
    TextView detallecodigo;
    TextView detalledescripcion;
    ImageView detalleimagen;
    ImageButton btBack;
    ImageButton btForward;

    int[] galeria;
    int i =0;
    int totalImg=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_item);

        detallenombre = (TextView) findViewById(R.id.tvDetalleNombre);
        detalleprecio = (TextView) findViewById(R.id.tvDetallePrecio);
        detallecodigo = (TextView) findViewById(R.id.tvDetalleCodigo);
        detalledescripcion = (TextView) findViewById(R.id.tvDetalleDescripcion);
        detalleimagen = (ImageView) findViewById(R.id.ivDetalleImagen);
        btBack = (ImageButton) findViewById(R.id.btBack);
        btForward = (ImageButton) findViewById(R.id.btForward);


        Bundle bundle = getIntent().getExtras();
        Producto obj = (Producto) bundle.getSerializable("producto");

        detallenombre.setText(obj.getNombre());
        detalleprecio.setText(obj.getPrecio()+"€");
        detallecodigo.setText(obj.getCodigoproducto()+"");
        detalledescripcion.setText(obj.getDescripcion());
        detalleimagen.setImageResource(obj.getImagen());
        galeria=obj.getGaleria();
        totalImg=galeria.length;

        btBack.setOnClickListener(this);
        btForward.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id=v.getId();
        switch (id){
            case R.id.btForward:
                i++;
                if (i==totalImg)
                    i=0;
                break;

            case R.id.btBack:
                i--;
                if(i==-1)
                    i=totalImg-1;
                break;
        }

        detalleimagen.setImageResource(galeria[i]);
    }
}*/