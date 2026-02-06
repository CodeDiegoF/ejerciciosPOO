package org.example;
import java.util.*;


class sistemaEc{
     private int a;
     private int b;
     private int c;
     private int d;
     private int e;
     private int f;
     
     void setA(int a){
          this.a = a;
     }
     
     void setB(int b){
          this.b = b;
     }
     
     void setC(int c){
          this.c = c;
     }
     
     void setD(int d){
          this.d = d;
     }
     
     void setE(int e){
          this.e = e;
     }
     
     void setF(int f){
          this.f = f;
     }
     
     boolean comprobar(){
          int comp= a*d - b*c;
          
          if(comp == 0){
               System.out.println("El sistema de ecuaciones no se puede solucionar");
               return false;
          }else
               System.out.println("El sistema de ecuaciones se puede solucionar");
          return true;
     }
     
     double resultadoX(){
          return (e*d-b*f)/(a*d-b*c);
     }
     
     double resultadoY(){
          return (a*f-e*c)/(a*d-b*c);
     }
}

public class SistemaEcuaciones {
     
     public record sistemasEc(int a, int b, int c, int d, int e, int f) {}
     
     public static void main(String[] args) {
          sistemaEc sistema = new sistemaEc();
          Scanner leer = new Scanner(System.in);
          System.out.println("Introduce el valor de a: "); sistema.setA(leer.nextInt());
          System.out.println("Introduce el valor de b: "); sistema.setB(leer.nextInt());
          System.out.println("Introduce el valor de e: "); sistema.setE(leer.nextInt());
          System.out.println("Introduce el valor de c: "); sistema.setC(leer.nextInt());
          System.out.println("Introduce el valor de d: "); sistema.setD(leer.nextInt());
          System.out.println("Introduce el valor de f: "); sistema.setF(leer.nextInt());
          
          if(sistema.comprobar()){
               System.out.println("x: " + sistema.resultadoX());
               System.out.println("y: " + sistema.resultadoY());
          }
     }
}
