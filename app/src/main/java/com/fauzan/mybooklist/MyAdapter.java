package com.fauzan.mybooklist;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<BookViewHolder> {

    private Context mContext;
    private List<BookData> mBookList;

    MyAdapter(Context mContext, List<BookData> mBookList) {
        this.mContext = mContext;
        this.mBookList = mBookList;
    }

    @Override
    public BookViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item_list, parent, false);
        return new BookViewHolder(mView);
    }

    @Override
    public void onBindViewHolder(final BookViewHolder holder, int position) {
        holder.mImage.setImageResource(mBookList.get(position).getBookImage());
        holder.mTitle.setText(mBookList.get(position).getBookName());
        holder.mWriter.setText(mBookList.get(position).getBookWriter());
        holder.mCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(mContext, DetailActivity.class);
                mIntent.putExtra("Title", mBookList.get(holder.getAdapterPosition()).getBookName());
                mIntent.putExtra("Writer", mBookList.get(holder.getAdapterPosition()).getBookWriter());
                mIntent.putExtra("Description", mBookList.get(holder.getAdapterPosition()).getBookDescription());
                mIntent.putExtra("Pages", mBookList.get(holder.getAdapterPosition()).getBookPages());
                mIntent.putExtra("Published", mBookList.get(holder.getAdapterPosition()).getBookPublished());
                mIntent.putExtra("Image", mBookList.get(holder.getAdapterPosition()).getBookImage());
                mContext.startActivity(mIntent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mBookList.size();
    }
}

class BookViewHolder extends RecyclerView.ViewHolder {

    ImageView mImage;
    TextView mTitle;
    TextView mWriter;
    CardView mCardView;

    BookViewHolder(View itemView) {
        super(itemView);
        mImage = itemView.findViewById(R.id.ivImage);
        mTitle = itemView.findViewById(R.id.tvTitle);
        mWriter = itemView.findViewById(R.id.tvWriter);
        mCardView = itemView.findViewById(R.id.cardview);
    }
}
