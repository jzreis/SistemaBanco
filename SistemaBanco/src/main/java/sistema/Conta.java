package sistema;

import java.time.LocalDate;
import javax.swing.JOptionPane;

public class Conta {

    private String cliente;
    private String cpf;
    private String historico = "";
    private String senha;
    private LocalDate data;
    private int id;
    private double saldo;

    public Conta(String cliente, String cpf, String senha) {
        this.cliente = cliente;
        this.cpf = cpf;
        this.senha = senha;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getHistorico() {
        return this.historico;
    }

    public String getSenha() {
        return this.senha;
    }

    protected void setData(LocalDate data) {
        this.data = data;
    }

    public LocalDate getData() {
        return data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public boolean saca(double saque) {
        if (saque > this.saldo) {
            JOptionPane.showMessageDialog(null, "Saque maior que o saldo!Saldo: R$" + this.getSaldo() + ";Saque: R$" + saque + "!", "Alerta", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if(saque < 0){
            JOptionPane.showMessageDialog(null, "Saque nao pode ser menor que R$ 0!", "Alerta", JOptionPane.ERROR_MESSAGE);
            return false;
        }else {
            this.saldo -= saque;
            JOptionPane.showMessageDialog(null, "R$ "+saque+" foram removidos da conta!", "Alerta", JOptionPane.ERROR_MESSAGE);
            this.historico += "\nSaque realizado,R$" + saque + " foram removidos da conta";
            return true;
        }
    }

    public boolean deposito(double deposito) {
        if (deposito < 0) {
            JOptionPane.showMessageDialog(null, "Valor nao pode ser menor que R$ 0!", "Alerta", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            this.saldo += deposito;
            JOptionPane.showMessageDialog(null, "R$ "+deposito+" foram adicionados a conta!", "Alerta", JOptionPane.ERROR_MESSAGE);
            this.historico += "\nDeposito realizado,R$" + deposito + " foram adicionados a conta";
            return true;
        }
    }

    public void transfere(Conta c, double deposito) {
        this.saca(deposito);
        c.deposito(deposito);
        JOptionPane.showMessageDialog(null, "R$ "+deposito+" foram enviados para "+c.getCliente(), "Alerta", JOptionPane.ERROR_MESSAGE);
        this.historico += "\nTransferencia realizada, R$" + deposito + " foram enviados para " + c.getCliente();
        c.historico += "Transferencia recebida,R$" + deposito + " foram recebidos de " + this.getCliente();
    }

    @Override
    public String toString() {
        return String.format("Titular da conta: %s \nId: %d \nCpf: %s \nSaldo: %.2f \nData de criacao: %s",
                this.getCliente(), this.getId(), this.getCpf(), this.getSaldo(), this.getData());
    }

}
