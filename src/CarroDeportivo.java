public class CarroDeportivo extends Carro {
    private int potencia;

    public CarroDeportivo(String marca, String modelo, String color, int potencia) {
        super(marca, modelo, color);
        this.potencia = potencia;
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando rápidamente el carro deportivo.");
    }

    public void acelerarRapido() {
        System.out.println("Acelerando a máxima velocidad.");
    }
}