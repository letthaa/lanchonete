package br.edu.ucsal.lanchonete;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView)this.findViewById(R.id.listProdutos);

        final ArrayList<String> produtos = new ArrayList<>();

        produtos.add("Suco Onda Tropical");
        produtos.add("Vitamina Planetaria");
        produtos.add("Hamburguer Exagerado");
        produtos.add("Pastel Super");
        produtos.add("Pão de Nuvem");
        produtos.add("Salada Surpresa");
        produtos.add("Açai com Banana");
        produtos.add("Pão de Nuvem");
        produtos.add("Salada Surpresa");
        produtos.add("Açai com Banana");

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(
            this,
            android.R.layout.simple_list_item_1,
            produtos
        );

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
               {
                    Intent detalheActivity = new Intent(MainActivity.this, DetalheActivity.class);
                detalheActivity.putExtra("textProdutos", produtos.get(i));
                   startActivity(detalheActivity);
               }
            }
        });

        }


}
