import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.beans.R;

public class non_veg extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.non_veg);

    }

    //takes the user to the previous screen
    public void back (View view){
        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);
    }
    //takes the user to home screen
    public void home (View view){
        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);
    }

}
