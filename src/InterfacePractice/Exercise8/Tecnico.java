package InterfacePractice.Exercise8;

public class Tecnico implements Empleado {
    private String nombre;
    private double salario;
    private String cargo;

    public Tecnico(String nombre, double salario, String cargo) {
        this.nombre = nombre;
        this.salario = salario;
        this.cargo = cargo;
    }

    public void calcularSalario() {
        System.out.println("El salario del tecnico es de " + salario);
    }

    public void obtenerCargo() {
        System.out.println("El cargo del tecnico es " + cargo);
    }
}
