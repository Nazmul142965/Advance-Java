package com.patu.smartcity.controller;

import com.patu.smartcity.model.Incident;
import com.patu.smartcity.service.IncidentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/incidents")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")

public class IncidentRestController {
    private final IncidentService incidentService;


    @GetMapping("/dashboard")
    public List<Incident> getAllIncidents() {
        return incidentService.getAllIncidents();
    }



    @PostMapping("/update")
    public void updateIncidents(@RequestBody List<Incident> incidents) {
        incidents.forEach(incident -> incidentService.updateIncident(incident.getId(), incident));
    }

    @DeleteMapping("/delete/{id}")
    public void deleteIncident(@PathVariable String id) {
        incidentService.deleteIncident(id);
    }
    @PostMapping("/create")
    public Incident createIncident(@RequestBody Incident incident) {
        return incidentService.createIncident(incident);
    }

    @GetMapping("/stats/new-today")
    public long getNewIncidentsToday() {
        return incidentService.getNewIncidentsToday();
    }

    @GetMapping("/stats/resolved-today")
    public long getResolvedToday() {
        return incidentService.getResolvedToday();
    }

    @GetMapping("/stats/high-priority")
    public long getHighPriorityCount() {
        return incidentService.getHighPriorityCount();
    }
}
