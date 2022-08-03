public class AnimalPet {

    String nomePet;
    String especie;
    String som;
    String comida;
    int idadePet;

    void comerPet(){
        System.out.println("Seu pet " + nomePet + " esta comendo " + comida);
    }

    void dormirPet(int horas){
        System.out.println("Seu pet " + nomePet + " estava dormindo as " + horas + " horas");
    }

    void movimentarPet(int metros){
        System.out.println("Seu pet " + nomePet + " andou " + metros + " metros");
    }

    void fazerBarulho(){
        System.out.println(som);
    }

}
