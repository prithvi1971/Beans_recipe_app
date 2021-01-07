//Register activity code
//deals with everything that happens on the main activity
//programmed by prithvi
//approved on 02-12-2020
//all files are linked to the main
//inputs are the username, password, and retyped password
//coded in 3 days with bugs fixed
//refrences for the code are java textbook, online android studio study guide and youtube
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.beans.R;

public class register extends AppCompatActivity {
    //initializing the variables
    EditText mTextUsername;
    EditText mTextPassword;
    EditText mTextCnfPassword;
    Button mButtonRegister;
    TextView mTextViewLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        //defining all the variables
        mTextUsername = (EditText) findViewById(R.id.username);
        mTextPassword = (EditText) findViewById(R.id.password);
        mTextCnfPassword = (EditText) findViewById(R.id.password);
        mButtonRegister = (Button) findViewById(R.id.log_in);
        //taking in the click input
        mTextViewLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //making the intent to switch screens when the button is clicked
                Intent LoginIntent = new Intent(register.this,MainActivity.class);
                //initializing the activity
                startActivity(LoginIntent);
            }
        });

    }
}