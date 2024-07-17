public class EjemploPOO {
    public static void main(String[] args) {
        Carro miCarro = new Carro("Toyota", "Corolla", "Azul");
        miCarro.encender();
        miCarro.acelerar();
        miCarro.frenar();

        CarroDeportivo miCarroDeportivo = new CarroDeportivo("Ferrari", "F8 Tributo", "Rojo", 600);
        miCarroDeportivo.encender();
        miCarroDeportivo.acelerar();
        miCarroDeportivo.acelerarRapido();
        miCarroDeportivo.frenar();

        CarroElectrico tesla = new CarroElectrico("Tesla","ABC","Gris",150);
        tesla.encender();
        tesla.acelerar();
        tesla.apagar();
    }
}
