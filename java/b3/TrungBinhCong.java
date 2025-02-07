package b3;

import java.util.List;

public class TrungBinhCong {


    public double tinhTrungBinhCong(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new ArithmeticException("Danh sách trống! Không thể chia cho 0.");
        }

        int tong = numbers.stream().mapToInt(Integer::intValue).sum();
        return (double) tong / numbers.size();
    }
}
