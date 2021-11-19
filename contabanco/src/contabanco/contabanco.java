package contabanco;

public class contabanco {

    public int agençia, numconta;
    String tipo;
    String nome;
    String cpf;
    public float saldo;
    boolean status;

    //1° metodo construtor
    public contabanco(String nome, int agençia, int numconta) {
        this.nome = nome;
        this.agençia = agençia;
        this.numconta = numconta;

    }

    //2°contrutor
    public contabanco() {
        this.nome = "joao ";
        this.cpf = "123.456.789.01";
        this.agençia = 1111;
        this.numconta = 1234567;
        this.tipo = "cc";
        this.saldo = 0;
        this.status = true;

    }

    public void estadoConta() {
        System.out.println("---------------------------------------");
        System.out.println("AGENÇIA: " + this.getAgençia());
        System.out.println("NUMERO DA CONTA: " + this.getNumconta());
        System.out.println("TIPO: " + this.getTipo());
        System.out.println("NOME: " + this.getNome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("STATUS: " + this.getStatus());
        System.out.println("SALDO: " + this.getSaldo());
        System.out.println("---------------------------------------");

    }

    public void abrircontar(String tipo) {
        //  this.setTipo(tipo);
        this.setStatus(true);
        if (tipo == "cc") {
            System.out.println("seja bem vindo a nova conta corrente\n");
            this.saldo = 0;
        } else if (tipo == "cp") {
            System.out.println("seja bem vindo a nova conta poupança\n");
            this.saldo = 0;
        }

    }

    public void deposita(float v) {
        if (this.getStatus()) {
            this.saldo = this.saldo + v;
            System.out.println("deposito realizado no nome de: \n\t  " + this.getNome());
            System.out.println("no valor de: " + v);
        } else {
            System.out.println("conta inesxistente");
        }
    }

    public void sacar(float v) {
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.saldo = this.saldo - 0.10f - v;
                System.out.println(" saque realizado com sucesso:");
                System.out.println("no valor de: " + -v);
            } else {
                System.out.println("saldo insuficiente para saque:");
            }
        } else {
        }

    }

    public int getAgençia() {
        return agençia;
    }

    public int getNumconta() {
        return numconta;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public float getSaldo() {
        return saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public static void main(String[] agrs) {

        contabanco p1 = new contabanco();
        p1.abrircontar("cp");
        p1.deposita(500);
        p1.sacar((float) 49.9);
        p1.estadoConta();

        contabanco p2 = new contabanco("jose silva", 252, 58545);
        p2.abrircontar("cc");
        p2.deposita((float) 150.90);
        p2.sacar((float) 299.9);
        p2.estadoConta();

        contabanco p3 = new contabanco();
        p3.nome = "maria de jesus";
        p3.agençia = 2525;
        p3.cpf = "115.589.478.58";
        p3.numconta = 12539875;
        p3.status = true;
        p3.tipo = "cc";
        p3.saldo = 0;
        p3.deposita((float) 5000);
        p3.estadoConta();

    }

}
