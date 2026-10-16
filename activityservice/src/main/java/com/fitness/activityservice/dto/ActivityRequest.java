package com.fitness.activityservice.dto;

import com.fitness.activityservice.model.ActivityType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActivityRequest{

    private String userId;
    private ActivityType type;
    private Integer duration;
    private Integer CaloriesBurned;
    private LocalDateTime startTime;
    private Map<String , Object> additionalMetrics;
}
