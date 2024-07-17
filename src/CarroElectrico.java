public class CarroElectrico extends Carro {
    private MotorElectrico motor;

    public CarroElectrico(String marca, String modelo, String color, int potencia) {
        super(marca, modelo, color); // Llamada al constructor de la clase padre (Carro)
        this.motor = new MotorElectrico(potencia);
    }

    public void encender() {
        super.encender();
        motor.encender();
    }

    public void apagar() {
        motor.apagar();
    }
}