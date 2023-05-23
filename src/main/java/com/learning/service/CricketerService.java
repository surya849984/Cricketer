package com.learning.service;

import com.learning.CrudProjecteNTITY.Cricketer;
import com.learning.repo.CricketerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CricketerService {
    @Autowired
    private CricketerRepository cricketerRepository;

    public List<Cricketer> getAllCricketers() {
        return cricketerRepository.findAll();
    }

    public Optional<Cricketer> getCricketerById(Long id) {
        return cricketerRepository.findById(id);
    }

    public Cricketer createCricketer(Cricketer cricketer) {
        return cricketerRepository.save(cricketer);
    }

    public Cricketer updateCricketer(Cricketer cricketer) {
        return cricketerRepository.save(cricketer);
    }

    public void deleteCricketer(Long id) {
        cricketerRepository.deleteById(id);
    }
}
