package com.example.freshlye_comerce;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "products",
        foreignKeys = {
                @ForeignKey(entity = Vendor.class, parentColumns = "v_id", childColumns = "vendor_id"),
                @ForeignKey(entity = Category.class, parentColumns = "ca_id", childColumns = "category_id")
        })
public class Product {
    @PrimaryKey(autoGenerate = true)
    public int p_id;
    @ColumnInfo(name = "title")
    public String title;
    @ColumnInfo(name = "description")
    public String description;
    @ColumnInfo(name = "price")
    public double price;
    @ColumnInfo(name = "image")
    public String image;
    @ColumnInfo(name = "category_id")
    public int category_id;
    @ColumnInfo(name = "vendor_id")
    public int vendor_id;
}
