import java.lang.*;
import java.util.*;

class Ec2Grado{
     private int numA;
     private int numB;
     private int numC;
     
     void setNumA(int numA){
          this.numA = numA;
     }
     
     void setNumB(int numB){
          this.numB = numB;
     }
     
     void setNumC(int numC){
          this.numC = numC;
     }
     
     int getNumA(){
          return this.numA;
     }
     
     int getNumB(){
          return this.numB;
     }
     
     int getNumC(){
          return this.numC;
     }
     
     
     double calcular1(){
          double resultadoSuma = ((-(numB) + Math.sqrt((numB*numB)-(4*numA*numC)))/(2*numA));
          return resultadoSuma;
     }
     
     
     double calcular2(){
          double resultadoResta= (-(numB) - Math.sqrt((numB*numB)-(4*numA*numC)))/(2*numA);
          return resultadoResta;
     }
}

public class Ecuacion2Grado {
     
     public static void main(String[] args) {
          
          Scanner leer = new Scanner(System.in);
          Ec2Grado ecuacion = new Ec2Grado();
          System.out.print("Introduce el valor de a: "); ecuacion.setNumA(leer.nextInt());
          System.out.print("Introduce el valor de b: "); ecuacion.setNumB(leer.nextInt());
          System.out.print("Introduce el valor de c: "); ecuacion.setNumC(leer.nextInt());
          System.out.println("x1: " + ecuacion.calcular1());
          System.out.println("x2: " + ecuacion.calcular2());
     }
     
}

