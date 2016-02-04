package com.lyricaloriginal.robolectricpractice;

/**
 * 複雑な数式の計算を行うクラスです。
 * <p/>
 * Created by LyricalMaestro on 2016/02/04.
 */
public class Calculator {

    public static int permutation(int n, int m) {
        if (n < 0) {
            throw new IllegalArgumentException("第一引数nは0以上の整数を指定してください。");
        } else if (m < 0) {
            throw new IllegalArgumentException("第二引数mは0以上の整数を指定してください。");
        } else if (n < m) {
            throw new IllegalArgumentException("第二引数mは第一引数n以下の値を指定してください。");
        } else if (n == 0) {
            return 1;
        }

        int result = 1;
        for (int i = 0; i < m; i++) {
            result *= n - i;
        }
        return result;
    }
}
