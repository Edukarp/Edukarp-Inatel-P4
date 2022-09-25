public class Zoologico {
    private String nome;
    private String endereco;

    private Animal[] animal = new Animal[100];

    private static int numAnimais;

    public Zoologico(String nome, String endereco){
        this.nome = nome;
        this.endereco =endereco;
    }

    public void addAnimal(Animal animal){
        this.animal[numAnimais] = new Animal();
        this.animal[numAnimais] = animal;
        numAnimais++;
    }

    public void mostraAnimais(){
        int qnt = 0;
        System.out.println("-------------------------");
        System.out.println("Animais");
        for (int i = 0;i < animal.length; i++){
            if(animal[i] != null) {
                System.out.println(animal[i].nome);
                qnt++;
            }
        }
        System.out.println("Total: " + qnt + " animais.");
    }

    public Animal[] getAnimal() {
        return animal;
    }
}
