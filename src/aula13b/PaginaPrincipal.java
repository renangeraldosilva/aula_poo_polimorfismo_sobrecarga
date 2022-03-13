package aula13b;
public class PaginaPrincipal {
    public static void main(String[] args) {
        Mamifero mamifero = new Mamifero();
        Lobo lobo = new Lobo();
        Cachorro cachorro = new Cachorro();

        cachorro.reagir(false);
        cachorro.reagir(6,19f);
        cachorro.reagir(4,9f);
        cachorro.reagir(6,8f);
        cachorro.reagir(4,18f);
        cachorro.reagir(18,50);
        cachorro.reagir("Toma comida");
    }
}
