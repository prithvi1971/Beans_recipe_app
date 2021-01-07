import android.content.Intent;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class favourite extends AppCompatActivity {
    public void back ( View view){
        Intent i =new Intent(this, vegetarian_page.class);
        startActivity(i);
    }
    public void home ( View view){
        Intent i =new Intent(this, menue.class);
        startActivity(i);
    }
}
