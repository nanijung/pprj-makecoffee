
package caffe;

public class PayCanceled extends AbstractEvent {

    private Long id;
    private Long orderid;
    private Integer chargeamount;
    private String status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getOrderid() {
        return orderid;
    }

    public void setOrderid(Long orderid) {
        this.orderid = orderid;
    }
    public Integer getChargeamount() {
        return chargeamount;
    }

    public void setChargeamount(Integer chargeamount) {
        this.chargeamount = chargeamount;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
