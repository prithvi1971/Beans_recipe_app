//main login activity code
//deals with everything that happens on the main activity
//programmed by prithvi
//approved on 02-12-2020
//all files are linked to the main
//inputs are the username and password
//coded in 2 days with bugs fixed
//refrences for the code are java textbook, online android studio study guide and youtube

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.beans.R;
import com.example.beans.register;

import java.util.logging.Level;

import javax.xml.namespace.QName;

public class MainActivity extends AppCompatActivity {
    Button log_out;
    //initializing the variables we will be using for the login and registration activities
    Button mButtonLogin;
    //initializing the register variable
    TextView mTextViewRegister;
    //initializing the username text
    EditText mTextUsername;
    //initializing the password
    EditText mTextPassword;

    private Object favourite;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //defining the username variable
        mTextUsername = (EditText) findViewById(R.id.username);
        //defining the password variable
        mTextPassword = (EditText) findViewById(R.id.password);
        //defining the login variable
        mButtonLogin = (Button) findViewById(R.id.log_in);
        //defining the register variable
        mTextViewRegister = (Button) findViewById(R.id.register);


    }
//declaring the intention of the click

    //adding the recipe to tho the favourite screen when clicked on
    public void setFavourite(View view){
        if(favourite == "click") {
            int add = 1;
            add++;
            Toast.makeText(getApplicationContext(), "Add to Favourite!", Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(getApplicationContext(), "Incorrect!", Toast.LENGTH_LONG).show();
        }
    }

    private int getTitle(Object favourite) {
        return 0;
    }


}
