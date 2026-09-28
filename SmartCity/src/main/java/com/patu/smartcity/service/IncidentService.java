package com.patu.smartcity.service;

import com.patu.smartcity.model.Incident;
import com.patu.smartcity.repository.IncidentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;


@Service
@RequiredArgsConstructor
public class IncidentService {
    private final IncidentRepository incidentRepository;

    @Cacheable(value = "incidents")
    public List<Incident> getAllIncidents() {
        return incidentRepository.findAll();
    }

    @Cacheable(value = "incidents", key = "#id")
    public Incident getIncidentById(String id) {
        return incidentRepository.findById(id).orElse(null);
    }

    @CacheEvict(value = {"incidents","dashboard"}, allEntries = true)
    public Incident createIncident( Incident incident){
        return incidentRepository.save(incident);
    }

    @CacheEvict(value = {"incidents","dashboard"}, key = "#id")
    public void deleteIncident(String id) {
        incidentRepository.deleteById(id);
    }

    @CachePut(value = "incidents", key = "#id")
    @CacheEvict(value = {"incidents", "dashboard"}, allEntries = true)
    public Incident updateIncident(String id, Incident incident) {
        incident.setId(id);
        return incidentRepository.save(incident);
    }

    @Cacheable(value = "dashboardStats", key = "'newIncidents'")
    public long getNewIncidentsToday() {
        return incidentRepository.countByStatusAndDate("New", LocalDate.now());
    }

    @Cacheable(value = "dashboardStats", key = "'resolvedToday'")
    public long getResolvedToday() {
        return incidentRepository.countByStatusAndDate("Resolved", LocalDate.now());
    }

    @Cacheable(value = "dashboardStats", key = "'highPriority'")
    public long getHighPriorityCount() {
        return incidentRepository.countByPriority("High");
    }

}
