package InterfacePractice.Exercise8;

import java.util.LinkedList;
import java.util.List;

public class Empresa {
    private Gerente gerente;
    private List<Empleado> empleados = new LinkedList<>();

    public Empresa(Gerente gerente) {
        this.gerente = gerente;
    }

    public void contratarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }
    public void verificarSalarios() {
        gerente.calcularSalario();
        gerente.calcularBono();
        for (Empleado empleado : empleados) {
            empleado.calcularSalario();
        }
    }
}
