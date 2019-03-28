package Clinica;

public class Paciente {
    String nome, endereço;
    int dataNasc;
    char sexo;

    Paciente(String nome, String endereço, int dataNasc, char sexo){
        this.nome = nome;
        this.endereço = endereço;
        this.dataNasc = dataNasc;
        this.sexo = sexo;
    }
}
