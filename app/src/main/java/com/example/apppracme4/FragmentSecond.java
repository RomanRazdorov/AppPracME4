package com.example.apppracme4;

import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;
public class FragmentSecond extends Fragment {
    private List<Item> items = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        for (int i = 0; i < 200 ; i++) {
            items.add(new Item("The Beatles", R.drawable.the_beatles));
        }
        ListView listView = view.findViewById(R.id.listView);
        ListAdapter adapter = new ListAdapter(getContext(), R.layout.item_layout, items);
        listView.setAdapter(adapter);


    }
}