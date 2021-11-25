package Concessionaria.carros;

public class Civic extends Carro implements CarroLuxo {

 private boolean arcondicionadoLigado;
 
 
 public Civic(){
   super();
   this.arcondicionadoLigado = false;
 }
 
 public void ligarArcondicionado(){
   if(this.arcondicionadoLigado == false){
     this.arcondicionadoLigado = true;
     System.out.println("Ar-condicionado foi ligado!");
   }else{
     System.out.println("Ar-condicionado já está ligado!");
   }
 }
 
 public void desligarArcondicionado(){
   if(this.arcondicionadoLigado == true){
     this.arcondicionadoLigado = false;
     System.out.println("Ar-condicionado foi desligado!");
   }else{
     System.out.println("Ar-condicionado já está desligado!");
   }
 }
 
 @Override
 public void desligar(){
   if(super.getLigado() == true){
     super.setLigado(false);
     this.arcondicionadoLigado = false;
     System.out.println("Motor Luxo foi desligado!");
   }else{
     System.out.println("Motor já está desligado!");
   }
 }
 
 public void acelerar(){
   System.out.print("Acelerando Luxo!");
 }
 
 public void frear(){
   System.out.print("Freando Luxo!");
 }
  
}
