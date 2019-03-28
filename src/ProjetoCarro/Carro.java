package ProjetoCarro;

public class Carro {
    String modelo;
    String cor;
    int ano;
    String marca;
    String chassi;
    Propietario propietario;
    double velMax;
    double velAtual;
    int numPorta;
    boolean temTeSol;
    int numMachas;
    boolean cambAltom;
    double volCombus;
    int marchaAtual;

    void acelerar() {
        velAtual = velAtual + 1;
    }
    void freia () {
        velAtual = 0;
    }
    void trocarMacha (int marcha) {
        marchaAtual = marcha;
    }
    void reduzirMacha () {
        marchaAtual = marchaAtual - 1;
    }
}
