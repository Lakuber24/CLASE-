import java.util.ArrayList;

public class EmisionVehiculos {

    public static void main(String[] args) {

        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        vehiculos.add(new Vehiculo("Camiones Livianos", 400000, 30, 40, 30));
        vehiculos.add(new Vehiculo("Camiones Medianos", 280000, 25, 40, 35));
        vehiculos.add(new Vehiculo("Camiones Pesados", 380000, 10, 40, 50));
        vehiculos.add(new Vehiculo("Tractocamiones", 1150000, 5, 90, 5));
        vehiculos.add(new Vehiculo("Volquetas", 936000, 10, 40, 50));

        for (Vehiculo v : vehiculos) {
            v.mostrarEmisiones();
        }
    }
}
