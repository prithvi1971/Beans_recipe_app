import android.content.Intent;
import android.view.View;
import android.view.WindowAnimationFrameStats;

import androidx.appcompat.app.AppCompatActivity;

import com.example.beans.register;

public class shepherds_pie extends AppCompatActivity {

    //takes the home button back to the main screen
    public void home ( View view){
        Intent i =new Intent(this, MainActivity.class);
        startActivity(i);
    }
    public void back ( View view){
        Intent i =new Intent(this, vegetarian_page.class);
        startActivity(i);
    }
    public void favorite ( View view){
        Intent i =new Intent(this, favourite.class);
        startActivity(i);
    }
}
