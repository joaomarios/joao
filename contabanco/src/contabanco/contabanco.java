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
}
