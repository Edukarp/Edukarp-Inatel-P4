import java.util.ArrayList;

public class Cadastro {

    public ArrayList<String> codigosValidos = new ArrayList<>();
    public ArrayList<String> codigosInvalidos = new ArrayList<>();

    public void addCodigo(String codigo){
        if(codigo.length() == 7 && codigo.startsWith("mp-") || codigo.startsWith("dp-") || codigo.startsWith("bp-") )
            codigosValidos.add(codigo);
        else{
            try {
                throw new CodigoDesconhecidoException("Excecao de codigo desconheciddo detectada!");
            }catch (CodigoDesconhecidoException e) {
                codigosInvalidos.add(codigo);
            }
        }
    }

    public void mostraCodigos(){
        System.out.println("Codigos validos:");
        System.out.println(codigosValidos);
        System.out.println("Codigos invalidos:");
        System.out.println(codigosInvalidos);
    }

}
