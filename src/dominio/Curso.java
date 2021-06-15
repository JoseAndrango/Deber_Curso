
package dominio;

public class Curso {
    private double [] notas;
    private double promedio;
    private int estudiantes_A;
    private double aux; 

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
        for(int i=0;i<12;i++){
            double aux=notas[i];
            promedio=aux+promedio;
        }
        this.promedio = Math.random()*6;
    }
    public void setestudiantesA(){
        int estudiantes= (int) this.promedio;
        for(int i=0;i<12;i++){
           if(notas[i]<(promedio/12)){
                estudiantes++;
            }
    }
        this.estudiantes_A=estudiantes;
    }
    public double getpromedio(){
        return this.promedio;
    }
    public int getnroestudiantesA(){
        return this.estudiantes_A;
    }
    
}
