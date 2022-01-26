package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroProgram {
    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);

        Livro livro1 = new Livro("neuromancer", "20");

            }
}
class livro {
    private String nome;
    private Integer numPag;

    public livro(String nome, String numPag) {
        this.nome = nome;
        this.numPag = Integer.valueOf(numPag);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPag() {
        return numPag;
    }

    public void setNumPag(Integer numPag) {
        this.numPag = numPag;
    }

    @Override
    public String toString() {
        return "livro{" +
                "nome='" + nome + '\'' +
                ", numPag=" + numPag +
                '}';
    }
}