import android.content.Intent;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class shrimp_linguinie extends AppCompatActivity {

    //takes the home button back to the main screen
    //takes the home button back to the main screen
    public void home ( View view){
        Intent i =new Intent(this, MainActivity.class);
        startActivity(i);
    }
    public void back ( View view){
        Intent i =new Intent(this, vegetarian_page.class);
        startActivity(i);
    }
    public void favourite ( View view){
        Intent i =new Intent(this, vegetarian_page.class);
        startActivity(i);
    }
}
