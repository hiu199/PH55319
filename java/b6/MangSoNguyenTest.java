package b6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MangSoNguyenTest {

    MangSoNguyen mangSoNguyen = new MangSoNguyen();

    @Test
    void timPhanTuNhoNhatMangHopLe() {
        int[] mang = {10, 2, 30, 4, 1};
        assertEquals(1, mangSoNguyen.timPhanTuNhoNhat(mang));
    }

    @Test
    void timPhanTuNhoNhatMotPhanTu() {
        int[] mang = {7};
        assertEquals(7, mangSoNguyen.timPhanTuNhoNhat(mang));
    }

    @Test
    void timPhanTuNhoNhatMangSoAm() {
        int[] mang = {-5, -10, -3, -1};
        assertEquals(-10, mangSoNguyen.timPhanTuNhoNhat(mang));
    }

    @Test
    void timPhanTuNhoNhatMangRong() {
        int[] mang = {};
        Exception exception = assertThrows(IllegalArgumentException.class, 
                () -> mangSoNguyen.timPhanTuNhoNhat(mang));
        assertEquals("Mảng không được rỗng!", exception.getMessage());
    }

    @Test
    void timPhanTuNhoNhatMangNull() {
        int[] mang = null;
        Exception exception = assertThrows(IllegalArgumentException.class, 
                () -> mangSoNguyen.timPhanTuNhoNhat(mang));
        assertEquals("Mảng không được rỗng!", exception.getMessage());
    }
}
