package tws.entity;

public class Package {
    private String  trackingNumber;
    private String  addressee;
    private  String telephone;
    private String weight;

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public String getAddressee() {
        return addressee;
    }

    public void setAddressee(String addressee) {
        this.addressee = addressee;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Package() {
    }

    public Package(String trackingNumber, String addressee, String telephone, String weight) {
        this.trackingNumber = trackingNumber;
        this.addressee = addressee;
        this.telephone = telephone;
        this.weight = weight;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
}
