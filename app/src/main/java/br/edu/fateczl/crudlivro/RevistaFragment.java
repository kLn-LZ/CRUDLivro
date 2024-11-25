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

public class RevistaFragment extends Fragment {
    /*
     *@author: Kelvin Santos Guimarães
     */
    private View view;

    private EditText etIdRevista, etNomeRevista, etQtdPaginasRevista, etISSNRevista;
    private TextView tvListarRevista;
    private Button btnBuscarRevista, btnListarRevista, btnInserirRevista, btnExcluirRevista, btnModificarRevista;


    public RevistaFragment() {
        super();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_revista, container, false);

        etIdRevista = view.findViewById(R.id.etIdRevista);
        etNomeRevista = view.findViewById(R.id.etNomeRevista);
        etQtdPaginasRevista = view.findViewById(R.id.etQtdPaginasRevista);
        etISSNRevista = view.findViewById(R.id.etISSNRevista);
        btnBuscarRevista = view.findViewById(R.id.btnBuscarRevista);
        btnListarRevista = view.findViewById(R.id.btnListarRevista);
        btnInserirRevista = view.findViewById(R.id.btnInserirRevista);
        btnExcluirRevista = view.findViewById(R.id.btnExcluirRevista);
        btnModificarRevista = view.findViewById(R.id.btnModificarRevista);
        tvListarRevista = view.findViewById(R.id.tvListarRevista);
        tvListarRevista.setMovementMethod(new ScrollingMovementMethod());

        btnInserirRevista.setOnClickListener(op -> acaoInserir());
        btnModificarRevista.setOnClickListener(op -> acaoModificar());
        btnExcluirRevista.setOnClickListener(op -> acaoExcluir());
        btnBuscarRevista.setOnClickListener(op -> acaoBuscar());
        btnListarRevista.setOnClickListener(op -> acaoListar());


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