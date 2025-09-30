package com.tritime.controller;

import com.tritime.model.TrainingZone;
import com.tritime.repository.TrainingZoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/zones")
public class TrainingZoneController {

    @Autowired
    private TrainingZoneRepository trainingZoneRepository;

    // --- Criar uma nova zona ---
    @PostMapping
    public TrainingZone createZone(@RequestBody TrainingZone zone) {
        return trainingZoneRepository.save(zone);
    }

    // --- Listar todas as zonas ---
    @GetMapping
    public List<TrainingZone> getAllZones() {
        return trainingZoneRepository.findAll();
    }

    // --- Buscar zona por ID ---
    @GetMapping("/{id}")
    public Optional<TrainingZone> getZoneById(@PathVariable Long id) {
        return trainingZoneRepository.findById(id);
    }

    // --- Atualizar zona ---
    @PutMapping("/{id}")
    public TrainingZone updateZone(@PathVariable Long id, @RequestBody TrainingZone updatedZone) {
        return trainingZoneRepository.findById(id).map(zone -> {
            zone.setUser(updatedZone.getUser());
            
            // Natação
            zone.setSwimZ1Min(updatedZone.getSwimZ1Min());
            zone.setSwimZ1Sec(updatedZone.getSwimZ1Sec());

            zone.setSwimZ2Min(updatedZone.getSwimZ2Min());
            zone.setSwimZ2Sec(updatedZone.getSwimZ2Sec());

            zone.setSwimZ3Min(updatedZone.getSwimZ3Min());
            zone.setSwimZ3Sec(updatedZone.getSwimZ3Sec());

            zone.setSwimZ4Min(updatedZone.getSwimZ4Min());
            zone.setSwimZ4Sec(updatedZone.getSwimZ4Sec());
            
            zone.setSwimZ5Min(updatedZone.getSwimZ5Min());
            zone.setSwimZ5Sec(updatedZone.getSwimZ5Sec());
            
            // Ciclismo
            zone.setBikeZ1(updatedZone.getBikeZ1());

            zone.setBikeZ2(updatedZone.getBikeZ2());

            zone.setBikeZ3(updatedZone.getBikeZ3());

            zone.setBikeZ4(updatedZone.getBikeZ4());

            zone.setBikeZ5(updatedZone.getBikeZ5());

            // Corrida
            zone.setRunZ1Min(updatedZone.getRunZ1Min());
            zone.setRunZ1Sec(updatedZone.getRunZ1Sec());

            zone.setRunZ2Min(updatedZone.getRunZ2Min());
            zone.setRunZ2Sec(updatedZone.getRunZ2Sec());

            zone.setRunZ3Min(updatedZone.getRunZ3Min());
            zone.setRunZ3Sec(updatedZone.getRunZ3Sec());

            zone.setRunZ4Min(updatedZone.getRunZ4Min());
            zone.setRunZ4Sec(updatedZone.getRunZ4Sec());

            zone.setRunZ5Min(updatedZone.getRunZ5Min());
            zone.setRunZ5Sec(updatedZone.getRunZ5Sec());

            return trainingZoneRepository.save(zone);
            
        }).orElseThrow(() -> new RuntimeException("TrainingZone com id " + id + " não encontrada."));
        
    }

    // --- Deletar zona ---
    @DeleteMapping("/{id}")
    public void deleteZone(@PathVariable Long id) {
        trainingZoneRepository.deleteById(id);
    }
}
