package com.playxcodes.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Personagens> listaPersonagem;
    RecyclerView recyclerViewPersonagens;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaPersonagem = new ArrayList<>();
        recyclerViewPersonagens = (RecyclerView) findViewById(R.id.RecyclerId);
        recyclerViewPersonagens.setLayoutManager(new LinearLayoutManager(this));
        
        iListaPersonagens();

        AdaptadorPersonagens adapter = new AdaptadorPersonagens(listaPersonagem);
        recyclerViewPersonagens.setAdapter(adapter);


    }

    private void iListaPersonagens() {

        listaPersonagem.add(new Personagens("Facebook"," Teste 01",R.drawable.facebook));
        listaPersonagem.add(new Personagens("Instagram"," Teste 02",R.drawable.instagram));
        listaPersonagem.add(new Personagens("Linkedin"," Teste 03",R.drawable.linkedin));
        listaPersonagem.add(new Personagens("twitter"," Teste 04",R.drawable.twitter));
        listaPersonagem.add(new Personagens("Facebook"," Teste 01",R.drawable.facebook));
        listaPersonagem.add(new Personagens("Instagram"," Teste 02",R.drawable.instagram));
        listaPersonagem.add(new Personagens("Linkedin"," Teste 03",R.drawable.linkedin));
        listaPersonagem.add(new Personagens("twitter"," Teste 04",R.drawable.twitter));
        listaPersonagem.add(new Personagens("Facebook"," Teste 01",R.drawable.facebook));
        listaPersonagem.add(new Personagens("Instagram"," Teste 02",R.drawable.instagram));
        listaPersonagem.add(new Personagens("Linkedin"," Teste 03",R.drawable.linkedin));
        listaPersonagem.add(new Personagens("twitter"," Teste 04",R.drawable.twitter));
        listaPersonagem.add(new Personagens("Facebook"," Teste 01",R.drawable.facebook));
        listaPersonagem.add(new Personagens("Instagram"," Teste 02",R.drawable.instagram));
        listaPersonagem.add(new Personagens("Linkedin"," Teste 03",R.drawable.linkedin));
        listaPersonagem.add(new Personagens("twitter"," Teste 04",R.drawable.twitter));
    }
}
