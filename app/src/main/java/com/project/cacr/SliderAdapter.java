package com.project.cacr;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SliderAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapter(Context context) {
        this.context = context;
    }

    public String[] slide_descs = {

        "Apparently we had reached a great height in the atmosphere, for the sky was a dead black, and the stars had ceased to twinkle.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam pretium blandit ipsum, sit amet euismod lectus dapibus faucibus.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam pretium blandit ipsum, sit amet euismod lectus dapibus faucibus."

    };

    @Override
    public int getCount() {
        return slide_descs.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == (RelativeLayout)object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
//        return super.instantiateItem(container, position);
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout, container, false);

        TextView slideDesc = (TextView) view.findViewById(R.id.slide_desc);

        slideDesc.setText(slide_descs[position]);

        container.addView(view);

        return view;

    }

    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((RelativeLayout)object);
    }

}
