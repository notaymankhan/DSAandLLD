package dsalld.lld.patterns.BuilderPattern;

public class User {
    private final String userName;
    private final String userId;

    private final String email;

    public User(UserBuilder builder){
        this.userName = builder.userName;
        this.userId = builder.userId;
        this.email = builder.email;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserId() {
        return userId;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return this.email +":"+ this.userId +":"+ this.userName;
    }

    static class UserBuilder{
        private String userName;
        private String userId;

        private String email;

        public User build(){
            return new User(this);
        }

        public UserBuilder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public UserBuilder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;
        }



    }
}
