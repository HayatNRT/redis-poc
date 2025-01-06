package com.nrt.redis.service;

import com.nrt.redis.entities.Driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
//@RequiredArgsConstructor
public class DriverLocationService {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    private final String DRIVER_KEY_PREFIX = "driver:";
    private final String LOCATION_KEY_PREFIX = "location:";


    public Driver saveDriverWithLocation(Driver driver) {
        String driverKey = DRIVER_KEY_PREFIX + driver.getId();
        String locationKey = LOCATION_KEY_PREFIX + driver.getId();
        redisTemplate.opsForValue().set(driverKey, driver);
        redisTemplate.opsForValue().set(locationKey, driver);
        return driver;

    }


}
