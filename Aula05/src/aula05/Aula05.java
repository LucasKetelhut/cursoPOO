package aula05;

public class Aula05 {

    public static void main(String[] args) {
       var p1 = new Conta();
       p1.setNumConta(1111);
       p1.setDono("Lucas");
       p1.abrirConta("CC");
       
       var p2 = new Conta();
       p2.setNumConta(2222);
       p2.setDono("Duda");
       p2.abrirConta("CP");
       
       p1.depositar(100);
       p2.depositar(500);
       p2.sacar(100);
       
       p1.sacar(150);
       p1.fecharConta();
       
       p1.estadoAtual();
       p2.estadoAtual();
       
    }
    
}
