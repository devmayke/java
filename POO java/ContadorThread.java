public class ContadorThread implements Runnable {
  private int numero;
  public ContadorThread(int aNum){
    numero= aNum;
  }
  public void run(){
    System.out.println("Thread numero 1 :" + numero);
  }
  
}
