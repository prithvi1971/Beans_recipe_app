import android.content.Intent;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.beans.MainActivity;

public class falafel extends AppCompatActivity {

    //takes the home button back to the main screen
    public void home ( View view){
        Intent i =new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
