class Veiculo {
    public void mover(){
        System.out.println("veiculo se movendo");
    }
}
 class Carro extends Veiculo{
    @Override
     public void mover(){
        System.out.println("O carro esta dirigindo");
    }
 }
 class Bicicleta extends Veiculo {
    @Override
     public void mover(){
        System.out.println("A bicicleta esta pedalando");
    }
 }

 class Aviao extends Veiculo {
    @Override
     public void mover(){
        System.out.println("O aviao esta voando ");
    }
 }



void main() {
    Veiculo v1 = new Carro();
    Veiculo v2 = new Bicicleta();
    Veiculo v3 = new Aviao();
    Veiculo v4 = new Veiculo();

    v1.mover();
    v2.mover();
    v3.mover();
    v4.mover();
}