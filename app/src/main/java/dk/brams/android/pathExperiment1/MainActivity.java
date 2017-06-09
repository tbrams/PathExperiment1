package dk.brams.android.pathExperiment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    CustomDrawable mCustomDrawableView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mCustomDrawableView = new CustomDrawable(this);
        setContentView(mCustomDrawableView);

    }
}
