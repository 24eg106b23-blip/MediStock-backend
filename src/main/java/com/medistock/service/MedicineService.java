package com.medistock.service;

import com.medistock.entity.Medicine;
import com.medistock.repository.MedicineRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MedicineService {
    private final MedicineRepository repo;
    public MedicineService(MedicineRepository repo){this.repo=repo;}
    public List<Medicine> all(){return repo.findAll();}
    public Medicine get(Long id){return repo.findById(id).orElseThrow();}
    public Medicine save(Medicine m){return repo.save(m);}
    public void delete(Long id){repo.deleteById(id);}
    public List<Medicine> search(String name){return repo.findByNameContainingIgnoreCase(name);}
}
