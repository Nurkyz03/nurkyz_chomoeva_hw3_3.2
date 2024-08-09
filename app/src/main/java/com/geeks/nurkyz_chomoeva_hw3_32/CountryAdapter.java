package com.geeks.nurkyz_chomoeva_hw3_32;


import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.geeks.nurkyz_chomoeva_hw3_32.databinding.CountryItemBinding;

import java.util.ArrayList;

public class CountryAdapter extends RecyclerView.Adapter<CountryViewHolder> {

    private ArrayList<String> countryList;
    private ArrayList<String> imageList;

    public CountryAdapter(ArrayList<String> carList, ArrayList<String> imageList) {
        this.countryList = carList;
        this.imageList = imageList;
    }

    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CountryViewHolder(CountryItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, int position) {
        holder.onBind(countryList.get(position), imageList.get(position));
    }

    @Override
    public int getItemCount() {
        return countryList.size();
    }
}

