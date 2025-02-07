package b3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class TrungBinhCongTest {

    TrungBinhCong trungBinhCong = new TrungBinhCong();

    @Test
    void tinhTrungBinhDanhSachHopLe() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(3.0, trungBinhCong.tinhTrungBinhCong(numbers));
    }

    @Test
    void tinhTrungBinhMotPhanTu() {
        List<Integer> numbers = Arrays.asList(10);
        assertEquals(10.0, trungBinhCong.tinhTrungBinhCong(numbers));
    }

    @Test
    void tinhTrungBinhDanhSachAmDuong() {
        List<Integer> numbers = Arrays.asList(-10, 20, -5, 15);
        assertEquals(5.0, trungBinhCong.tinhTrungBinhCong(numbers));
    }

    @Test
    void tinhTrungBinhDanhSachRong() {
        List<Integer> numbers = Collections.emptyList();
        Exception exception = assertThrows(ArithmeticException.class, () -> trungBinhCong.tinhTrungBinhCong(numbers));
        assertEquals("Danh sách trống! Không thể chia cho 0.", exception.getMessage());
    }

    @Test
    void tinhTrungBinhDanhSachNull() {
        Exception exception = assertThrows(ArithmeticException.class, () -> trungBinhCong.tinhTrungBinhCong(null));
        assertEquals("Danh sách trống! Không thể chia cho 0.", exception.getMessage());
    }
}
