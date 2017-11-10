package com.example.android.arrays;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Word adapter class that handles the multiple TextViews and ImageView for the ListView
 */
public class WordAdapter extends ArrayAdapter<Word> {

    /**
     * A custom constructor.
     *
     * @param context is used to inflate the layout file
     * @param words   is the data we want to populate into the lists
     */
    public WordAdapter(Activity context, List<Word> words) {
        // This initialises the ArrayAdapter's internal storage for the context and the list.
        // The second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews the adapter is not
        // going to use this second argument, so it can be any value.
        super(context, 0, words);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position    is the position in the list of data that should be displayed in the list item view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //Get the data item for this position
        Word word = getItem(position);

        //Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.custom_list_view, parent, false);
        }

        //Lookup view for data population
        TextView mainText = (TextView) convertView.findViewById(R.id.mainText);
        TextView subText = (TextView) convertView.findViewById(R.id.subText);
        ImageView iconImage = (ImageView) convertView.findViewById(R.id.imageView);
        LinearLayout iconLayout = (LinearLayout) convertView.findViewById(R.id.iconLayout);

        //Populate the data into the template view using the data object
        mainText.setText(word.getEnglishWord());
        subText.setText(word.getFrenchWord());

        //If statement to check if the list item has an image associated with it
        if (word.hasImage()) {
            //If it does, set the the ImageView to the resource
            iconImage.setImageResource(word.getImageResourceId());
            //Make sure it is visible, as views get recycled
            iconImage.setVisibility(View.VISIBLE);
            iconLayout.setVisibility(View.VISIBLE);
        } else {
            //Hide the view
            iconImage.setVisibility(View.GONE);
            iconLayout.setVisibility(View.GONE);
        }

        //Return the completed view to render on-screen
        return convertView;
    }
}
