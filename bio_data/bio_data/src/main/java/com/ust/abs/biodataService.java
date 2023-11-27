package com.ust.abs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class biodataService {
    @Autowired
    private biodataRepo br;

    public List<biodata> readAll()
    {
      return br.findAll();
    }
    public Optional<biodata> readById(Long id)
    {
        return br.findById(id);
    }
     public biodata addBio(biodata bi)
     {
         return br.save(bi);
     }
     public void deleteBio(Long id)
     {
         br.deleteById(id);
     }
     public  biodata updateBio (Long id,biodata bio)
     {
         if(br.existsById(id))
         {
             bio.setId(id);
             return br.save(bio);
         }
         return null;
     }
}
