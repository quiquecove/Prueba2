package alumno;

import java.util.Arrays;
import java.util.Scanner;

public class Alumno {

    Scanner in = new Scanner(System.in);
    Scanner enteros = new Scanner(System.in);
    private String nombre;
    private String curso;
    private int[] notas;
    private String[] Asignaturas;



    public Alumno(String nombre, String curso, int notas) { // int asignaturas
        this.nombre = nombre;
        this.curso = curso;
        this.notas = new int[notas];// asignaturas
    }

    public Alumno(String nombre, String curso) {
        this(nombre, curso, 5);
    }

    public Alumno(String nombre) {
        this(nombre, "DAM");
    }

    /////////////////////////////////////////////////////////////
    public String getNombre() {
        return nombre;
    }

    public void setNombre() {
        this.nombre = in.nextLine();

    }

    public String getCurso() {
        return curso;
    }
    
    public void setCurso() {
        this.curso = in.nextLine();
    }

    public String getNotas() {
        return Arrays.toString(notas);
        
    }

    public void setNotas() {

        for (int i = 0; i < this.notas.length; i++) {
            this.notas[i] = enteros.nextInt();
        }
    }
    public String getAsignaturas() {
        return Arrays.toString(Asignaturas);
    }

    public void setAsignaturas() {
        for (int i = 0; i < this.Asignaturas.length; i++) {
            this.Asignaturas[i] = in.nextLine();
        }
    }

    public String cambioCurso() {

        return this.curso;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Alumno Alum1 = new Alumno("Miguel", "ASIR");

        System.out.println("Como te llamas");
        Alum1.setNombre();

        // System.out.println(Alum1);
        System.out.println("Cual es tu curso?");
        Alum1.setCurso();
        // System.out.println("Eres "+ Alum1.getNombre()+" tu curso se ha actualizado a " + Alum1.getCurso());
        System.out.println();
        System.out.println("Asignaturas?");
        Alum1.setAsignaturas();
        System.out.println("Profe, dime las notas de "+Alum1.getNombre());
        Alum1.setNotas();



        System.out.println("Hola!"+Alum1.nombre+" estas en "+Alum1.getCurso()+" tus asignaturas son "+Alum1.getAsignaturas() +" y tus notas son "+Alum1.getNotas());
    }

}
