package net.fengg.unregularbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RadioButton rb_bottom_left = (RadioButton) findViewById(R.id.rb_bottom_left);
        final RadioButton rb_bottom_right = (RadioButton) findViewById(R.id.rb_bottom_right);

        rb_bottom_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rb_bottom_left.setChecked(true);
                rb_bottom_right.setChecked(false);
            }
        });
        rb_bottom_right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rb_bottom_left.setChecked(false);
                rb_bottom_right.setChecked(true);
            }
        });
    }
}
