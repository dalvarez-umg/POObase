public class MotorElectrico {
    private int potencia;

    public MotorElectrico(int potencia) {
        this.potencia = potencia;
    }

    public void encender() {
        System.out.println("Encendiendo el motor eléctrico.");
    }

    public void apagar() {
        System.out.println("Apagando el motor eléctrico.");
    }
}