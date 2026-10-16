package com.fitness.activityservice.service;

import com.fitness.activityservice.dto.ActivityRequest;
import com.fitness.activityservice.dto.ActivityResponse;
import org.springframework.stereotype.Service;

@Service
public interface ActivityService {
    ActivityResponse trackActivity(ActivityRequest request);
}
