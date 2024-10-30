package com.example.freshlye_comerce;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = {Vendor.class, Customer.class, Product.class, Category.class}, version = 1)
public abstract class FreshlyDatabase extends RoomDatabase {
    public abstract VendorDAO vendorDao();
    public abstract CustomerDAO customerDao();
    public abstract ProductDAO productDao();
    public abstract CategoryDAO categoryDao();

    private static volatile FreshlyDatabase INSTANCE;
    private static final int NUMBER_OF_THREADS = 4;
    static final ExecutorService databaseWriteExecutor =
            Executors.newFixedThreadPool(NUMBER_OF_THREADS);

    public static FreshlyDatabase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (FreshlyDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                                    FreshlyDatabase.class, "freshly_database")
                            .fallbackToDestructiveMigration()
                            .build();
                }
            }
        }
        return INSTANCE;
    }
}
