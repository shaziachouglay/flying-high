package starter.navigation;

public class FrequentTraveller {
    public String uniqueUser;
    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getCountry() {
        return country;
    }

    private String password;
    private String firstName;

    public FrequentTraveller( String uniqueUserName,String password, String firstName, String lastName, String address, String country) {
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.country = country;
        this.uniqueUserName = uniqueUserName;
    }

    private String lastName;
    private String address;
    private String country;

    public String getUniqueUserName() {

        return uniqueUser = uniqueUserName+System.currentTimeMillis();
    }

    private final String uniqueUserName;

}
