package br.edu.fateczl.crudlivro;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    /*
     *@author: Kelvin Santos Guimarães
     */

    private Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Bundle bundle = getIntent().getExtras();

        if(bundle != null) {
            carregaFragment(bundle);
        } else {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment, new InicioFragment());
            fragmentTransaction.commit();
        }
    }

    private void carregaFragment(Bundle bundle) {
        String tipo = bundle.getString("tipo");

        if(tipo.equals("aluno")) {
            fragment = new AlunoFragment();
        } else  if(tipo.equals("livro")) {
            fragment = new LivroFragment();
        } else  if(tipo.equals("revista")) {
            fragment = new RevistaFragment();
        } else {
            fragment = new AluguelFragment();
        }
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment, fragment);
        fragmentTransaction.commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        Bundle bundle = new Bundle();
        Intent intent = new Intent(this, MainActivity.class);

        if(id == R.id.item_aluno) {
            bundle.putString("tipo", "aluno");
            intent.putExtras(bundle);
            this.startActivity(intent);
            this.finish();
            return true;
        } else if (id == R.id.item_livro) {
            bundle.putString("tipo", "livro");
            intent.putExtras(bundle);
            this.startActivity(intent);
            this.finish();
            return true;
        } else if (id == R.id.item_revista) {
            bundle.putString("tipo", "revista");
            intent.putExtras(bundle);
            this.startActivity(intent);
            this.finish();
            return true;
        } else {
            bundle.putString("tipo", "aluguel");
            intent.putExtras(bundle);
            this.startActivity(intent);
            this.finish();
            return true;
        }
    }
}