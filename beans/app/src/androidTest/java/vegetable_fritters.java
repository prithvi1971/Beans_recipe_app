import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.beans.R;

public class vegetable_fritters extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vegetable_fritters);
    }
    //takes the home button back to the main screen
    public void home ( View view){
        Intent i =new Intent(this, MainActivity.class);
        startActivity(i);
    }
    public void back ( View view){
        Intent i =new Intent(this, vegetarian_page.class);
        startActivity(i);
    }
}
