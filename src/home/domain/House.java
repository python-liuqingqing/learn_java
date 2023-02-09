package project.home.domain;

public class House {
    private int id;
    private String name;
    private String phone;
    private String address;
    private int rant;
    private String state;

    public House(int id, String name, String phone, String address, int rant, String state) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.rant = rant;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public int getRant() {
        return rant;
    }

    public String getState() {
        return state;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setRant(int rant) {
        this.rant = rant;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return id +
                "\t\t" + name +
                "\t\t" + phone +
                "\t\t" + address +
                "\t\t" + rant +
                "\t\t" + state;
    }
}
