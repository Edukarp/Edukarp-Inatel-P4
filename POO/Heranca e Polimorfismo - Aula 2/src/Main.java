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

        //Aula 2

        //Lendo os animais dentro do array de zoologico
        for(int i = 0; i < zoo.getAnimal().length; i++){
            if(zoo.getAnimal()[i] != null){
                System.out.println(zoo.getAnimal()[i].nome);
                System.out.println(zoo.getAnimal()[i].cor);
                System.out.println(zoo.getAnimal()[i].nPatas);

                if(zoo.getAnimal()[i] instanceof Coruja){ //Se o animal for uma instancia de Coruja
                    Coruja coruja_aux = (Coruja) zoo.getAnimal()[i]; //Fazendo cast com um aux de coruja
                    System.out.println(coruja_aux.getAlturaVoo());//E ai consegue usar os metodos especificos
                }
                if(zoo.getAnimal()[i] instanceof Leao){
                    Leao leao_aux = (Leao) zoo.getAnimal()[i];
                    System.out.println(leao_aux.getTamJuba());
                }
                if(zoo.getAnimal()[i] instanceof Pato){
                    Pato pato_aux = (Pato) zoo.getAnimal()[i];
                    System.out.println(pato_aux.getTamBico());
                }
                if(zoo.getAnimal()[i] instanceof Peixe){
                    Peixe peixe_aux = (Peixe) zoo.getAnimal()[i];
                    System.out.println(peixe_aux.getnBarbatanas());
                }
            }
        }

    }
}
