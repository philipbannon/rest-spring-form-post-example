package pbannon;

public class Welcome {

    private long id;
    private String userName;
    private String userLocation;
    private String userAddressFirstLine;
    private String userAddressSecondLine;

    public Welcome(long userId) {
        this.id = userId;
    }

    // Default Constructor required by Spring
    public Welcome() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAddressSecondLine() {
        return userAddressSecondLine;
    }

    public void setUserAddressSecondLine(String userAddressSecondLine) {
        this.userAddressSecondLine = userAddressSecondLine;
    }

    public String getUserAddressFirstLine() {
        return userAddressFirstLine;
    }

    public void setUserAddressFirstLine(String userAddressLineOne) {
        this.userAddressFirstLine = userAddressLineOne;
    }

    public String getUserLocation() {
        return userLocation;
    }

    public void setUserLocation(String userLocation) {
        this.userLocation = userLocation;
    }
}
