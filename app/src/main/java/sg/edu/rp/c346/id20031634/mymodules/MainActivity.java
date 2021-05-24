package sg.edu.rp.c346.id20031634.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvC346, tvC349,tvC331,tvC228,tvC328,tvC203;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvC346 = findViewById(R.id.textViewC346);
        tvC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AllActivity.class);
                intent.putExtra("Module", "C346");
                startActivity(intent);
            }
        });
        tvC349 = findViewById(R.id.textViewC349);
        tvC349.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AllActivity.class);
                intent.putExtra("Module", "C349");
                startActivity(intent);
            }
        });
        tvC331 = findViewById(R.id.textViewC331);
        tvC331.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AllActivity.class);
                intent.putExtra("Module", "C331");
                startActivity(intent);
            }
        });
        tvC328 = findViewById(R.id.textViewC328);
        tvC328.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AllActivity.class);
                intent.putExtra("Module", "C328");
                startActivity(intent);
            }
        });
        tvC228 = findViewById(R.id.textViewC228);
        tvC228.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AllActivity.class);
                intent.putExtra("Module", "C228");
                startActivity(intent);
            }
        });
        tvC203 = findViewById(R.id.textViewC203);
        tvC203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AllActivity.class);
                intent.putExtra("Module", "C203");
                startActivity(intent);
            }
        });


    }
}