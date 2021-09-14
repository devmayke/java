package fundamentos.desafio;

public class Pessoa{


  String nome;
  double peso = 60;
  Pessoa(String nomeConstrutor, double pesoConstrutor){
    nome = nomeConstrutor;
    peso = pesoConstrutor;
    
  }
  double comer(Comida comida){
    peso+= comida.peso;
    return peso;
  } 
  void apresentar(){
    System.out.println("O " + nome + " aumentou seu peso para " + peso + "kg");  
  }
}