package br.edu.fateczl.crudlivro.model;

import androidx.annotation.NonNull;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Aluguel {
    /*
     *@author: Kelvin Santos Guimarães
     */
    private Aluno aluno;
    private Exemplar exemplar;
    private LocalDate dataRetirada;
    private LocalDate dataDevolucao;

    public Aluguel() {
        super();
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Exemplar getExemplar() {
        return exemplar;
    }

    public void setExemplar(Exemplar exemplar) {
        this.exemplar = exemplar;
    }

    public LocalDate getDataRetirada() {
        return dataRetirada;
    }

    public void setDataRetirada(LocalDate dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    @NonNull
    @Override
    public String toString() {
        SimpleDateFormat dt = new SimpleDateFormat("dd-MM-yyyy");

        return "Aluno: " + aluno.getNome() + " - " + "Exemplar: " + exemplar.getNome() + " - " +
                "Data de Retirada: " + dt.format(dataRetirada) + " - " + "Data de Devolução: " + dt.format(dataDevolucao);
    }
}
