package com.example.freshlye_comerce;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "vendors")
public class Vendor {
    @PrimaryKey(autoGenerate = true)
    public int v_id;
    @ColumnInfo(name = "username")
    public String username;
    @ColumnInfo(name = "password")
    public String password;
    @ColumnInfo(name = "image")
    public String image; // Store URI or path as a String
    @ColumnInfo(name = "phone")
    public String phone;
    @ColumnInfo(name = "address")
    public String address;
}
