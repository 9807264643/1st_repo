package veiw.com.recyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    //logt type
    private static final String TAG = "MainActivity";

    //variable
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrl = new ArrayList<>();





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: started.");

        initImageBitmaps();

    }
      // for another activity
//    public void anotherActivity(View view){
//       TextView textView = findViewById(R.id.recycler_view);
//       String activity = textView.getText().toString();
//       Intent intent = new Intent(this,NepalPics.class);
//      intent.putExtra("EXTRA_MESSAGE",activity);
//      startActivity(intent);
//
//    }

    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrl.add("https://i.redd.it/tpsnoz5bzo501.jpg");
        mNames.add("Nepal");

        mImageUrl.add("https://i.redd.it/qn7f9oqu7o501.jpg");
       mNames.add("USA");

//        mImageUrl.add("https://i.redd.it/j6myfqg1up501.jpg");
//        mNames.add("Austerl");

        mImageUrl.add("https://i.redd.it/0h2gm1ix6p501.jpg");
        mNames.add("Canada");
//
//        mImageUrl.add("https://i.redd.it/");
//        mNames.add("");
//
//        mImageUrl.add("https://i.redd.it/");
//        mNames.add("");
//
//        mImageUrl.add("https://i.redd.it/");
//        mNames.add("");
//
//        mImageUrl.add("https://i.redd.it/");
//        mNames.add("");
//
//        mImageUrl.add("https://i.redd.it/");
//        mNames.add("");
//
//        mImageUrl.add("https://i.redd.it/");
//        mNames.add("");

        initRecyclerView();
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recycleview.");
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNames, mImageUrl);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));



    }
}
