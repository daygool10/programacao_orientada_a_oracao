class FormaPagamento {
    public void processarPagamento(double valor){
        System.out.println("Processando pagamento generico de R$" + valor);
    }
}

class CartaoCredito extends FormaPagamento {
    @Override
    public void processarPagamento(double valor){
        double valorFinal = valor + (valor * 0.05);
        System.out.println("Pagamento de R$" + valorFinal + " efetuado com sucesso");
    }
}

class BoletoBancario extends FormaPagamento {
    @Override
    public void processarPagamento(double valor){
        double valorFinal = valor - (valor * 0.10);
        System.out.println("Pagamento de R$" + valorFinal + " efetuado com sucesso");
    }
}


void main() {
    FormaPagamento f1 = new CartaoCredito();
    FormaPagamento f2 = new BoletoBancario();

    f1.processarPagamento(50);
    f2.processarPagamento(100);
}