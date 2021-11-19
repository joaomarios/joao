package contabanco;

import contabanco.contaTeste ;

public class contaTeste {

    public static void main(String[] args) {
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
