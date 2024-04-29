package com.example.listview;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView lista;
    List<String> nombres;
    List<String> telefonos;
    int [] imagenes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        lista=findViewById(R.id.lista);

        nombres = new ArrayList<String>();
        nombres.add("Camilo");
        nombres.add("Jose");
        nombres.add("Teresa");
        nombres.add("Tatiana");
        nombres.add("Sebastian");

        telefonos = new ArrayList<String>();
        telefonos.add("1234");
        telefonos.add("5678");
        telefonos.add("9293");
        telefonos.add("8940");
        telefonos.add("5209");

        int [] imagenes = {
                R.drawable.logo,
                R.drawable.logo,
                R.drawable.logo,
                R.drawable.logo,
                R.drawable.logo
        };

        Adaptado adaptador = new Adaptado(this, R.layout.elemento, nombres, telefonos, imagenes);

        lista.setAdapter(adaptador);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int
                    position, long id) {
                Toast.makeText(MainActivity.this,"Le dio click a opcion de: " +
                        nombres.get(position),Toast.LENGTH_SHORT).show();
            }
        });
    }
}