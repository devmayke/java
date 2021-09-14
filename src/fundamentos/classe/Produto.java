package fundamentos.classe;



public class Produto{
  double preco;
  String nome;
  double desconto;
  static String texto = "Static";
  Produto(){

  };
  Produto(String nomeConstrutor){
    nome = nomeConstrutor;
  }

  double desconto(int valor){
   return this.preco * (100 - valor) /100;
  }

}
