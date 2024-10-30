package com.example.freshlye_comerce;
import androidx.lifecycle.LiveData;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@androidx.room.Dao
public interface VendorDAO {
    @Insert
    void insertVendor(Vendor vendor);

    @Update
    void updateVendor(Vendor vendor);

    @Delete
    void deleteVendor(Vendor vendor);

    @Query("SELECT * FROM vendors")
    LiveData<List<Vendor>> getAllVendors();

    @Query("SELECT * FROM vendors WHERE username = :username AND password = :password")
    Vendor login(String username, String password);
}
