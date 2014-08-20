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
@Table(name = "Trucks")
public class Truck {
    @Id
    private Integer id;
    @Column(name = "reg_number")
    private String regNumber;
    @Column(name = "capacity")
    private Integer capacity;
    @Column(name = "drivers_qty")
    private Integer drivers_qty;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "truckId")
    private Set<Order> orders;

    public Truck() {
    }

    public Truck(Integer id, String regNumber, Integer capacity, Integer drivers_qty) {
        this.id = id;
        this.regNumber = regNumber;
        this.capacity = capacity;
        this.drivers_qty = drivers_qty;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getDrivers_qty() {
        return drivers_qty;
    }

    public void setDrivers_qty(Integer drivers_qty) {
        this.drivers_qty = drivers_qty;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "drivers_qty=" + drivers_qty +
                ", capacity=" + capacity +
                ", id=" + id +
                ", regNumber='" + regNumber + '\'' +
                '}';
    }
}

