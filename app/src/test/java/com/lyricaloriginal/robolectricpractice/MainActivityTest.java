package com.lyricaloriginal.robolectricpractice;

import android.os.Build;
import android.widget.EditText;
import android.widget.TextView;

import static org.junit.Assert.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.hamcrest.CoreMatchers.*;

/**
 * MainActivityのテストコード
 *
 * Created by LyricalMaestro on 2016/02/06.
 */
@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = Build.VERSION_CODES.LOLLIPOP)
public class MainActivityTest {

    @Test
    public void calculateBtn() {
        MainActivity mainActivity = Robolectric.setupActivity(MainActivity.class);
        setValueToEditText(mainActivity, R.id.input_n, "5");
        setValueToEditText(mainActivity, R.id.input_m, "3");

        mainActivity.findViewById(R.id.calculate_btn).performClick();

        TextView resultView = (TextView)mainActivity.findViewById(R.id.result_view);
        assertThat(resultView.getText().toString(), is("5P3 = 60"));
    }

    private void setValueToEditText(MainActivity mainActivity, int viewId, String value) {
        EditText editText = (EditText)mainActivity.findViewById(viewId);
        editText.setText(value);
    }
}
