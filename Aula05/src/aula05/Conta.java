package aula05;

public class Conta {
    public int numConta;
    protected String tipo; // CC ou CP
    private String dono;
    private float saldo;
    private boolean status; // Aberto = true ; Fechada = falso

    public Conta() {
        this.saldo = 0;
        this.status = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDono() {
        return dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public void abrirConta(String tipo) {
        this.setTipo(tipo);
        if (tipo == "CC") {
            this.setSaldo(50);
        } else if (tipo == "CP") {
            this.setSaldo(150);
        }
        this.setStatus(true);
        System.out.println("Conta aberta!");
    }
    
    public void fecharConta(){
        if (this.getSaldo() > 0) {
            System.out.println("[ERRO] Para fechar a conta deve sacar o dinheiro antes.");
        } else if (this.getSaldo() < 0) {
            System.out.println("[ERRO] Para fechar a conta deve pagar o débito antes.");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada!");
        }
    }
    
    public void depositar(float n) {
        if (!this.getStatus()) {
            System.out.println("[ERRO] Para fazer depósito conta deve estar aberta.");
        } else {
            this.setSaldo(getSaldo() + n);
            System.out.println("Depósito feito na conta de " + this.getDono());
        }
    }
    
    public void sacar(float n) {
        if (!this.getStatus()) {
            System.out.println("[ERRO] Para fazer saque conta deve estar aberta.");
        } else if (this.saldo < 0) {
             System.out.println("[ERRO] Para fazer saque conta deve ter saldo.");
        } else if (n > this.saldo) {
             System.out.println("[ERRO] Saque não pode ser maior que o saldo.");
        } else {
            this.setSaldo(getSaldo() - n);
            System.out.println("Saque realizado na conta de " + this.getDono());
        }
    }
    
    public void pagarMensal() {
        if (this.getTipo() == "CC") {
            if (this.getSaldo() > 12) {
                this.setSaldo(getSaldo()- 12);
            } else {
                System.out.println("[ERRO] Saldo insuficiente");
            }
        } else if (this.getTipo() == "CP") {
            if (this.getSaldo() > 20) {
                this.setSaldo(getSaldo() - 20);
            } else {
                System.out.println("[ERRO] Saldo insuficiente");
            }
        } else {
            System.out.println("[ERRO] Impossível pagar");
        }
    }
    
    public void estadoAtual() {
        System.out.println("-----------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
}
