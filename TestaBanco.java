class TestaBanco {
    public static void main (String [] args){
        Banco banco = new Banco();

        Conta c = new Conta();
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();

        banco.adicionaConta(c);
        banco.adicionaConta(cc);
        banco.adicionaConta(cp);

        System.out.println(Banco.totalContas);
        
    }
}
