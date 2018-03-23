package br.edu.ucsal.lanchonete;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetalheActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe);
        String nome = getIntent().getStringExtra("textProdutos");
        TextView produto = findViewById(R.id.produto);
        produto.setText(nome);


    }
}
