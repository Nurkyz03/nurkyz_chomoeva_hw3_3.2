package com.geeks.nurkyz_chomoeva_hw3_32;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.geeks.nurkyz_chomoeva_hw3_32.databinding.CountryItemBinding;

public class CountryViewHolder extends RecyclerView.ViewHolder {

    CountryItemBinding binding;

    public CountryViewHolder(@NonNull CountryItemBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void onBind(String name, String image) {
        binding.tvName.setText(name);

        Glide.with(binding.imgCountry).load(image).into(binding.imgCountry);
    }
}

