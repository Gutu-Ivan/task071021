package dev.gutuivan.service.impl;

import dev.gutuivan.model.Phone;
import dev.gutuivan.repository.PhoneRepository;
import dev.gutuivan.service.PhoneService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhoneServiceImpl implements PhoneService {
    private final dev.gutuivan.repository.PhoneRepository phoneRepository;
    public PhoneServiceImpl(PhoneRepository phoneRepository) {
        super();
        this.phoneRepository = phoneRepository;
    }

    @Override
    public Phone save(Phone phone) {
        return phoneRepository.save(phone);
    }

    @Override
    public List<Phone> getAll() {
        return phoneRepository.findAll();
    }

    @Override
    public Phone get(long id) {
        return phoneRepository.findById(id).orElseThrow();
    }

    @Override
    public Phone update(long id, Phone phone) {
        Phone foundPhone = phoneRepository.findById(id).orElseThrow();
        foundPhone.setBrand(phone.getBrand());
        foundPhone.setColor(phone.getColor());
        foundPhone.setPrice(phone.getPrice());
        foundPhone.setId(phone.getId());
        phoneRepository.save(foundPhone);
        return phoneRepository.save(phone);
    }

    @Override
    public void delete(long id) {
        phoneRepository.deleteById(id);
    }
}
