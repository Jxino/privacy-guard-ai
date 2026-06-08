package com.jxino.marketpulse.controller;

import com.jxino.marketpulse.domain.ProjectSummary;
import com.jxino.marketpulse.service.MarketPulseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/market-pulse")
public class MarketPulseController {
    private final MarketPulseService service;

    public MarketPulseController(MarketPulseService service) {
        this.service = service;
    }

    @GetMapping
    public ProjectSummary summary() {
        return service.getSummary();
    }
}
