public class Adulto extends Humano implements Runnable {
    
    private float imc;

    public float getImc() {
        return imc;
    }
    public Adulto(String nome, String cpf) {
        super(nome, cpf);
      }
    


    

    @Override
    public void setAltura(float altura) {
        super.setAltura(altura);
    }




    @Override
    public void setPeso(float peso) {
        super.setPeso(peso);
    }


    public Adulto(float altura, float peso){
        setAltura(altura);
        setPeso(peso);

    }

    



    private void imc() {
        this.imc = getPeso() / (getAltura() * getAltura());
    }

    public void Correr() {
        imc();

        System.out.println("Com o IMC de " + imc);
        if (getImc() < 25) {
            System.out.println("Corre muito rápido");
        }
        if (getImc() >= 25 && getImc() < 30) {
            System.out.println("Corre bem");
        }
        if (getImc() >= 30) {
            System.out.println("Corrida bem lenta e com dificuldade");
        }
    }

    public void trabalhar(int aQtdeHoras) {
        //
    }

    public void trabalhar(int aQtdeHoras, String aLocal) {
        //
    }

    public void trabalhar(boolean aEquipamento) {
        //
    }

    public int trabalhar(double aValor) {
        return 0;
    }
    public void run() {
        for ( int i=0; i<10; i++ ) {
        //   System.out.println( "Humano:" + nome + " correndo..." );
          Main.setCadeira( nome );
        }
    }



}
