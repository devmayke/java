public class Adulto extends Humano {
    
    private float imc;

    public float getImc() {
        return imc;
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
}
