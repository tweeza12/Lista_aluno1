package org.example;

public class pokemons {
    private int ID;
    private String nome;
    private int nota;

    public void pokemons() {
        System.out.println("Aluno:" + getNome() );
        System.out.println("ID" + getID());
        System.out.println("Nota " +getNota());
    }

    public pokemons(int ID, String nome, int nota) {
        this.ID = ID;
        this.nome = nome;
        this.nota = nota;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}





