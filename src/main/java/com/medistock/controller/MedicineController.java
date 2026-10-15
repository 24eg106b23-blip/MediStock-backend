package com.medistock.controller;

import com.medistock.entity.Medicine;
import com.medistock.service.MedicineService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/medicines")
@CrossOrigin(origins = "http://localhost:5173")
public class MedicineController {
    private final MedicineService service;
    public MedicineController(MedicineService service){this.service=service;}

    @GetMapping public List<Medicine> all(){return service.all();}
    @GetMapping("/{id}") public Medicine get(@PathVariable Long id){return service.get(id);}
    @GetMapping("/search") public List<Medicine> search(@RequestParam String name){return service.search(name);}
    @PostMapping public Medicine add(@RequestBody Medicine m){return service.save(m);}
    @PutMapping("/{id}") public Medicine update(@PathVariable Long id,@RequestBody Medicine m){
        Medicine old=service.get(id);
        old.setName(m.getName()); old.setGenericName(m.getGenericName());
        old.setCategory(m.getCategory()); old.setManufacturer(m.getManufacturer());
        old.setBatchNumber(m.getBatchNumber()); old.setExpiryDate(m.getExpiryDate());
        old.setStockQuantity(m.getStockQuantity()); old.setReorderLevel(m.getReorderLevel());
        old.setPurchasePrice(m.getPurchasePrice()); old.setSellingPrice(m.getSellingPrice());
        return service.save(old);
    }
    @DeleteMapping("/{id}") public void delete(@PathVariable Long id){service.delete(id);}
}
