package entidades;

import enums.orderStatus;
import java.util.Date;

public class order {

    private Integer id;
    private Date momento;
    private orderStatus status;

    public order() {
    }

    public order(Integer id, Date momento, orderStatus status) {
        this.id = id;
        this.momento = momento;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public orderStatus getStatus() {
        return status;
    }

    public void setStatus(orderStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "order{" + "id=" + id + ", momento=" + momento + ", status=" + status + '}';
    }

}
