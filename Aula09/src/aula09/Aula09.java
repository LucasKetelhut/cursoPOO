package aula09;

public class Aula09 {

    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Lucas", 20, "Masculino");
        p[1] = new Pessoa("Duda", 16, "Feminino");
        
        l[0] = new Livro("Livro de aprendizagem", "José Alencar", 389, p[0]);
        l[1] = new Livro("Título aleatório", "Maria Bleur", 491, p[1]);
        l[2] = new Livro("Clean Architeture", "Uncle Bob", 500, p[0]);
        
        l[0].abrir();
        l[0].folhear(200);
        l[0].avançarPag();
        System.out.println(l[0].detalhes());
        
        System.out.println(l[1].detalhes());
    }
    
}
