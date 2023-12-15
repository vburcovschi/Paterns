package Builder;

public class User {
    private final String ssn; //требуется
    private final String firstName; //требуется
    private final String lastName; //требуется
    private final String phone; //необязательно
    private final String address; //необязательно

    public User(UserBuilder builder) {
        this.ssn = builder.getSsn();
        this.firstName = builder.getFirstName();
        this.lastName = builder.getLastName();
        this.phone = builder.getPhone();
        this.address = builder.getAddress();
    }

    @Override
    public String toString() {
        return "User{" +
                "ssn='" + ssn + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
