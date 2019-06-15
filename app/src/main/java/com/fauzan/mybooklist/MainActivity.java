package com.fauzan.mybooklist;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity{

    RecyclerView mRecyclerView;
    List<BookData> mBookList;
    BookData mBookData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recyclerview);
//        GridLayoutManager mGridLayoutManager = new GridLayoutManager(MainActivity.this, 2);
//        mRecyclerView.setLayoutManager(mGridLayoutManager);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));

        mBookList = new ArrayList<>();
        mBookData = new BookData("The Book Thief", "Markus Zusak", getString(R.string.bookthief), "552 pages", "March 14th 2006 by Alfred A. Knopf",
                R.drawable.bookthief);
        mBookList.add(mBookData);

        mBookData = new BookData("Think and Grow Rich ", "Napoleon Hill" , getString(R.string.think),"233 pages", "April 2016 (first published 1937) ",
                R.drawable.think);
        mBookList.add(mBookData);

        mBookData = new BookData("Bumi Manusia", "Pramoedya Ananta Toer", getString(R.string.bumimanusia),"535 pages", "2005 by Lentera Dipantara",
                R.drawable.bumimanusia);
        mBookList.add(mBookData);

        mBookData = new BookData("Aku Ini Binatang Jalang ", "Chairil Anwar", getString(R.string.jalang),"111 pages", "September 2002 by PT. Gramedia Pustaka Utama",
                R.drawable.jalang);
        mBookList.add(mBookData);

        mBookData = new BookData("Hit Refresh", "Satya Nadella", getString(R.string.hit),"273 pages", "November 15th 2017 by Harper Business ",
                R.drawable.hit);
        mBookList.add(mBookData);

        mBookData = new BookData("Me Before You", "Jojo Moyes", getString(R.string.jojo),"369 pages", "July 30th 2013 by Penguin Books",
                R.drawable.jojo);
        mBookList.add(mBookData);

        mBookData = new BookData("Memories, Dreams, Reflections", "Carl Jung", getString(R.string.jung),"430 pages", "April 1989 by Vintage",
                R.drawable.jung);
        mBookList.add(mBookData);

        mBookData = new BookData("Fihi Ma Fihi", "Jalāl ad-Dīn Rūmī", getString(R.string.rumi),"530 pages", "2018 by Forum ",
                R.drawable.rumi);
        mBookList.add(mBookData);

        mBookData = new BookData("Norwegian Wood", "Haruki Murakami", getString(R.string.norwegian),"296 pages", "September 12th 2000 by Vintage Books",
                R.drawable.norwegian);
        mBookList.add(mBookData);

        mBookData = new BookData("Siddhartha", "Hermann Hesse", getString(R.string.siddharta),"152 pages", "December 1st 1981 by Bantam Books",
                R.drawable.siddharta);
        mBookList.add(mBookData);

        MyAdapter myAdapter = new MyAdapter(MainActivity.this, mBookList);
        mRecyclerView.setAdapter(myAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_list:
                showRecyclerList();
                break;
            case R.id.action_grid:
                showRecyclerGrid();
                break;
        }
        return super.onOptionsItemSelected(item);
    }


    private void showRecyclerGrid(){
    GridLayoutManager mGridLayoutManager = new GridLayoutManager(MainActivity.this, 2);
    mRecyclerView.setLayoutManager(mGridLayoutManager);
        GridAdapter gridAdapter = new GridAdapter(MainActivity.this, mBookList);
        mRecyclerView.setAdapter(gridAdapter);
    }

    private void showRecyclerList(){
        mRecyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        MyAdapter myAdapter = new MyAdapter(MainActivity.this, mBookList);
        mRecyclerView.setAdapter(myAdapter);
    }

}
