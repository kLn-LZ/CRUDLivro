package br.edu.fateczl.crudlivro.model;

import androidx.annotation.NonNull;

public abstract class Exemplar {
    /*
     *@author: Kelvin Santos Guimarães
     */
    private int codigo;
    private String nome;
    private int qtdPaginas;

    public Exemplar() {
        super();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdPaginas() {
        return qtdPaginas;
    }

    public void setQtdPaginas(int qtdPaginas) {
        this.qtdPaginas = qtdPaginas;
    }

    @NonNull
    @Override
    public String toString() {
        return "Codigo: " + codigo + " - " + "Nome: " + nome + " - " + " Quantidade de páginas: " + qtdPaginas;
    }
}
