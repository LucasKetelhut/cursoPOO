package aula11;

public class Aula11 {

    public static void main(String[] args) {
        //var p1 = new Pessoa();
        var v1 = new Visitante();
        var a1 = new Aluno();
        var b1 = new Bolsista();
        
        v1.setNome("Ricardo");
        v1.setIdade(22);
        v1.setSexo("Masculino");
        v1.fazerAniversario();
        
        a1.setNome("Maria");
        a1.setMatr(1111);
        a1.setSexo("Feminino");
        a1.setIdade(18);
        a1.setCurso("Informática");
        a1.pagarMensalidade();
        
        b1.setNome("Cláudio");
        b1.setIdade(22);
        b1.setMatr(2222);
        b1.setBolsa(20.5f);
        b1.setCurso("Enfermagem");
        b1.setSexo("Masculino");
        b1.pagarMensalidade();
        
        System.out.println(v1.toString());
        System.out.println(a1.toString());
        System.out.println(b1.toString());
    }
    
}
