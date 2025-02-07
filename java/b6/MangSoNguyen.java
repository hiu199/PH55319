package b6;

import java.util.Arrays;

public class MangSoNguyen {

    public int timPhanTuNhoNhat(int[] mang) {
        if (mang == null || mang.length == 0) {
            throw new IllegalArgumentException("Mảng không được rỗng!");
        }
        return Arrays.stream(mang).min().orElseThrow();
    }
}
