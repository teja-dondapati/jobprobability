//package com.probability.job.controller;
//
//import com.probability.job.model.JobSeeker;
//import com.probability.job.service.JobService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/api/level")
//public class JobController {
//
//    @Autowired
//    private JobService jobService;
//
//    @GetMapping("/job")
//    public ResponseEntity<JobSeeker[]> calculateJobTimeForAllLevels() {
//        try {
//            JobSeeker[] responses = new JobSeeker[5];
//
//            // Loop through levels 1 to 5
//            for (int level = 1; level <= 5; level++) {
//                responses[level - 1] = jobService.calculateJobTime(level);
//            }
//
//            return ResponseEntity.ok(responses);
//        } catch (Exception e) {
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
//        }
//    }
//}
package com.probability.job.controller;

import com.probability.job.model.JobSeeker;
import com.probability.job.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/level")
public class JobController {

    @Autowired
    private JobService jobService;

    @GetMapping("/job/{level}")
    public ResponseEntity<JobSeeker> calculateJobTime(@PathVariable int level) {
        try {
            JobSeeker response = jobService.calculateJobTime(level);
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
