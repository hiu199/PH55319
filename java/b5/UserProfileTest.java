package b5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserProfileTest {

    @Test
    void testGetNameWithValidProfile() {
        UserProfile profile = new UserProfile("Nguyen Van A");
        assertEquals("Nguyen Van A", profile.getName());
    }

    @Test
    void testGetNameWithNullName() {
        UserProfile profile = new UserProfile(null);
        Exception exception = assertThrows(NullPointerException.class, profile::getName);
        assertEquals("Tên người dùng không tồn tại!", exception.getMessage());
    }

    @Test
    void testGetNameWithNullProfile() {
        UserProfile profile = null;
        assertThrows(NullPointerException.class, () -> {
            if (profile == null) {
                throw new NullPointerException("Hồ sơ không tồn tại!");
            }
            profile.getName();
        });
    }
}
