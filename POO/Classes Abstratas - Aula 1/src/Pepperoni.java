public class Pepperoni extends Pizza{

    @Override
    public String mostraBrinde(){
        return "Caneta";
    }

    @Override
    public void mostraIngredientes(){
        System.out.println("Ingredientes: Pepperoni e Mussarela");
    }
}
