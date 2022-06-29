package com.mikhlasnr.kulineriapp10119022.view.carikuliner;
/*
    nim                 : 10119022
    nama                : Muhammad Ikhlas Naufalsyah Ranau
    kelas               : IF-1
*/
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import com.mikhlasnr.kulineriapp10119022.R;


public class CariKulinerFragment extends Fragment implements OnMapReadyCallback{
    private GoogleMap mMap;

    public CariKulinerFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cari_kuliner, container, false);
        SupportMapFragment mMapFragment = (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.carikulinermap);
        mMapFragment.getMapAsync(this);
        return view;
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng burger_bangor = new LatLng(-6.893044135794983, 106.78387892697208);
        LatLng hokben = new LatLng(-6.893451547346183, 106.78536218851244);
        LatLng baso_aci_akang = new LatLng(-6.893632619034298, 106.78546143024298);
        LatLng lego_street = new LatLng(-6.892671340604626, 106.78368312571943);
        LatLng dapur_mimih = new LatLng(-6.893155974294836, 106.78346586679581);

        mMap.addMarker(new MarkerOptions().position(burger_bangor).title("Burger Bangor"));
        mMap.addMarker(new MarkerOptions().position(hokben).title("Hokben"));
        mMap.addMarker(new MarkerOptions().position(baso_aci_akang).title("baso Aci Akang"));
        mMap.addMarker(new MarkerOptions().position(lego_street).title("Lego Street"));
        mMap.addMarker(new MarkerOptions().position(dapur_mimih).title("Dapur Mimih"));

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(hokben, 17));

    }
}