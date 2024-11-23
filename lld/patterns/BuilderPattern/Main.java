package dsalld.lld.patterns.BuilderPattern;

public class Main {
    public static void main(String[] args) {
        User u1 = new User.UserBuilder()
                .setEmail("aymankhan92@gmail.com")
                .setUserId("123456")
                .setUserName("aymanullesh")
                .build();

        System.out.println(u1);
    }
}
