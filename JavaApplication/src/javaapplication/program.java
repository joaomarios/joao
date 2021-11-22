package javaapplication;

import entidades.order;
import enums.orderStatus;
import java.util.Date;

public class program {

    public static void main(String[] args) {
        order Order = new order(1080, new Date(), orderStatus.pagamento_pendente);
        System.out.println(Order);
        orderStatus os1 = orderStatus.entregue;
        orderStatus os2 = orderStatus.valueOf("entregue");
        System.out.println(os1);
        System.out.println(os2);
    }
}
