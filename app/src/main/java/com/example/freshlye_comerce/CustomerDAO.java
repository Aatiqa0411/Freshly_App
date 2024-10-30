package com.example.freshlye_comerce;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface CustomerDAO {
    @Insert
    void insertCustomer(Customer customer);

    @Update
    void updateCustomer(Customer customer);

    @Delete
    void deleteCustomer(Customer customer);

    // Method to retrieve a specific customer for login
    @Query("SELECT * FROM customers WHERE email = :email AND password = :password")
    LiveData<Customer> login(String email, String password);

    // Method to retrieve all customers
    @Query("SELECT * FROM customers")
    LiveData<List<Customer>> getAllCustomers();
}
