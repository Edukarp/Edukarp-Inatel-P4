public class Main {
    public static void main(String[] args) {

        Zoologico zoo = new Zoologico("Zoologico1","BlaBla");
        Animal[] animais = new Animal[100];

        animais[0] = new Coruja("Joao",2,"Marorm",100);
        animais[0].fazBarulho();

        animais[1] = new Pato("Patu",2,"Branco",3f);
        animais[1].fazBarulho();

        animais[2] = new Leao("Romeu",2,"Caramelo",20f);
        animais[2].fazBarulho();

        animais[3] = new Peixe("Mariana",2,"Azul",1);
        animais[3].fazBarulho();

        zoo.addAnimal(animais[0]);
        zoo.addAnimal(animais[1]);
        zoo.addAnimal(animais[2]);
        zoo.addAnimal(animais[3]);

        zoo.mostraAnimais();




    }
}
