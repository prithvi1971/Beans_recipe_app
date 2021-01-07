//menu activity code
//deals with everything that happens on the main activity
//programmed by Prithvi
//approved on 02-12-2020
//all files are linked to the main
//there are no inputs other than user clicking the buttons
//coded in 1 days with bugs fixed
//refrences for the code are java textbook, online android studio study guide and youtube
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.beans.R;
import com.example.beans.register;

public class menue extends AppCompatActivity {
    Button log_out;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menue);
    }
    public void onClick (View view){
        Intent logoutIntent = new Intent(menue.this, MainActivity.class);
        startActivity(logoutIntent);

    }


    }


