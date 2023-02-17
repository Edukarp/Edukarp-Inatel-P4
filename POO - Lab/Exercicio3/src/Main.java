public class Main {

    public static void main(String[] args) {

        Fabrica f1 = new Fabrica();
        Crianca c1 = new Crianca("Edu",12,"Brasil","Sla");
        Elfo e1 = new Elfo("Elfinho", "Criacao");

        Crianca c2 = new Crianca("Maria",12,"Brasil","Sla");

        f1.novoElfo(e1);
        f1.novaCrianca(c1);
        f1.novaCrianca(c2);

        //Esse pra testar sem nada
        try {
            f1.listarBonzinhos();
        }catch (SemBonzinhosException e){
            System.err.println(e.getMessage());
        }

        f1.addBonzinho("Edu");
        f1.addBonzinho("Maria");
        try {
            f1.listarBonzinhos();
        }catch (SemBonzinhosException e){
            System.err.println(e.getMessage());
        }

    }
}
