package aula03;

public class Aula03 {
    
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "BIC";
        c1.cor = "Preta";
        //c1.ponta = 5.1f;
        c1.carga = 90;
        c1.tampar();
        c1.status();
        c1.destampar();
        c1.status();
        
        
    }
    
}
