package br.edu.fateczl.crudlivro;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class AluguelFragment extends Fragment {
    /*
     *@author: Kelvin Santos Guimarães
     */
    private View view;

    private EditText etIdAluguel, etDataRetiradaAluguel, etDataDevolucaoAluguel;
    private TextView tvListarAluguel;
    private Button btnBuscarAluguel, btnListarAluguel, btnInserirAluguel, btnExcluirAluguel, btnModificarAluguel;
    private Spinner spAlunoAluguel, spExemplarAluguel;
    
    
    public AluguelFragment() {
        super();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_aluguel, container, false);

        etIdAluguel = view.findViewById(R.id.etIdAluguel);
        etDataRetiradaAluguel = view.findViewById(R.id.etDataRetiradaAluguel);
        etDataDevolucaoAluguel = view.findViewById(R.id.etDataDevolucaoAluguel);
        spAlunoAluguel = view.findViewById(R.id.spAlunoAluguel);
        spExemplarAluguel = view.findViewById(R.id.spExemplarAluguel);
        btnBuscarAluguel = view.findViewById(R.id.btnBuscarAluguel);
        btnListarAluguel = view.findViewById(R.id.btnListarAluguel);
        btnInserirAluguel = view.findViewById(R.id.btnInserirAluguel);
        btnExcluirAluguel = view.findViewById(R.id.btnExcluirAluguel);
        btnModificarAluguel = view.findViewById(R.id.btnModificarAluguel);
        tvListarAluguel = view.findViewById(R.id.tvListarAluguel);
        tvListarAluguel.setMovementMethod(new ScrollingMovementMethod());

        btnInserirAluguel.setOnClickListener(op -> acaoInserir());
        btnModificarAluguel.setOnClickListener(op -> acaoModificar());
        btnExcluirAluguel.setOnClickListener(op -> acaoExcluir());
        btnBuscarAluguel.setOnClickListener(op -> acaoBuscar());
        btnListarAluguel.setOnClickListener(op -> acaoListar());
    
    
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