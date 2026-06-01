interface Notificacao{
    void enviar(String mensagem);
}

class Email implements Notificacao {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando Email: " + mensagem);

    }
}

class SMS implements Notificacao {
    @Override
    public void enviar(String mensagem){
        System.out.println("Enviando SMS: " + mensagem);
    }
}

class PushNotification implements Notificacao {
    @Override
    public void enviar(String mensagem){
        System.out.println("Enviando Push: " + mensagem);
    }
}

class GerenciadorNotificacoes {
    public void dispararAlerta(Notificacao canal, String msg){
        canal.enviar(msg);
    }
}
void main() {
    GerenciadorNotificacoes gerenciador = new GerenciadorNotificacoes();

    Notificacao email = new Email();
    Notificacao sms = new SMS();
    Notificacao push = new PushNotification();

    gerenciador.dispararAlerta(sms, "Seu boleto vence amanha");
    gerenciador.dispararAlerta(email, "Seu boleto vence amanha");
    gerenciador.dispararAlerta(push, "Seu boleto vence amanha");


}