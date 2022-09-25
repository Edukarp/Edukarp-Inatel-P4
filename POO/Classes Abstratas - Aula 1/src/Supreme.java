public class Supreme extends Pizza{

    @Override
    public String mostraBrinde(){
        return "Caneca";
    }

    @Override
    public void mostraIngredientes(){
        System.out.println("Ingredientes: Mussarela, Cebola, Pimentao e Azeitona");
    }

}
