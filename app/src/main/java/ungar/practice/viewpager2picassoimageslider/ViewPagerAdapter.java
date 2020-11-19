package ungar.practice.viewpager2picassoimageslider;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.squareup.picasso.Picasso;

import java.util.List;

public class ViewPagerAdapter extends RecyclerView.Adapter<ViewPagerAdapter.SliderViewHolder>{

    private List<Integer> sliderItems;
    private Context context;
    private ViewPager2 viewPager2;

    public ViewPagerAdapter(List<Integer> sliderItems, Context context) {
        this.sliderItems = sliderItems;
        this.context = context;
    }

    @NonNull
    @Override
    public SliderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_page, parent, false);
        SliderViewHolder viewHolder = new SliderViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SliderViewHolder holder, int position) {
        Picasso.get()
                .load(sliderItems.get(position))
                .fit()
                .into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return sliderItems.size();
    }

    class SliderViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageView;

        SliderViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.itemPageImage);
        }

    }
}

