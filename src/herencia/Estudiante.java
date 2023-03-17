/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author samue
 */
public class Estudiante extends Persona{
    ArrayList<String> arrayList = new ArrayList<String>();
    
    //Atributos de la clase Estudiante
    private String carnet;
    private double notas;
    private int numeroMaterias;
    
    //Metodo constructor
    public Estudiante() {
    }
    
    //Metodo constructor sobrecargado
    public Estudiante(String carnet, double notas, int numeroMaterias) {
        this.carnet = carnet;
        this.notas = notas;
        this.numeroMaterias = numeroMaterias;
    }

    //Metodos getters y setters
    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public double getNotas() {
        return notas;
    }

    public void setNotas(double notas) {
        this.notas = notas;
    }

    public int getNumeroMaterias() {
        return numeroMaterias;
    }

    public void setNumeroMaterias(int numeroMaterias) {
        this.numeroMaterias = numeroMaterias;
    }
    
    //Metodos de la clase
    public double calcularPromedio(){
        double promedio = 0.0;
        for(int i = 0; i <= arrayList.size()-1; i++){
            promedio  = (promedio + Double.parseDouble(arrayList.get(i))) / (arrayList.size()-1);
        }
        return promedio;
    }
    
    public void leerNotasEstudiante(){
        int contador = 0;
        while(contador < numeroMaterias){
            arrayList.add(JOptionPane.showInputDialog(null, "Digite la nota"));
            contador++;
        }
    }
    
    public void ingresarDatosEstudiante(){
        String nombre = "";
        String apellido = "";
        int edad = 0;
        double peso = 0.0;
        nombre = leerDatoTipoCadena("Ingrese el nombre del estudiante: ");
        apellido = leerDatoTipoCadena("Ingrese el apellido del estudiante: ");
        edad = leerDatoTipoEntero("Ingrese la edad del estudiante: ");
        peso = leerDatoTipoReal("Ingrese el peso del estudiante: ");
        carnet = JOptionPane.showInputDialog(null, "Ingrese el numero de carnet");
        numeroMaterias = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la cantidad de materias que cursa"));
        setNombre(nombre);
        setApellido(apellido);
        setEdad(edad);
        setPeso(peso);
        leerNotasEstudiante();
    }
    
    public void imprimirReporteNotasEstudiante(){
        imprimirDatosPersona();
        JOptionPane.showMessageDialog(null, "Su numero de carnet es: "+carnet+"\nLa cantidad de materias es de: "+numeroMaterias+"\nSu promedio es de: "+calcularPromedio());
    }
    
    
}
