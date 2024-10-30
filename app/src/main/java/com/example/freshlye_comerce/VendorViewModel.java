package com.example.freshlye_comerce;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class VendorViewModel extends AndroidViewModel {
    private final VendorRepository repository;
    private final LiveData<List<Vendor>> allVendors;

    public VendorViewModel(Application application) {
        super(application);
        repository = new VendorRepository(application);
        allVendors = repository.getAllVendors();
    }

    public LiveData<List<Vendor>> getAllVendors() { return allVendors; }

    public void insert(Vendor vendor) { repository.insert(vendor); }
}
