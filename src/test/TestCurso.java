
package test;

import dominio.Curso;

public class TestCurso {
    public static void main(String[] args) {
        Curso cursoA = new Curso();
        double [] notas = new double[12];
        llenanotas(notas);
        cursoA.setnotas(notas);
        cursoA.setpromedio();
        cursoA.setestudiantesA();
        System.out.println("promedio del curso:"+cursoA.getpromedio());
        System.out.println("N de estudiantes encima del promedio:"+cursoA.getnroestudiantesA());
    }
    public static void llenanotas(double[]notas){
        for(int i=0;i<12;i++){
            notas[i] = Math.random()*6;
        }
    }
}
