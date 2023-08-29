package br.com.senai.models;

import br.com.senai.enuns.Genero;
import br.com.senai.enuns.Estado;
import java.time.LocalDate;

public class Candidatos {
    public String nomeCompleto;
    public LocalDate dataNascimento;
    public String cpf;
    public String email;

    public Genero genero; //  obs. M | F

    public String naturalidade;
    public String nacionalidade;
    public String cep;
    public String logradouro;
    public String bairro;
    public String cidade;
    public Estado estado; // obs.
    public List<Escolaridade> escolaridades = new ArrayList<>();
}