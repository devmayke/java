public abstract class Humano implements Elemento {
    
    private String nomeEscola;
    protected boolean usaChupeta;
    public float getPeso() {
        return peso;
    }



    public void setPeso(float peso) {
        this.peso = peso;
    }



    public float getAltura() {
        return altura;
    }



    public void setAltura(float altura) {
        this.altura = altura;
    }


    private String formatoChupeta;
    private float peso;
    private float altura;


    public String getNomeEscola() {
        return nomeEscola;
    }



    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }



    public boolean isUsaChupeta() {
        return usaChupeta;
    }



    public void setUsaChupeta(boolean usaChupeta) {
        this.usaChupeta = usaChupeta;
    }



    public String getFormatoChupeta() {
        return formatoChupeta;
    }



    public void setFormatoChupeta(String formatoChupeta) {
        this.formatoChupeta = formatoChupeta;
    }


    private String nome;
    private String cpf;   
    
    public Humano(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }



    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getCpf() {
        return cpf;
    }


    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    




    public Humano() {
    }


    public void Crianca() {
        formatoChupeta = "Padrão";
    }

 
    public void Andar() {
        // TODO Auto-generated method stub
        
    }


    public void Correr() {
        // TODO Auto-generated method stub
        
    }

  
    public void EmitirSom() {
        // TODO Auto-generated method stub
        
    }
 
    public void Comer() {
        // TODO Auto-generated method stub
        
    }

    // public void Comer() {
    //     System.out.println( "Apenas mama no peito da mãe ou na mamadeira" );
    // }
    
    // public void Falar() {
    //     System.out.print( "Apenas sons sem sentido" );
    // }
    
    public void Birra() {
        System.out.println( "Faz uma manha qualquer" );
    }
    

    protected void ChupaChupeta() {
        if ( usaChupeta ) {
            System.out.println( "Chupando Chupeta do tipo: " + formatoChupeta );
        } else {
            System.out.println( "Não faz nada" );
        }
    }
    
    // protected abstract void Aprender();
}
