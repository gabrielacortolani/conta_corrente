class AtualizadorDeContas {
    private double saldoTotal = 0;
    private double selic;
   
    AtualizadorDeContas(double selic) {
        this.selic = selic;
    }
   
    void roda(Conta c) {
        // aqui voce imprime o saldo anterior, atualiza a conta,
        // e depois imprime o saldo final
        // lembrando de somar o saldo final ao atributo saldoTotal
        System.out.println(c.getSaldo());
        c.atualiza(this.selic);
        this.saldoTotal += c.getSaldo();
        System.out.println(c.getSaldo());
    }

    double getSaldoTotal(){
        return this.saldoTotal;
    }
}
