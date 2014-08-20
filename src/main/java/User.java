/**
 * Created by 1 on 20.08.2014.
 */
import javax.persistence.*;
import java.util.Date;

/**
 * Created by 1 on 20.08.2014.
 */

@Entity
@Table(name = "Users")
public class User {
    @Id
    private Integer id;
    @Column(name = "full_name")
    private String fullName;
    @Column(name = "license")
    private Integer license;
    @Column(name = "driver_state")
    private String driverState;
    @ManyToOne(targetEntity = Order.class)
    @JoinColumn(name = "orderId")
    private Order orderId;
    @Column(name = "pwd")
    private Integer password;
    @Column(name = "isManager")
    private boolean isManager;

    public User() {
    }

    public User(Integer id, boolean isManager, Integer password, Order orderId, String driverState, Integer license, String fullName) {
        this.id = id;
        this.isManager = isManager;
        this.password = password;
        this.orderId = orderId;
        this.driverState = driverState;
        this.license = license;
        this.fullName = fullName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getLicense() {
        return license;
    }

    public void setLicense(Integer license) {
        this.license = license;
    }

    public String getDriverState() {
        return driverState;
    }

    public void setDriverState(String driverState) {
        this.driverState = driverState;
    }

    public Order getOrderId() {
        return orderId;
    }

    public void setOrderId(Order orderId) {
        this.orderId = orderId;
    }

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

    public boolean isManager() {
        return isManager;
    }

    public void setManager(boolean isManager) {
        this.isManager = isManager;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", license=" + license +
                ", driverState='" + driverState + '\'' +
                ", orderId=" + orderId +
                ", password=" + password +
                ", isManager=" + isManager +
                '}';
    }
}

