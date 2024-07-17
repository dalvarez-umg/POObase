public class Carro {
    private String marca;
    private String modelo;
    private String color;

    public Carro(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public void encender() {
        System.out.println("Encendiendo el carro.");
    }

    public void acelerar() {
        System.out.println("Acelerando el carro.");
    }

    public void frenar() {
        System.out.println("Frenando el carro.");
    }
}