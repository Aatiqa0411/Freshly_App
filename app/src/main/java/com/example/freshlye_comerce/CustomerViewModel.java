package com.example.freshlye_comerce;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class CustomerViewModel extends AndroidViewModel {
    private final CustomerRepository repository;
    private final LiveData<List<Customer>> allCustomers;

    public CustomerViewModel(Application application) {
        super(application);
        repository = new CustomerRepository(application);
        allCustomers = repository.getAllCustomers();
    }

    public LiveData<List<Customer>> getAllCustomers() {
        return allCustomers;
    }

    public void insert(Customer customer) {
        repository.insert(customer);
    }

    public void update(Customer customer) {
        repository.update(customer);
    }

    public void delete(Customer customer) {
        repository.delete(customer);
    }

    public LiveData<Customer> login(String email, String password) {
        return repository.login(email, password);
    }
}
