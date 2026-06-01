class Personagem {
    public void atacar(){
        System.out.println("Ataque basico!");
    }
}

class Mago extends Personagem {
    @Override
    public void atacar(){
        System.out.println("Mago lanca uma bola de fogo!");
    }

    public void atacar(String magia){
        System.out.println("Mago lanca magia: " + magia);
    }

    public void atacar(String magia, int poder){
        System.out.println("Mago lanca " + magia + " com forca de " + poder);
    }
}


void main() {
    Personagem p = new Mago();
    Mago m = new Mago();

    p.atacar();
    m.atacar("Raio"); // so consegue ser acessado se for instanciado de Magp
    m.atacar("Laser", 150); // so consegue ser acessado se for instanciado de Magp
}