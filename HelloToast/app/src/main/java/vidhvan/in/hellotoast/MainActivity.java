package vidhvan.in.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView count_text_view;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        count_text_view = findViewById(R.id.count_tv);
    }

    public void showToast(View view)
    {
        Toast.makeText(this, "Hello, Pavan", Toast.LENGTH_SHORT).show();
    }

    public void showCount(View view)
    {
        count++;
        count_text_view.setText(String.valueOf(count));
    }

    public void decreaseCount(View view)
    {
        count--;
        count_text_view.setText(String.valueOf(count));
    }
}