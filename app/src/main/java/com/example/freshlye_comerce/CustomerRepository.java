package com.example.freshlye_comerce;

import android.app.Application;
import androidx.lifecycle.LiveData;

import java.util.List;

public class CustomerRepository {
    private final CustomerDAO customerDao;
    private final LiveData<List<Customer>> allCustomers;

    public CustomerRepository(Application application) {
        FreshlyDatabase db = FreshlyDatabase.getDatabase(application);
        customerDao = db.customerDao();
        allCustomers = customerDao.getAllCustomers();
    }

    public LiveData<List<Customer>> getAllCustomers() {
        return allCustomers;
    }

    public void insert(Customer customer) {
        FreshlyDatabase.databaseWriteExecutor.execute(() -> customerDao.insertCustomer(customer));
    }

    public void update(Customer customer) {
        FreshlyDatabase.databaseWriteExecutor.execute(() -> customerDao.updateCustomer(customer));
    }

    public void delete(Customer customer) {
        FreshlyDatabase.databaseWriteExecutor.execute(() -> customerDao.deleteCustomer(customer));
    }

    public LiveData<Customer> login(String email, String password) {
        return customerDao.login(email, password);  // No static reference here
    }
}
