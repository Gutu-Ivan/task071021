package dev.gutuivan.service;

import dev.gutuivan.model.Phone;

import java.util.List;

public interface PhoneService {
    Phone save(Phone phone);
    List<Phone> getAll();
    Phone get(long id);
    Phone update(long id, Phone phone);
    void delete(long id);
}
