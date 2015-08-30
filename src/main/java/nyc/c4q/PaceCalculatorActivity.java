package nyc.c4q;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PaceCalculatorActivity extends FragmentActivity {

    EditText inputDistance;
    EditText inputTimeMin;
    EditText inputTimeSec;
    EditText inputPaceMin;
    EditText inputPaceSec;
    Button buttonCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pace_calculator);

        inputDistance = (EditText) findViewById(R.id.input_distance);
        inputTimeMin = (EditText) findViewById(R.id.input_time_min);
        inputTimeSec = (EditText) findViewById(R.id.input_time_sec);
        inputPaceMin = (EditText) findViewById(R.id.input_pace_min);
        inputPaceSec = (EditText) findViewById(R.id.input_pace_sec);
        buttonCalculate = (Button) findViewById(R.id.button_calculate);

        inputTimeMin.setText("40");
        inputTimeSec.setText("00");
        inputPaceMin.setText("8");
        inputPaceSec.setText("20");

    }

    public void calculateDistance(View view) {
        inputDistance.setText("4.8");
        inputTimeMin.setText("109 10");
        inputTimeSec.setText("00");
        inputPaceMin.setText("7");
        inputPaceSec.setText("32");
    }

}
