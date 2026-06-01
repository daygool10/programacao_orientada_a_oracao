class Animal{
    public void fazerSom(){
        System.out.println("Som genérico");
    }
}

class Cachorro extends Animal{
    @Override
    public void fazerSom(){
        System.out.println("Au au");
    }
}

class Gato extends Animal{
    @Override
    public void fazerSom(){
        System.out.println("Miau");
    }
}


void main(){

    Animal animal1 = new Cachorro();
    Animal animal2 = new Gato();

    animal1.fazerSom();
    animal2.fazerSom();


}