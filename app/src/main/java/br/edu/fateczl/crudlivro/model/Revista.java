package br.edu.fateczl.crudlivro.model;

import androidx.annotation.NonNull;

public class Revista extends Exemplar {
    /*
     *@author: Kelvin Santos Guimarães
     */
    private String ISSN;

    public Revista() {
        super();
    }

    public String getISSN() {
        return ISSN;
    }

    public void setISSN(String ISSN) {
        this.ISSN = ISSN;
    }

    @NonNull
    @Override
    public String toString() {
        return super.toString() + " - " + "ISSN: " + ISSN;
    }
}
