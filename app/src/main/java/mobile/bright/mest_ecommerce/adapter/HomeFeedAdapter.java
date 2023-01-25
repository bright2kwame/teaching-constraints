package mobile.bright.mest_ecommerce.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import mobile.bright.mest_ecommerce.R;
import mobile.bright.mest_ecommerce.item.HomeFeed;

public class HomeFeedAdapter extends RecyclerView.Adapter<HomeFeedViewHolder> {

    private final Context context;
    private final List<HomeFeed> data;

    public HomeFeedAdapter(Context context, List<HomeFeed> data) {
        /**
         * created to receive list and context from the calling activity
         */
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public HomeFeedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        /**
         * View from your layout is inflated here
         */
        View view = LayoutInflater.from(context).inflate(R.layout.home_feed_item, parent, false);
        return new HomeFeedViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeFeedViewHolder holder, int position) {
        /**
         * retrieve the data from the list that was provided and set it in the views,
         * the position returns the current location of the view
         */
        HomeFeed homeFeed = data.get(position);
        holder.getTextViewTitle().setText(homeFeed.getTittle());
        holder.getImageView().setImageResource(homeFeed.getImageResource());
    }

    @Override
    public int getItemCount() {
        /**
         * the number of items for the recycler view to display
         */
        return data.size();
    }
}
