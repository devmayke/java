package fundamentos.desafio;

public class Pessoa{


  String nome;
  double peso = 60;
  Pessoa(String nomeConstrutor, double pesoConstrutor){
    nome = nomeConstrutor;
    peso = pesoConstrutor;
    
  }
  double comer(double comida){
    peso+= comida;
    return peso;
  } 
}