package InterfacePractice.Exercise8;

public class Administrativo implements Empleado {
    private String nombre;
    private double salario;
    private String cargo;

    public Administrativo(String nombre, double salario, String cargo) {
        this.nombre = nombre;
        this.salario = salario;
        this.cargo = cargo;
    }

    public void calcularSalario() {
        System.out.println("El salario del administrativo es de " + salario);
    }

    public void obtenerCargo() {
        System.out.println("El cargo del administrativo es " + cargo);
    }
}
