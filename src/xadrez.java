abstract class PecaXadrez {
    private int linha;
    private int coluna;

    public PecaXadrez(int linha, int coluna){
        this.linha = linha;
        this.coluna = coluna;
    }

    public int getLinha(){
        return linha;
    }

    public int getColuna(){
        return coluna;
    }

    public abstract boolean validarMovimento(int novaLinha, int novaColuna);
}

class Torre extends PecaXadrez {

    public Torre(int linha, int coluna) {
        super(linha, coluna);
    }

    @Override
    public boolean validarMovimento(int novaLinha, int novaColuna){
        return getLinha() == novaLinha || getColuna() == novaColuna;
    }
}

class Bispo extends PecaXadrez {
     public Bispo (int linha, int coluna){
         super(linha, coluna);
     }

     @Override
    public boolean validarMovimento(int novaLinha, int novaColuna){
         return Math.abs(getLinha() - novaLinha) == Math.abs(getColuna() - novaColuna);
     }
}


void main(){

    PecaXadrez[] pecas = {new Torre(0,0), new Bispo(0,0)};

    for(PecaXadrez peca: pecas){
        if(peca.validarMovimento(3,3)){
            System.out.println(peca.getClass().getSimpleName() + " aceitou movimento para (3, 3)");
        }
    }

}