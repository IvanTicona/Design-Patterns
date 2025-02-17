package InterfacePractice.Exercise8;

public class Gerente implements Empleado, Bonificable {
    private String nombre;
    private double salario;
    private String cargo;

    public Gerente(String nombre, double salario, String cargo) {
        this.nombre = nombre;
        this.salario = salario;
        this.cargo = cargo;
    }

    public void calcularSalario() {
        System.out.println("El salario del gerente es de " + salario);
    }

    public void obtenerCargo() {
        System.out.println("El cargo del gerente es " + cargo);
    }

    public void calcularBono() {
        System.out.println("El bono del gerente es de " + salario * 0.1);
    }
}
