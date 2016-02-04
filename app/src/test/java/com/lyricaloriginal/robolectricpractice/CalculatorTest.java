package com.lyricaloriginal.robolectricpractice;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * 今回は順序(Permutation。n_P_mの値。)を計算するメソッドのテストクラスです。
 * <p/>
 * Created by LyricalMaestro on 2016/02/04.
 */
//@RunWith(RobolectricGradleTestRunner.class)
//@Config(constants = BuildConfig.class, sdk = Build.VERSION_CODES.LOLLIPOP)
public class CalculatorTest {

    @Test
    public void permutation_4_2() {
        assertThat(Calculator.permutation(4, 2), is(12));
    }

    @Test
    public void permutation_5_0() {
        assertThat(Calculator.permutation(5, 0), is(1));
    }

    @Test
    public void permutation_6_1() {
        assertThat(Calculator.permutation(6, 1), is(6));
    }

    @Test(expected = IllegalArgumentException.class)
    public void permutation_4_6() {
        Calculator.permutation(4, 6);
    }

    @Test
    public void permutation_0_0() {
        assertThat(Calculator.permutation(0, 0), is(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void permutation_4_negative1() {
        Calculator.permutation(4, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void permutation_negative1_negative3() {
        Calculator.permutation(-1, -3);
    }
}
