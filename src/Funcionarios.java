class Funcionario {
    public void trabalhar(){
        System.out.println("Funcionario trabalhando");
    }
}

class Professor extends Funcionario {
    @Override
    public void trabalhar(){
        System.out.println("Professor esta dando aula");
    }
}

class Programador extends Funcionario {
    @Override
    public void trabalhar(){
        System.out.println("O programador esta desenvolvendo codigos");
    }
}
 class Medico extends Funcionario {
    @Override
     public void trabalhar(){
        System.out.println("O medico esta atendendo um paciente");
    }
 }


void main() {
    Funcionario f1 = new Professor();
    Funcionario f2 = new  Programador();

    f2.trabalhar();
}