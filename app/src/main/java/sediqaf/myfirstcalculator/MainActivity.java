package sediqaf.myfirstcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText Number1, Number2;
    Button plus, minus, division, multiply;
    TextView Answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Number1 = (EditText) findViewById(R.id.number1);
        Number2 = (EditText) findViewById(R.id.number2);

        plus = (Button) findViewById(R.id.plus);
        minus = (Button) findViewById(R.id.minus);
        division = (Button) findViewById(R.id.division);
        multiply = (Button) findViewById(R.id.multiply);

        Answer = (TextView) findViewById(R.id.result);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Number1 = MainActivity.this.Number1.getText().toString();
                String Number2 = MainActivity.this.Number2.getText().toString();

                if(Number1.isEmpty() || Number2.isEmpty())
                    return;
                Float Number1AsFloat = Float.valueOf(Number1);
                Float Number2AsFloat = Float.valueOf(Number2);

                Float res = Number1AsFloat + Number2AsFloat;

                Answer.setText(res.toString());
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Number1 = MainActivity.this.Number1.getText().toString();
                String Number2 = MainActivity.this.Number2.getText().toString();

                if(Number1.isEmpty() || Number2.isEmpty())
                    return;
                Float Number1AsFloat = Float.valueOf(Number1);
                Float Number2AsFloat = Float.valueOf(Number2);

                Float res = Number1AsFloat - Number2AsFloat;

                Answer.setText(res.toString());

            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Number1 = MainActivity.this.Number1.getText().toString();
                String Number2 = MainActivity.this.Number2.getText().toString();

                if(Number1.isEmpty() || Number2.isEmpty())
                    return;
                Float Number1AsFloat = Float.valueOf(Number1);
                Float Number2AsFloat = Float.valueOf(Number2);

                Float res = Number1AsFloat / Number2AsFloat;

                Answer.setText(res.toString());

            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Number1 = MainActivity.this.Number1.getText().toString();
                String Number2 = MainActivity.this.Number2.getText().toString();

                if(Number1.isEmpty() || Number2.isEmpty())
                    return;
                Float Number1AsFloat = Float.valueOf(Number1);
                Float Number2AsFloat = Float.valueOf(Number2);

                Float res = Number1AsFloat * Number2AsFloat;

                Answer.setText(res.toString());

            }
        });

    }
}