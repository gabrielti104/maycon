
package com.mycompany.lojacarros;

public class Carro {
    
    private int velocidade;
    private String modelo;
    private String marca;         

    public Carro() {
    }

    public Carro(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int acelerar(){
        this.velocidade +=10;
        return velocidade;
    }
    public int frear (){
        this.velocidade -=10;
        return velocidade;
    }
}
           
        
    



