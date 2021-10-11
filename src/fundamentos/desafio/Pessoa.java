package fundamentos.desafio;

public class Pessoa{
  String nome;
  double peso = 60;

  Pessoa(String nome, double peso){
    this.nome = nome;
    this.peso = peso;
    
  }
  double comer(Comida comida){
    peso+= comida.peso;
    return peso;
  } 
  void apresentar(){
    System.out.println("O " + nome + " aumentou seu peso para " + peso + "kg");  
  }
}