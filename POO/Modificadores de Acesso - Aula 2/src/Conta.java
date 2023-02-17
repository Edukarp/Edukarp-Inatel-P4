public class Conta {

        private int numero;
        private Cliente titular;
        private float saldo;
        private float limite;

        //Atrinuto de Classe -> Nao pertence ao Objeto e sim a classe TODA
        /* private/public */static int totalContas;

        public Conta(){
                System.out.println("Conta Criada");
                totalContas++;
        }

        public Conta(int numero, float saldo, Cliente titular){
                this.numero = numero;
                this.saldo = saldo;
                this.titular = titular;
                totalContas++;
        }

        /* //Getters e Setters
        public void setSaldo(float saldo) {
                this.saldo = saldo;
        }
        public float getSaldo() {
                return saldo;
        }

        public void setNumero(int numero) {
                this.numero = numero;
        }
        public int getNumero() {
                return numero;
        }

        public void setTitular(Cliente titular) {
                this.titular = titular;
        }
        public Cliente getTitular() {
                return titular;
        }

        public void setLimite(float limite) {
                this.limite = limite;
        }
        public float getLimite() {
                return limite;
        }
         */


        //Metodos
        public void sacar(float quantia){
                if(quantia <= saldo) { //Controlando a operacao de Saque
                        saldo = saldo - quantia;
                        System.out.println("Saque Realizado");
                        System.out.println("Novo Saldo: " + saldo);
                }
                else
                        System.out.println("Saque NEGADO!   Saldo Insuficiente");

                System.out.println("-------------------------------------");
        }
}
