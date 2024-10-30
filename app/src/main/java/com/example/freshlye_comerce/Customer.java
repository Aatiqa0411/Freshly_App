package com.example.freshlye_comerce;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "customers")
public class Customer {
    @PrimaryKey(autoGenerate = true)
    public int c_id;
    @ColumnInfo(name = "email")
    public String email;
    @ColumnInfo(name = "password")
    public String password;
    @ColumnInfo(name = "image")
    public String image; // Store URI or path as a String
    @ColumnInfo(name = "gender")
    public String gender;
}
