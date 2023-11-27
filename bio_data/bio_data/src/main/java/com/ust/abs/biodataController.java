package com.ust.abs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/biodata")
public class biodataController {
    @Autowired
    private biodataService bs;
    @GetMapping
    public List<biodata> readAllC()
    {
        return bs.readAll();
    }
    @GetMapping("/{id}")
    public Optional<biodata> readByIdC(@PathVariable Long id)
    {
        return bs.readById(id);
    }
    @PostMapping
    public biodata saveBioC(@RequestBody biodata bdc)
    {
        return  bs.addBio(bdc);
    }
    @PutMapping("/{id}")
    public biodata updateBioC (@PathVariable Long id, @RequestBody biodata bdc)
    {
        return bs.updateBio(id,bdc);
    }
    @DeleteMapping("/{id}")
    public void deleteBioC (@PathVariable Long id)
    {
        bs.deleteBio(id);
    }

}
