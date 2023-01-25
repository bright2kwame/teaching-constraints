package mobile.bright.mest_ecommerce.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import mobile.bright.mest_ecommerce.R;

public class HomeFeedViewHolder extends RecyclerView.ViewHolder {

    private TextView textViewTitle;
    private ImageView imageView;

    public HomeFeedViewHolder(@NonNull View itemView) {
        super(itemView);
        /**
         * these views are obtained from the layout you created
         */
        textViewTitle = itemView.findViewById(R.id.textViewTitle);
        imageView = itemView.findViewById(R.id.imageViewContent);
    }


    public TextView getTextViewTitle() {
        return textViewTitle;
    }

    public ImageView getImageView() {
        return imageView;
    }

    public void setTextViewTitle(TextView textViewTitle) {
        this.textViewTitle = textViewTitle;
    }

    public void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }
}
