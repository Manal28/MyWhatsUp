package com.example.mywhatsup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.view.MenuInflater;
import android.view.View;
import android.widget.FrameLayout;


import android.os.Bundle;
import android.view.Menu;
import android.widget.ImageButton;
import android.widget.PopupMenu;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {


    com.google.android.material.tabs.TabLayout myTabLayout;
    ViewPager myViewPager;
    ImageButton more;
    FloatingActionButton fab;

    FragmentStatePagerAdapter viewPageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      initViews();
      fab.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {

              viewPageAdapter.getItem(2);
          }
      });
        more.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

             showPopUp(v);
            }
        });

        viewPageAdapter = new FragmentStatePagerAdapter(getSupportFragmentManager()) {
            @NonNull
            @Override
            public Fragment getItem(int position) {
                switch (position) {

                    case 1:
                        return new FragmantCalls();
                    default:
                        return new FragmantChat();
                }
            }

            @Override
            public int getCount() {
                return 2;
            }
        };

        myViewPager.setAdapter(viewPageAdapter);
        myTabLayout.setupWithViewPager(myViewPager);
    }

 public void showPopUp (View v){

     PopupMenu popup =new PopupMenu(this,v) ;
     MenuInflater inflater=popup.getMenuInflater();
     inflater.inflate(R.menu.more_menu,popup.getMenu());
     popup.show();

 }
 public  void initViews (){
     myTabLayout = findViewById(R.id.tab_id);
     myViewPager = (ViewPager) (findViewById(R.id.view_pager));
     more = (ImageButton)findViewById(R.id.more_id);
     fab=(FloatingActionButton)findViewById(R.id.fab_id);
 }
}