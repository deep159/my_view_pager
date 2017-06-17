package com.example.hi.myviewpager;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ToxicBakery.viewpager.transforms.ScaleInOutTransformer;

public class MainActivity extends AppCompatActivity {
    ViewPager pager;
    TabLayout tabs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pager= (ViewPager) findViewById(R.id.pager);
        tabs= (TabLayout) findViewById(R.id.tabs);
        MyPagerAdapter adapter=new MyPagerAdapter(getSupportFragmentManager());
        adapter.getFragment(new FragmentOne(),"goku1");
        adapter.getFragment(new FragmentTwo(),"goku2");
        adapter.getFragment(new FragmentThree(),"goku3");

        pager.setAdapter(adapter);
        pager.setPageTransformer(true,new ScaleInOutTransformer());
        tabs.setupWithViewPager(pager);
    }
}
