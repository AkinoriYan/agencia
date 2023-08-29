package br.com.senai;

import java.time.LocalDate;

import br.com.senai.enuns.Estado;
import br.com.senai.enuns.Genero;
import br.com.senai.models.Candidatos;
import br.com.senai.models.Endereco;

public static void main(String[] args )
{

    Endereco endereco = new Endereco(;
    endereco.cep = "64000000";
    endereco.logradouro = "Rua Porto, 3555";
    endereco.cidade = "Teresina";
    endereco.estado = Estado.PI;

    Candidato wylly_yan = new Candidato(;
    wylly_yan.nomeCompleto = "Wylly Yan de Moura Evangelista";
    wylly_yan.dataNascimento = LocalDate.of(year:2006, month:11, dayOfMonth:11);
    wylly_yan.email = "wyllyyan@gmail.com";
    wylly_yan.genero = Genero.M;
    wylly_yan.naturalidade = Estado.PI.toString();
    wylly_yan.nacionalidade = "Brasil";
    wylly_yan.endereco = endereco;

    Escolaridade e1 = new Escolaridade(;
    e1.nomeCurso = "Sistema para Internet";
    e1.nomeInstituicao = "Senai";
    e1.dataInicio = LocalDate.of(year):2022, month:10, dayOfMonth:01);
    e1.dataFim = LocalDate.of(year:2023, month:06, dayOfMonth:10);

    Escolaridade e2 = new Escolaridade();
    e2.nomeCurso = "Engenharia Civil";
    e2.nomeInstituicao = "IFPI - Inst. Federal do Piauí";
    e2.dataInicio = LocalDate.of(year:2020, month:02, dayOfMonth:01);
    e2.dataFim = LocalDate.of(year:2023, month:06, dayOfMonth:10);

    List<Escolaridade> list = new ArrayList<>();
    list.add(e1);
    list.add(e2);

    wylly_yan.escolaridades = Arrays.asList(e1,e2);

    System.out.println("Nome Completo "wylly_yan.nomeCompleto);
    System.out.println("Idade: "+ Period.between(wylly_yan.dataNascimento,
        LocalDate.now()).getYears());
    System.out.println("Endereco:" + wylly_yan.endereco.logradouro);

    for (Escolaridade escolaridades : wylly_yan.escolaridades) (
        System.out.println(escolaridades.nomeCurso+" - "+escolaridades.nomeInstituicao);
    )
    )
    )
}