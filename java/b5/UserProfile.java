package b5;

public class UserProfile {

    private String name;

    public UserProfile(String name) {
        this.name = name;
    }

    public String getName() {
        if (name == null) {
            throw new NullPointerException("Tên người dùng không tồn tại!");
        }
        return name;
    }
}
