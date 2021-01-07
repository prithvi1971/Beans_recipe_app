import android.content.Intent;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class vegetarian_page extends AppCompatActivity {
    public void home ( View view){
        Intent i =new Intent(this, MainActivity.class);
        startActivity(i);
    }
    public void back ( View view){
        Intent i =new Intent(this, menue.class);
        startActivity(i);
    }
    public void favorite ( View view){
        Intent i =new Intent(this, favourite.class);
        startActivity(i);
    }
}
