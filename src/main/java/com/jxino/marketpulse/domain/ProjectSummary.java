package com.jxino.marketpulse.domain;

import java.util.List;

public record ProjectSummary(
        String title,
        String description,
        List<String> techStack,
        List<String> features
) {
}
