public class Humano {

    public String nomeEscola;
    protected boolean usaChupeta;
    private String formatoChupeta;
    
    public void Crianca() {
        formatoChupeta = "Padrão";
    }

    public void Comer() {
        System.out.println( "Apenas mama no peito da mãe ou na mamadeira" );
    }
    
    public void Falar() {
        System.out.println( "Apenas sons sem sentido" );
    }
    
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
