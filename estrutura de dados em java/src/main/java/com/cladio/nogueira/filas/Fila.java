package com.cladio.nogueira.filas;

public class Fila {

    private No refNoEntradaFila;

    public Fila() {
        this.refNoEntradaFila = null;

    }

    public void enqueue(No novoNo) {
        novoNo.setRefno(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    public No dequeue() {
        if (!this.isEmpty()) {
            No primeiroNo = refNoEntradaFila;
            No noAuxiliar = refNoEntradaFila;
            while (true) {
                if (primeiroNo.getRefno() != null) {
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefno();

                } else {
                    noAuxiliar.setRefno(null);
                    break;
                }
            }
            return primeiroNo;
        }
        return null;
    }

    public No first() {
        if (!this.isEmpty()) {
            No primeiroNo = refNoEntradaFila;
            while (true) {
                if (primeiroNo.getRefno() != null) {
                    primeiroNo = primeiroNo.getRefno();

                } else {
                    break;
                }
            }
        }
        return null;
    }


    public  boolean isEmpty(){
        return refNoEntradaFila == null? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        No noAuxiliar = refNoEntradaFila;

        if(refNoEntradaFila != null){
            while(true){
                stringRetorno += "[No{objeto="+ noAuxiliar.getObject() +"}]--->";
                if(noAuxiliar.getRefno() != null){
                    noAuxiliar = noAuxiliar.getRefno();
                }else{
                    stringRetorno += "null";
                    break;
                }
            }
        }else{
            stringRetorno = "null";
        }

        return stringRetorno;
    }
}
