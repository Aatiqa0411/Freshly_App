package com.example.freshlye_comerce;

import android.app.Application;

import androidx.lifecycle.LiveData;

import java.util.List;

public class VendorRepository {
    private final VendorDAO vendorDao;
    private final LiveData<List<Vendor>> allVendors;

    public VendorRepository(Application application) {
        FreshlyDatabase db = FreshlyDatabase.getDatabase(application);
        vendorDao = db.vendorDao();
        allVendors = vendorDao.getAllVendors();
    }

    public LiveData<List<Vendor>> getAllVendors() {
        return allVendors;
    }

    public void insert(Vendor vendor) {
        FreshlyDatabase.databaseWriteExecutor.execute(() -> vendorDao.insertVendor(vendor));
    }

    // Other methods like update, delete as per DAO
}
