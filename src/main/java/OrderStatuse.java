/**
 * Created by 1 on 20.08.2014.
 */
import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by 1 on 20.08.2014.
 */
@Entity
@Table(name="Orders_Statuses",
        uniqueConstraints = @UniqueConstraint(columnNames = {"orderId", "state"}))
public class OrderStatuse {
    @Id
    private Integer id;
    @ManyToOne(targetEntity = Order.class)
    @JoinColumn(name = "orderId")
    private Order orderId;
    @Column(name = "state")
    private String state;
    @Column(name = "time")
    private Timestamp time;

    public OrderStatuse() {
    }

    public OrderStatuse(Integer id, Order orderId, String state, Timestamp time) {
        this.id = id;
        this.orderId = orderId;
        this.state = state;
        this.time = time;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Order getOrderId() {
        return orderId;
    }

    public void setOrderId(Order orderId) {
        this.orderId = orderId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "OrderStatuse{" +
                "id=" + id +
                ", orderId=" + orderId +
                ", state='" + state + '\'' +
                ", time=" + time +
                '}';
    }
}