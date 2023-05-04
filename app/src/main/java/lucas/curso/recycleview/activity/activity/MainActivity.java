package lucas.curso.recycleview.activity.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import lucas.curso.recycleview.R;
import lucas.curso.recycleview.activity.RecyclerItemClickListener;
import lucas.curso.recycleview.activity.adapter.AdapterFilmes;
import lucas.curso.recycleview.activity.model.Filme;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Filme> listaFilmes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycleView);

        //Listagem de filmes
        this.criarFilmes();

        //configurar adapter
        AdapterFilmes adapter = new AdapterFilmes(listaFilmes);


        //configurar Recyclerview
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration( new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setAdapter(adapter);

        //evento de click
        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(getApplicationContext(),
                recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Filme filme = listaFilmes.get(position);
                Toast.makeText(getApplicationContext() ,filme.getTituloFilme(), Toast.LENGTH_SHORT)
                        .show();
            }

            @Override
            public void onLongItemClick(View view, int position) {
                Filme filme = listaFilmes.get(position);
                Toast.makeText(getApplicationContext() ,"click longo em " + filme.getTituloFilme()
                                , Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        }));

    }

    public void criarFilmes(){

        Filme filme = new Filme("Pantera Negra", "Ação", "2018");
        this.listaFilmes.add(filme);
        filme = new Filme("Vingadores: Ultimato", "Ação/Ficção", "2019");
        this.listaFilmes.add(filme);
        filme = new Filme("Nós", "Drama", "2019");
        this.listaFilmes.add(filme);
        filme = new Filme("Toy Story 4", "Animação", "2019");
        this.listaFilmes.add(filme);
        filme = new Filme("Lady Bird: A Hora de Voar", "Drama", "2017");
        this.listaFilmes.add(filme);
        filme = new Filme("Missão Impossível Efeito Fallout", "Ação", "2018");
        this.listaFilmes.add(filme);
        filme = new Filme("Cidadão Kane", "Documentário", "1941");
        this.listaFilmes.add(filme);
        filme = new Filme("O Mágico de Oz", "Fantásia", "1939");
        this.listaFilmes.add(filme);
        filme = new Filme("O Irlandês", "Ação", "2019");
        this.listaFilmes.add(filme);
        filme = new Filme("Infiltrado na Klan", "Drama", "2018");
        this.listaFilmes.add(filme);
        filme = new Filme("Corra!", "Drama", "2017");
        this.listaFilmes.add(filme);
        filme = new Filme("Vingadores", "Ação/Ficção", "2012");
        this.listaFilmes.add(filme);
        filme = new Filme("Nós 2", "Drama", "2023");
        this.listaFilmes.add(filme);
        filme = new Filme("Toy Story 3", "Animação", "2013");
        this.listaFilmes.add(filme);
        filme = new Filme("A Hora de Voar", "Drama", "2017");
        this.listaFilmes.add(filme);
        filme = new Filme("Missão possível ", "Ação", "2013");
        this.listaFilmes.add(filme);
        filme = new Filme("Cidadão Kaneludo", "Documentário", "1956");
        this.listaFilmes.add(filme);
        filme = new Filme("O Mágico de OzManos", "Fantásia", "2020");
        this.listaFilmes.add(filme);
        filme = new Filme("O Irlandês voador", "Ação", "2019");
        this.listaFilmes.add(filme);
        filme = new Filme("Infiltrado na Kkk", "Drama", "2018");
        this.listaFilmes.add(filme);
        filme = new Filme("Corra! perigo", "Drama", "2017");
        this.listaFilmes.add(filme);
    }
}