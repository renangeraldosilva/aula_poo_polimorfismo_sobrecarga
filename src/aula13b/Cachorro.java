package aula13b;

import java.util.Objects;

public class Cachorro extends Lobo {
    @Override
    public void emitirSom() {
        System.out.println("Au!Au!Au!");
    }

    public void reagir(String frase) {
        if(Objects.equals(frase, "Toma comida") || Objects.equals(frase, "Olá")) {
            System.out.println("Abanar, Pular e Saltitar");
        } else {
            System.out.println("Rosnar e Mostrar os Dentes");
        }
    }
    public void reagir(int hora, int min) {
        if(hora < 12) {
            System.out.println("Abanar o Rabo");
        } else if (hora >= 18) {
            System.out.println("Ignorar e Dormir");
        } else {
            System.out.println("Abanar, Correr e Latir");
        }
    }
    public void reagir(boolean dono) {
        if(dono) {
        System.out.println("Pedir Comida");
        } else {
            System.out.println("Rosnar e Latir (Nervoso)");
        }
    }
    public void reagir(int idade, float peso) {
        if(idade < 5)
            if(peso < 10) {
                System.out.println("Correr pois é novo é leve");
        } else {
                System.out.println("Latir pois é novo e pesado");
            } else {
                if ( peso < 10) {
                    System.out.println("Rosnar pois é velho e leve");
                } else {
                    System.out.println("Ignorar é velho e pesado");
                }
        }
    }
}
