package dev.gutuivan.service.impl;

import dev.gutuivan.repository.PhoneRepository;
import dev.gutuivan.service.PhoneService;
import org.springframework.stereotype.Service;

@Service
public class PhoneServiceImpl implements PhoneService {
    private final dev.gutuivan.repository.PhoneRepository phoneRepository;
    public PhoneServiceImpl(PhoneRepository phoneRepository) {
        super();
        this.phoneRepository = phoneRepository;
    }
}
