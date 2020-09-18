package android.example.cookies;

import android.example.cookies.R;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the cookie should be eaten.
     */
    public void eatCookie(View view) {
        // TODO: Find a reference to the ImageView in the layout. Change the image.
        ImageView aftercookieView = (ImageView) findViewById(R.id.before_cookie_image_view);
        aftercookieView.setImageResource(R.drawable.after_cookie);


        // TODO: Find a reference to the TextView in the layout. Change the text.
        TextView doneTextView = (TextView)findViewById(R.id.status_text_view);
        doneTextView.setText("Thanks Momen!");

    }
}