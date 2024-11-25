package br.edu.fateczl.crudlivro;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LivroFragment extends Fragment {

    /*
     *@author: Kelvin Santos Guimarães
     */

    private View view;

    private EditText etIdLivro, etNomeLivro, etQtdPaginasLivro, etISBNLivro, etEdicaoLivro;
    private TextView tvListarLivro;
    private Button btnBuscarLivro, btnListarLivro, btnInserirLivro, btnExcluirLivro, btnModificarLivro;
    
    public LivroFragment() {
        super();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_livro, container, false);

        etIdLivro = view.findViewById(R.id.etIdLivro);
        etNomeLivro = view.findViewById(R.id.etNomeLivro);
        etQtdPaginasLivro = view.findViewById(R.id.etQtdPaginasLivro);
        etISBNLivro = view.findViewById(R.id.etISBNLivro);
        etEdicaoLivro = view.findViewById(R.id.etEdicaoLivro);
        btnBuscarLivro = view.findViewById(R.id.btnBuscarLivro);
        btnListarLivro = view.findViewById(R.id.btnListarLivro);
        btnInserirLivro = view.findViewById(R.id.btnInserirLivro);
        btnExcluirLivro = view.findViewById(R.id.btnExcluirLivro);
        btnModificarLivro = view.findViewById(R.id.btnModificarLivro);
        tvListarLivro = view.findViewById(R.id.tvListarLivro);
        tvListarLivro.setMovementMethod(new ScrollingMovementMethod());

        btnInserirLivro.setOnClickListener(op -> acaoInserir());
        btnModificarLivro.setOnClickListener(op -> acaoModificar());
        btnExcluirLivro.setOnClickListener(op -> acaoExcluir());
        btnBuscarLivro.setOnClickListener(op -> acaoBuscar());
        btnListarLivro.setOnClickListener(op -> acaoListar());
        
        
        return view;
    }

    private void acaoInserir() {

    }

    private void acaoModificar() {

    }

    private void acaoExcluir() {

    }

    private void acaoBuscar() {

    }

    private void acaoListar() {

    }
}