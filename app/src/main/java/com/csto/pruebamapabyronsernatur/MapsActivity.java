package com.csto.pruebamapabyronsernatur;

import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.csto.pruebamapabyronsernatur.databinding.ActivityMapsBinding;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {
    Intent i;
    String seleccionado;
    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap ) {
        mMap = googleMap;
        //Bundle bundle = getIntent().getExtras();
        //seleccionado = bundle.getString("pais2");
        // Add a marker in Sydney and move the camera
        /*LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));*/
        //if(seleccionado.equals("1")){
            LatLng sanFernando = new LatLng(-34.5865592, -71.021398);
            mMap.addMarker(new MarkerOptions().position(sanFernando).title("San fernando"));

            mMap.moveCamera(CameraUpdateFactory.newLatLng(sanFernando));
        /*}
        if(seleccionado.equals("2")){
            LatLng saoPaulo = new LatLng(-22.3160734, -57.6770626);
            mMap.addMarker(new MarkerOptions().position(saoPaulo).title("Sao Paulo"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(saoPaulo));
        }
        if(seleccionado.equals("3")){
            LatLng alemania = new LatLng(50.1208765,8.3570486) ;
            mMap.addMarker(new MarkerOptions().position(alemania).title("Alemania"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(alemania));
        }*/
    }

}