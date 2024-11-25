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


public class AlunoFragment extends Fragment {
    /*
     *@author: Kelvin Santos Guimarães
     */
    private View view;

    private EditText etIdAluno, etNomeAluno, etRAAluno, etEmailAluno;
    private TextView tvListarAluno;
    private Button btnBuscarAluno, btnListarAluno, btnInserirAluno, btnExcluirAluno, btnModificarAluno;

    public AlunoFragment() {
       super();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_aluno, container, false);

        etIdAluno = view.findViewById(R.id.etIdAluno);
        etNomeAluno = view.findViewById(R.id.etNomeAluno);
        etEmailAluno = view.findViewById(R.id.etEmailAluno);
        etRAAluno = view.findViewById(R.id.etRAAluno);
        btnBuscarAluno = view.findViewById(R.id.btnBuscarAluno);
        btnListarAluno = view.findViewById(R.id.btnListarAluno);
        btnInserirAluno = view.findViewById(R.id.btnInserirAluno);
        btnExcluirAluno = view.findViewById(R.id.btnExcluirAluno);
        btnModificarAluno = view.findViewById(R.id.btnModificarAluno);
        tvListarAluno = view.findViewById(R.id.tvListarAluno);
        tvListarAluno.setMovementMethod(new ScrollingMovementMethod());

        btnInserirAluno.setOnClickListener(op -> acaoInserir());
        btnModificarAluno.setOnClickListener(op -> acaoModificar());
        btnExcluirAluno.setOnClickListener(op -> acaoExcluir());
        btnBuscarAluno.setOnClickListener(op -> acaoBuscar());
        btnListarAluno.setOnClickListener(op -> acaoListar());
        
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