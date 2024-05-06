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
        items.add(new PropertyDomain("Camioneta", "NISSAN KICKS", "LosAngles LA", "car_1", 105000, 6, 6, 350, true, 4.5, "1) 2 años de seguro gratis aplica para el modelo KICKS 2023 en todas sus versiones, en operaciones de crédito. Únicamente con aseguradoras participantes. Consulta especificaciones con tu Distribuidor Autorizado Nissan®. Después de 2 años de seguro gratis, el cliente deberá contratar un seguro conforme a lo estipulado en su contrato de crédito.  \n" +
                "\n" +
                "2) El 0% de comisión por apertura aplica para el modelo KICKS 2023 en todas sus versiones, en Crédito Nissan en todos los plazos.  \n" +
                "\n" +
                "3) El bono de $15,000 M.N (con IVA) aplica sobre el precio de lista del vehículo en operaciones de crédito para el modelo KICKS 2023 en todas sus versiones, y aplica exclusivamente en plan Crédito Nissan.  \n" +
                "\n" +
                "4) La mensualidad desde $4,099.00 M.N. aplica únicamente con el plan “Selectiviti“ para el modelo KICKS 2023 versión ADVANCE 1.6 LTS MT’23, con un enganche desde 42.5%, a un plazo de 36 meses. . Esta oferta no incluye el costo del seguro, mismo que podrá ser cubierto de contado o financiado, conforme a lo estipulado en su contrato. "));
        items.add(new PropertyDomain("Auto", "NISSAN VERSA", "Newyork NY", "car_2", 95000, 4, 4, 500, false, 4.9, "1) 2 años de seguro gratis aplica para el modelo VERSA 2024 en todas sus versiones, en operaciones de crédito. Únicamente con aseguradoras participantes. Consulta especificaciones con tu Distribuidor Autorizado Nissan®. Después de 2 años de seguro gratis, el cliente deberá contratar un seguro conforme a lo estipulado en su contrato de crédito. \n" +
                "\n" +
                "2) El 0% de comisión por apertura aplica para el modelo VERSA 2024 en todas sus versiones en Crédito Nissan en todos los plazos. Mientras que con Selectiviti aplica en plazos de 24 y 36 meses.   \n" +
                "\n" +
                "3) El bono de $10,000 M.N (con IVA) aplica sobre el precio de lista del vehículo en operaciones de crédito para el modelo VERSA 2024 únicamente versiones SENSE y aplica exclusivamente en plan Crédito Nissan.   \n" +
                "\n" +
                "4) La mensualidad desde $3,299.00 M.N. aplica únicamente con el plan “Selectiviti“ para el modelo VERSA 2024 versión SENSE TM’24, con un enganche desde 44.0%, a un plazo de 36 meses. Esta oferta no incluye el costo del seguro, mismo que podrá ser cubierto de contado o financiado, conforme a lo estipulado en su contrato.  "));
        items.add(new PropertyDomain("Auto", "NISSAN SENTRA", "LosAngles La", "car_3", 115000, 4, 4, 400, true, 4.7, "1) 2 años de seguro gratis aplica para el modelo SENTRA 2024 en todas sus versiones, en operaciones de crédito. Únicamente con aseguradoras participantes. Consulta especificaciones con tu Distribuidor Autorizado Nissan®. Después de 2 años de seguro gratis, el cliente deberá contratar un seguro conforme a lo estipulado en su contrato de crédito.  \n" +
                "\n" +
                "2)  El 0% de comisión por apertura aplica para el modelo SENTRA 2024 en todas sus versiones en Crédito Nissan en todos los plazos. Mientras que con Selectiviti aplica en plazos de 24 y 36 meses.   "));
        items.add(new PropertyDomain("Camioneta", "NISSAN X-TRAIL", "Newyork NY", "car_4", 105000, 5, 6, 1100, true, 4.3, " 1) 2 años de seguro gratis aplica para el modelo X-TRAIL 2023 en todas sus versiones, en operaciones de crédito. Únicamente con aseguradoras participantes. Consulta especificaciones con tu Distribuidor Autorizado Nissan®. Después de 2 años de seguro gratis, el cliente deberá contratar un seguro conforme a lo estipulado en su contrato de crédito.  \n" +
                "\n" +
                " 2) El 0% de comisión por apertura aplica para el modelo X-TRAIL 2023 en todas sus versiones, en Crédito Nissan en todos los plazos. Mientras que con Selectiviti aplica en plazos de 24 y 36 meses. \n" +
                "\n" +
                " 3) El bono de hasta $75,000 M.N (con IVA) aplica sobre el precio de lista del vehículo en operaciones de crédito para el modelo X-TRAIL 2023 versión PLATINUM PLUS 2ROW’23 y aplica exclusivamente en plan Crédito Nissan. "));

        binding.recommendedView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        binding.recommendedView.setAdapter(new ItemsAdapter(items));


        ArrayList<PropertyDomain> itemsNear = new ArrayList<>();
        itemsNear.add(new PropertyDomain("Moto", "REBEL 1100 DCT", "Newyork NY", "moto_1", 1750, 1, 3, 1100, true, 4.3, "Motor 2 cilindros 22.5º en paralelo, SOHC, Unicam®, 4 válvulas y 2 bujías por cilindro. "));
        itemsNear.add(new PropertyDomain("Auto", "Porsche 911 Carrera 4 GTS", "LosAngles La", "car_6", 999, 4, 6, 400, true, 4.7, "480 HP\n" +
                "\n" +
                "Potencia (HP)\n" +
                "\n" +
                "3.3 s\n" +
                "\n" +
                "Aceleración de 0 - 100 km/h con paquete Sport Chrono\n" +
                "\n" +
                "309 km/h\n" +
                "\n" +
                "Velocidad máxima\n" +
                "\n" +
                "570 Nm\n" +
                "\n" +
                "Par Máximo (Nm)\n" +
                "\n" +
                "6\n" +
                "\n" +
                "Número de cilindros\n" +
                "\n" +
                "1,595 kg\n" +
                "\n" +
                "Tara según DIN\n" +
                "\n" +
                "4,533 x 2,024 x 1,301 mm\n" +
                "\n" +
                "Longitud/Anchura (sin espejos plegados)/Altura "));
        itemsNear.add(new PropertyDomain("Auto", "CAMARO ZL1", "Newyork NY", "camaro", 800, 4, 6, 500, false, 4.9, "Motor V8 Supercargado de 6.2L.\n" +
                "Potencia de 650 HP y 650 lb-pie de torque.\n" +
                "Transmisión automática con paleta de cambios de 10 velocidades.\n" +
                "Radiador de alto desempeño de 36 mm y dos radiadores externos auxiliares.\n" +
                "Frenos Brembo con rotores delanteros de 390 mm x 36 mm con 6 pistones y traseros de 365 mm x 28 mm de 4 pistones.\n" +
                "Suspensión Sport con Magnetic Ride Control."));
        itemsNear.add(new PropertyDomain("Moto", "DUCATI PANIGALE v4", "LosAngles LA", "ducati", 1500, 1, 4, 350, true, 4.5, "La Panigale V4 puede ser equipada con accesorios del catálogo Ducati Performance. El catálogo incluye tanto componentes homologados como elementos puramente de competición diseñados para los pilotos de circuito. Los accesorios Ducati Performance están disponibles en el configurador."));

        binding.nearView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        binding.nearView.setAdapter(new ItemsAdapter(itemsNear));
    }

    private void initLocation() {
        String[] items = new String[]{"LosAngles, USA", "NewYork, USA"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, items);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        binding.locationSpin.setAdapter(adapter);
    }
}