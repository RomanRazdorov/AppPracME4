package com.example.apppracme4;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FragmentThird extends Fragment {
    private List<Item> items = new ArrayList<>();
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_third, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        RecyclerViewAdapter.MyOnItemClickListener listener = new RecyclerViewAdapter.MyOnItemClickListener() {
            @Override
            public void onClick(Item item, int position) {
                Log.i("RecyclerView", "Selected item " + position);
                Toast.makeText(getContext(), "Selected item " + position, Toast.LENGTH_SHORT).show();
            }
        };
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        for (int i = 0; i < 200; i++) {
            items.add(new Item("Linkin park", R.drawable.linkin_park));
        }

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(items, listener);
        recyclerView.setAdapter(adapter);

    }
}
