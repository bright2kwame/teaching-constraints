package mobile.bright.mest_ecommerce;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import mobile.bright.mest_ecommerce.adapter.HomeFeedAdapter;
import mobile.bright.mest_ecommerce.item.HomeFeed;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        //find the view that is in your activity
        RecyclerView recyclerViewHomeFeed = findViewById(R.id.recyclerViewHomeFeed);
        //create an instance of the manager, in this case a linearlayout manager
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(Home.this, LinearLayoutManager.VERTICAL, false);
        recyclerViewHomeFeed.setLayoutManager(linearLayoutManager);

        //sample data t parse to the adapter
        HomeFeed homeFeed = new HomeFeed("First Lady", R.drawable.lady);
        HomeFeed homeFeed1 = new HomeFeed("Second Lady", R.drawable.lady_two);
        List<HomeFeed> data = new ArrayList<>();
        data.add(homeFeed);
        data.add(homeFeed1);
        data.add(homeFeed);
        data.add(homeFeed1);
        //an instance of the adapter class that we created
        HomeFeedAdapter homeFeedAdapter = new HomeFeedAdapter(Home.this,data);
        //set the view to the adapter instance created above
        recyclerViewHomeFeed.setAdapter(homeFeedAdapter);

    }
}