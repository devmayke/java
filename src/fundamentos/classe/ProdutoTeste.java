package fundamentos.classe;

public class ProdutoTeste {
  public static void main(String[] args){
    Produto produto1 = new Produto();
    Produto produto2 = new Produto("Notebook");//passando argumento no paramâmetro do contrutor
    produto1.nome = "Qualquer coisa";
    produto1.preco = 200;
    double desconto = produto1.desconto(20);
    Produto.texto = "Static 2";///static
 
    System.out.println(produto1.nome);
    System.out.println(produto1.preco);
    System.out.println(desconto);
    System.out.println(produto2.nome);
    System.out.println(Produto.texto);
    System.out.println(produto1.texto);
    System.out.println(produto2.texto);
 
 


  }

}
