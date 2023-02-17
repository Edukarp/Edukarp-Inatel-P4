public class CodigoDesconhecidoException extends RuntimeException{
    public CodigoDesconhecidoException(String mensagem){
        System.err.println(mensagem); //err sereve pra mostrar em vermelho como um erro mesmo
    }
}
