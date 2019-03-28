package ProjetoCarro;

public class Main {
    public static void main (String args []){
        Carro meuCarro = new Carro();
         meuCarro.cor = "Prata";
         meuCarro.ano = 2011;
         meuCarro.marca = "3543213";
         meuCarro.chassi = "Chevrolet";
         meuCarro.modelo = "Celta";
         meuCarro.numMachas = 5;
         meuCarro.numPorta = 5;
         meuCarro.velMax = 250;
         meuCarro.volCombus = 10;
         meuCarro.marchaAtual = 2;
         meuCarro.velAtual = 20;

         System.out.println(meuCarro.velAtual);
         meuCarro.acelerar(velecidadeDesejada: 30);
         System.ouit.println(meuCarro.velAtual);

        System.out.println(meuCarro.velAtual);
        meuCarro.freia(velecidadeDesejada: 30);
        System.ouit.println(meuCarro.velAtual);


    }
}
