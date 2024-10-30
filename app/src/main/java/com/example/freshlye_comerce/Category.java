package com.example.freshlye_comerce;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "categories")
public class Category {
    @PrimaryKey(autoGenerate = true)
    public int ca_id;
    @ColumnInfo(name = "name")
    public String name;
}
