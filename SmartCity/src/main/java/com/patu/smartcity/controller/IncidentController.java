package com.patu.smartcity.controller;

import com.patu.smartcity.model.Incident;
import com.patu.smartcity.service.IncidentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/incidents")
@RequiredArgsConstructor
public class IncidentController {

    private final IncidentService incidentService;


    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        model.addAttribute("incidents", incidentService.getAllIncidents());
        model.addAttribute("newTodayCount", incidentService.getNewIncidentsToday());
        model.addAttribute("resolvedTodayCount", incidentService.getResolvedToday());
        model.addAttribute("highPriorityCount", incidentService.getHighPriorityCount());
        return "dashboard"; // Renders templates/dashboard.html
    }


    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("incident", new Incident());
        return "create"; // Renders templates/create.html
    }

    @PostMapping("/create")
    public String createIncident(@ModelAttribute("incident") Incident incident) {
        incidentService.createIncident(incident);
        return "redirect:/incidents/dashboard";
    }


    @GetMapping("/update")
    public String showUpdateForm(@RequestParam("id") String id, Model model) {
        Incident incident = incidentService.getIncidentById(id);
        if (incident == null) {
            return "redirect:/incidents/dashboard";
        }
        model.addAttribute("incident", incident);
        return "update"; // Renders templates/update.html
    }


    @PostMapping("/update")
    public String updateIncident(@RequestParam("id") String id, @ModelAttribute("incident") Incident incident) {
        incidentService.updateIncident(id, incident);
        return "redirect:/incidents/dashboard";
    }


    @PostMapping("/delete/{id}")
    public String deleteIncident(@PathVariable("id") String id) {
        incidentService.deleteIncident(id);
        return "redirect:/incidents/dashboard";
    }
}
