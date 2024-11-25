package br.edu.fateczl.crudlivro.model;

import androidx.annotation.NonNull;

public class Livro extends Exemplar{
    /*
     *@author: Kelvin Santos Guimarães
     */
    private String ISBN;
    private int edicao;

    public Livro () {
        super();
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    @NonNull
    @Override
    public String toString() {
        return super.toString() + " - " + "ISBN: " + ISBN + " - " + " Edição: " + edicao;
    }
}
