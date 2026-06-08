package com.jxino.marketpulse.service;

import com.jxino.marketpulse.domain.ProjectSummary;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class MarketPulseService {
    public ProjectSummary getSummary() {
        return new ProjectSummary(
                "Market Pulse",
                "상품 판매량, 재고, 주문 흐름을 분석하는 이커머스 관리자 대시보드",
                List.of("spring-boot", "java", "jpa", "mysql", "analytics", "ecommerce"),
                List.of(
                "Sales summary aggregation API",
                "Inventory status endpoint",
                "Order trend analysis service"
                )
        );
    }
}
