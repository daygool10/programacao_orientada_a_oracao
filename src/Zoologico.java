import java.util.ArrayList;
import java.util.List;


abstract class Animal {
    protected String nome;
    protected double peso;

    public Animal(String nome, double peso){
        this.nome = nome;
        this.peso = peso;
    }

    public abstract double calcularRacao();
}

public class Leao extends Animal {

    public Leao(String nome, double peso){
        super(nome, peso);
    }

    @Override
    public double calcularRacao(){
        return peso * 0.10;
    }
}

public class Girafa extends Animal {

    public Girafa (String nome, double peso){
        super(nome, peso);
    }

    @Override
    public double calcularRacao(){
        return peso * 0.08;
    }
}

public class Macaco extends Animal {

    public Macaco (String nome, double peso) {
        super(nome, peso);
    }

    @Override
    public double calcularRacao(){
        return peso * 0.05;
    }
}



void main() {
    List<Animal> animais = new ArrayList<>();

    animais.add(new Leao("Simba", 100.0));
    animais.add(new Girafa("Nelman", 95.0));
    animais.add(new Macaco("Botas", 67.0));

    for(Animal a1: animais){
        System.out.println("Animal: " + a1.nome + "\n" + "Peso: " + a1.peso + "\n" +
                "Quantidade de racao: " + a1.calcularRacao() + "\n") ;
    }
}