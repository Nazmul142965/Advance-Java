package com.patu.smartcity.repository;

import com.patu.smartcity.model.Incident;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.time.LocalDate;
import java.util.List;

public interface IncidentRepository extends MongoRepository<Incident, String> {
    List<Incident>getAllIncidentById(String id);

    long countByStatusAndDate(String status, LocalDate date);
    long countByPriority(String priority);
    List<Incident> findByDateGreaterThanEqual(LocalDate startDate);

}
