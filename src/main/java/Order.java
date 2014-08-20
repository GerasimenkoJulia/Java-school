/**
 * Created by 1 on 20.08.2014.
 */
import javax.persistence.*;
import java.util.Date;
import java.util.Set;

/**
 * Created by 1 on 20.08.2014.
 */
@Entity
@Table(name = "Orders")
public class Order {
    @Id
    private Integer id;
    @ManyToOne(targetEntity = Truck.class)
    @JoinColumn(name = "truckId")
    private Truck truckId;
    @Column(name = "order_state")
    private String orderState;
    @Column(name = "gps")
    private double gps;
    @Column(name = "loading")
    private String loading;
    @Column(name = "weight")
    private Integer weight;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "orderId")
    private Set<User> users;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "orderId")
    private Set<OrderStatuse> orders;

    public Order() {
    }

    public Order(Integer id, Truck truckId, String orderState, double gps, String loading, Integer weight) {
        this.id = id;
        this.truckId = truckId;
        this.orderState = orderState;
        this.gps = gps;
        this.loading = loading;
        this.weight = weight;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Truck getTruckId() {
        return truckId;
    }

    public void setTruckId(Truck truckId) {
        this.truckId = truckId;
    }

    public String getOrderState() {
        return orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState;
    }

    public double getGps() {
        return gps;
    }

    public void setGps(double gps) {
        this.gps = gps;
    }

    public String getLoading() {
        return loading;
    }

    public void setLoading(String loading) {
        this.loading = loading;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public void setOrders(Set<OrderStatuse> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", truckId=" + truckId +
                ", orderState='" + orderState + '\'' +
                ", gps=" + gps +
                ", loading='" + loading + '\'' +
                ", weight=" + weight +
                '}';
    }
}
