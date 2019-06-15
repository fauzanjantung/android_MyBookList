package com.fauzan.mybooklist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    ImageView mBook;
    TextView mWriter;
    TextView mTitle;
    TextView mDescription;
    TextView mPages;
    TextView mPublished;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        mTitle = findViewById(R.id.tvTitle);
        mBook = findViewById(R.id.ivImage);
        mWriter = findViewById(R.id.tvWriter);
        mDescription = findViewById(R.id.tvDescription);
        mPages = findViewById(R.id.tvPages);
        mPublished = findViewById(R.id.tvPublished);

        Bundle mBundle = getIntent().getExtras();
        if (mBundle != null) {
            mTitle.setText(mBundle.getString("Title"));
            mBook.setImageResource(mBundle.getInt("Image"));
            mWriter.setText(mBundle.getString("Writer"));
            mDescription.setText(mBundle.getString("Description"));
            mPages.setText(mBundle.getString("Pages"));
            mPublished.setText(mBundle.getString("Published"));
        }
    }
}