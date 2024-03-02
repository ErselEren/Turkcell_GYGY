package shoppingAPI.demo.entity;

public class Order {
    private String id;
    private String Date;
    private String AddressID;
    private String State;
    private String UserID;

    public Order() {
    }

    public Order(String id, String Date, String AddressID, String State, String UserID) {
        this.id = id;
        this.Date = Date;
        this.AddressID = AddressID;
        this.State = State;
        this.UserID = UserID;
    }

    public String getID() {
        return id;
    }

    public void setID(String id) {
        this.id = id;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getAddressID() {
        return AddressID;
    }

    public void setAddressID(String addressID) {
        AddressID = addressID;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String userID) {
        UserID = userID;
    }
}
