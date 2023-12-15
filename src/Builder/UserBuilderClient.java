package Builder;

public class UserBuilderClient {
    public static void main(String[] args) {
        User user = new UserBuilder("553388", "Mina", "Rashidi")
                .address("Stockholm")
                .phone("12345")
                .build();
        System.out.println(user);
    }
}
