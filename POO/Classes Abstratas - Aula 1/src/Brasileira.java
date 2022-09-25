public class Brasileira extends Pizza{

    @Override
    public String mostraBrinde(){
        return "Chaveiro";
    }

    @Override
    public void mostraIngredientes(){
        System.out.println("Ingredientes: Mussarela, Requeijao, Presunto e Azeitona");
    }
}
