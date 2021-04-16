package aula12;

public class Aula12 {

    public static void main(String[] args) {
        //var n = new Animal();
        var m = new Mamifero();
        var r = new Reptil();
        var p = new Peixe();
        var a = new Ave();
        
        var canguru = new Canguru();
        
        m.locomover();
        m.alimentar();
        // m.usarBolsa();
        
        canguru.locomover();
        canguru.alimentar();
        canguru.usarBolsa();
    }
    
}
