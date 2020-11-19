package ungar.mvp.viewpager2picassoimageslider;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import me.relex.circleindicator.CircleIndicator3;

public class MainActivity extends AppCompatActivity {

    List<Integer> sliderItems = new ArrayList<>();
    private ViewPager2 viewPager2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sliderItems.add(R.drawable.vp1);
        sliderItems.add(R.drawable.vp2);
        sliderItems.add(R.drawable.vp3);
        sliderItems.add(R.drawable.vp4);

        viewPager2 = findViewById(R.id.view_pager2);
        viewPager2.setAdapter(new ViewPagerAdapter(sliderItems, this));

        //https://github.com/ongakuer/CircleIndicator
        CircleIndicator3 indicator = findViewById(R.id.indicator);
        indicator.setViewPager(viewPager2);

    }
}