package br.edu.fateczl.crudlivro.model;

public class Aluno {
    /*
     *@author: Kelvin Santos Guimarães
     */
    private int RA;
    private String nome;

    public Aluno() {
        super();
    }

    public int getRA() {
        return RA;
    }

    public void setRA(int RA) {
        this.RA = RA;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String email;

}
