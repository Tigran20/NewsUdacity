package com.alextroy.alextroynewsuda;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Context context, ArrayList<News> list) {
        super(context, 0, list);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        @SuppressLint("ViewHolder") View rootView = LayoutInflater.from(getContext()).inflate(R.layout.news_item, parent, false);

        News currentNews = getItem(position);

        assert currentNews != null;

        TextView titleTextView = rootView.findViewById(R.id.web_title);
        TextView sectionNameTextView = rootView.findViewById(R.id.web_section_name);
        TextView dateTextView = rootView.findViewById(R.id.web_date);
        TextView authorTextView = rootView.findViewById(R.id.web_author);

        String title = String.valueOf(currentNews.getWebTitle());
        String sectionName = String.valueOf(currentNews.getWebSectionName());
        String date = String.valueOf(currentNews.getWebPublicationDate());
        String author = String.valueOf(currentNews.getWebAuthor());

        titleTextView.setText(title);
        sectionNameTextView.setText(sectionName);
        dateTextView.setText(date);
        authorTextView.setText(author);

        return rootView;
    }

}
