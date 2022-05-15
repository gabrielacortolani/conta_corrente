class Banco {
    static int totalContas;
    Conta [] contas  = new Conta [10];    

    void Banco (){
        totalContas = 0;
    }

    void adicionaConta(Conta c){
        contas[totalContas] = c;
        totalContas += 1;
    }

    Conta pegarConta(int x){
        return contas[x];
    }

    static int pegarTotalContas(){
        return totalContas;
    }
}
