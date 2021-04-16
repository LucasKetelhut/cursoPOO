package projetofinal;

public class ProjetoFinal {

    public static void main(String[] args) {
        var v = new Video("Teste");
        var p = new Gafanhoto("lukinha", "Lucas", 20, "Masculinho");
        var visu = new Visualizacao(p, v);
        visu.avaliar();
        
        System.out.println("VISUALIZAÇÕES\n-------------------------------");
        System.out.println(visu.toString());
        System.out.println("\nVIDEOS\n---------------------------------");
        System.out.println(v.toString());
        System.out.println("\nGAFANHOTOS\n---------------------------------");
        System.out.println(p.toString());
        
    }
    
}
