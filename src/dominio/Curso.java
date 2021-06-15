
package dominio;

public class Curso {
    private double [] notas;
    private double promedio;
    private int estudiantes_A;

    public Curso() {
        notas = new double[12];
    }
    public void setnotas(double[] notas) {
        this.notas = notas;
    }
    public void mostrarnotas(){
        for(int i=0;i<12;i++){
            System.out.println(this.notas[i]);
        }
    }
    public void setpromedio(){
        double promedio = 0;
        this.promedio = promedio;
    }
    public void setestudiantesA(){
        int estudiantes = 0;
        this.estudiantes_A = estudiantes; 
    }
    public double getpromedio(){
        return this.promedio;
    }
    public int getnroestudiantesA(){
        return this.estudiantes_A;
    }
    
}
