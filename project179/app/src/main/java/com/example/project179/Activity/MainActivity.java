package com.example.project179.Activity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ArrayAdapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project179.Adapter.ItemsAdapter;
import com.example.project179.Domain.PropertyDomain;
import com.example.project179.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    private RecyclerView.Adapter adapterRecommeneded, adapterNearby;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        initLocation();
        initList();

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

    }

    private void initList() {
        ArrayList<PropertyDomain> items = new ArrayList<>();
        items.add(new PropertyDomain("Apartment", "Royal Apartment", "LosAngles LA", "house_1", 1500, 2, 3, 350, true, 4.5, "Esta casa de 2 dormitorios/1 baño cuenta con un enorme plan de vida abierto, acentuado por sorprendentes características arquitectónicas y acabados de alta gama. Siéntase inspirado por las líneas de visión abiertas que abrazan el exterior, coronadas por impresionantes techos artesonados. "));
        items.add(new PropertyDomain("Casa", "House with Great View", "Newyork NY", "house_2", 800, 1, 2, 500, false, 4.9, "Esta casa de 2 dormitorios/1 baño cuenta con un enorme plan de vida abierto, acentuado por sorprendentes características arquitectónicas y acabados de alta gama. Siéntase inspirado por las líneas de visión abiertas que abrazan el exterior, coronadas por impresionantes techos artesonados. "));
        items.add(new PropertyDomain("Villa", "Royal Villa", "LosAngles La", "house_3", 999, 2, 1, 400, true, 4.7, "Esta casa de 2 dormitorios/1 baño cuenta con un enorme plan de vida abierto, acentuado por sorprendentes características arquitectónicas y acabados de alta gama. Siéntase inspirado por las líneas de visión abiertas que abrazan el exterior, coronadas por impresionantes techos artesonados."));
        items.add(new PropertyDomain("House", "Hermosa house", "Newyork NY", "house_4", 1750, 3, 2, 1100, true, 4.3, "Esta casa de 2 dormitorios/1 baño cuenta con un enorme plan de vida abierto, acentuado por sorprendentes características arquitectónicas y acabados de alta gama. Siéntase inspirado por las líneas de visión abiertas que abrazan el exterior, coronadas por impresionantes techos artesonados."));

        binding.recommendedView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        binding.recommendedView.setAdapter(new ItemsAdapter(items));


        ArrayList<PropertyDomain> itemsNear = new ArrayList<>();
        itemsNear.add(new PropertyDomain("House", "Hermosa house", "Newyork NY", "house_4", 1750, 3, 2, 1100, true, 4.3, "Esta casa de 2 dormitorios/1 baño cuenta con un enorme plan de vida abierto, acentuado por sorprendentes características arquitectónicas y acabados de alta gama. Siéntete inspirado por las líneas de visión abiertas que abrazan el aire libre, coronadas por impresionantes techos artesonados. "));
        itemsNear.add(new PropertyDomain("Villa", "Royal Villa", "LosAngles La", "house_3", 999, 2, 1, 400, true, 4.7, "Esta casa de 2 dormitorios/1 baño cuenta con un enorme plan de vida abierto, acentuado por sorprendentes características arquitectónicas y acabados de alta gama. Siéntete inspirado por las líneas de visión abiertas que abrazan el aire libre, coronadas por impresionantes techos artesonados."));
        itemsNear.add(new PropertyDomain("House", "House hermosa vistaw", "Newyork NY", "house_2", 800, 1, 2, 500, false, 4.9, "Esta casa de 2 dormitorios/1 baño cuenta con un enorme plan de vida abierto, acentuado por sorprendentes características arquitectónicas y acabados de alta gama. Siéntete inspirado por las líneas de visión abiertas que abrazan el aire libre, coronadas por impresionantes techos artesonados."));
        itemsNear.add(new PropertyDomain("Depa", "Royal Apartment", "LosAngles LA", "house_1", 1500, 2, 3, 350, true, 4.5, "Esta casa de 2 dormitorios/1 baño cuenta con un enorme plan de vida abierto, acentuado por sorprendentes características arquitectónicas y acabados de alta gama. Siéntete inspirado por las líneas de visión abiertas que abrazan el aire libre, coronadas por impresionantes techos artesonados."));

        binding.nearView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        binding.nearView.setAdapter(new ItemsAdapter(itemsNear));
    }

    private void initLocation() {
        String[] items = new String[]{"Ags UAA, mx", "UAA, ags"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, items);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        binding.locationSpin.setAdapter(adapter);
    }
}