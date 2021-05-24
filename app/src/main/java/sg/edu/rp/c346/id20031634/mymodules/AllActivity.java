package sg.edu.rp.c346.id20031634.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AllActivity extends AppCompatActivity {
    TextView tvAll;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c346);
        Intent intentReceived = getIntent();
        String modSelected = intentReceived.getStringExtra("Module");
        tvAll=findViewById(R.id.textView);

        if(modSelected.equalsIgnoreCase("C346")){
            tvAll.setText("\n Module Code: C346" +
                    "\nModule Name: Android Programming" +
                    "\nAcademic Year: 2021" + "\nSemester: 1" +
                    "\nModule Credit: 4" +
                    "\nVenue: E62E");
        }
        else if(modSelected.equalsIgnoreCase("C349")){
            tvAll.setText("\n Module Code: C331" +
                    "\nModule Name: iPad Programming " +
                    "\nAcademic Year: 2021" + "\nSemester: 1" +
                    "\nModule Credit: 4" +
                    "\nVenue: E61R");
        }
        else if(modSelected.equalsIgnoreCase("C331")){
            tvAll.setText("\n Module Code: C331" +
                    "\nModule Name: Digital Security and Forensics " +
                    "\nAcademic Year: 2021" + "\nSemester: 1" +
                    "\nModule Credit: 4" +
                    "\nVenue: E61J");
        }
        else if(modSelected.equalsIgnoreCase("C228")){
            tvAll.setText("\n Module Code: C228" +
                    "\nModule Name: Operating Systems Security" +
                    "\nAcademic Year: 2021" + "\nSemester: 1" +
                    "\nModule Credit: 4" +
                    "\nVenue: E62L");
        }
        else if(modSelected.equalsIgnoreCase("C203")){
            tvAll.setText("\n Module Code: C203" +
                    "\nModule Name: Web appIn Development in php " +
                    "\nAcademic Year: 2021" + "\nSemester: 1" +
                    "\nModule Credit: 4" +
                    "\nVenue: W67L");
        }
        else if(modSelected.equalsIgnoreCase("C328")){
            tvAll.setText("\n Module Code: C328" +
                    "\nModule Name: Intelligent Networks " +
                    "\nAcademic Year: 2021" + "\nSemester: 1" +
                    "\nModule Credit: 4" +
                    "\nVenue: E62C");
        }
        button =findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

    }
}