package edu.dio.metodos;

public class SmartTV {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void diminuirCanal(){
        canal--;
    }

    public void aumentarCanal(){
        canal++;
    }

    public void aumentarVolume() {
        //volume para aumentar + 1
        volume++;
    }
    public void diminuirVolume(){
        //volume para diminuir - 1
        volume--;
    }

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }
}