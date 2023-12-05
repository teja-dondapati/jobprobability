//package com.probability.job.service;
//
//import com.probability.job.model.JobSeeker;
//import org.springframework.stereotype.Service;
//
//@Service
//public class JobService {
//
//    public JobSeeker calculateJobTime(int level) {
//        // Constants representing the number of job seekers for each classification level
//        int h1bJobSeekers = 153874;
//        int optCptJobSeekers = 49716;
//        int h4L1L2JobSeekers = 16203;
//        int greenCardCitizenJobSeekers = 51347;
//
//        // Constants representing the number of available IT jobs
//        int availableITJobs = 2100;
//
//        // Constants representing the average days to get opportunity for each level
//        int[] averageDays = {80, 70, 50, 30, 20};  // Adjust these values based on your estimation
//
//        // Calculate the total number of job seekers
//        int totalJobSeekers = h1bJobSeekers + optCptJobSeekers + h4L1L2JobSeekers + greenCardCitizenJobSeekers;
//
//        // Placeholder for the proportion of job seekers for each level
//        double[] proportionOfJobSeekers = new double[5];
//        proportionOfJobSeekers[0] = (double) h1bJobSeekers / totalJobSeekers;
//        proportionOfJobSeekers[1] = (double) optCptJobSeekers / totalJobSeekers;
//        proportionOfJobSeekers[2] = (double) h4L1L2JobSeekers / totalJobSeekers;
//        proportionOfJobSeekers[3] = (double) greenCardCitizenJobSeekers / totalJobSeekers;
//        proportionOfJobSeekers[4] = 0.0;  // Level 5 represents candidates with 0 real-time experience
//
//        // Calculate the estimated time for each level
//        int estimatedDays = Math.max(averageDays[level - 1], 1); // Use the greater of the specified or 1
//
//        // Placeholder for positive ways to move from each level to the next
//        String positiveWays = getPositiveWaysForLevel(level);
//
//        // Create a JobSeeker object with level information
//        JobSeeker jobSeeker = new JobSeeker(level, estimatedDays, positiveWays);
//
//        return jobSeeker;
//    }
//
//    private String getPositiveWaysForLevel(int level) {
//        // You can customize positive ways based on the level
//        // For now, providing a generic message
//        return "Improve skills, gain experience";
//    }
//}
package com.probability.job.service;

import com.probability.job.model.JobSeeker;
import org.springframework.stereotype.Service;

@Service
public class JobService {

    public JobSeeker calculateJobTime(int level) {
        // Constants representing the number of job seekers for each classification level
        int h1bJobSeekers = 153874;
        int optCptJobSeekers = 49716;
        int h4L1L2JobSeekers = 16203;
        int greenCardCitizenJobSeekers = 51347;

        // Constants representing the number of available IT jobs
        int availableITJobs = 2100;

        // Constants representing the average days to get opportunity for each level
        int[] averageDays = {80, 90, 115, 140, 160};  // Adjust these values based on your estimation

        // Calculate the total number of job seekers
        int totalJobSeekers = h1bJobSeekers + optCptJobSeekers + h4L1L2JobSeekers + greenCardCitizenJobSeekers;

        // Placeholder for the proportion of job seekers for each level
        double[] proportionOfJobSeekers = new double[5];
        proportionOfJobSeekers[0] = (double) h1bJobSeekers / totalJobSeekers;
        proportionOfJobSeekers[1] = (double) optCptJobSeekers / totalJobSeekers;
        proportionOfJobSeekers[2] = (double) h4L1L2JobSeekers / totalJobSeekers;
        proportionOfJobSeekers[3] = (double) greenCardCitizenJobSeekers / totalJobSeekers;
        proportionOfJobSeekers[4] = 0.0;  // Level 5 represents candidates with 0 real-time experience

        // Calculate the estimated time for each level
        int estimatedDays = (int) (averageDays[level - 1] * getMultiplierForLevel(level));

        // Placeholder for positive ways to move from each level to the next
        String positiveWays = getPositiveWaysForLevel(level);

        // Create a JobSeeker object with level information
        JobSeeker jobSeeker = new JobSeeker(level, estimatedDays, positiveWays);

        return jobSeeker;
    }

    private double getMultiplierForLevel(int level) {
        // Define multipliers for each level based on experience level
        double[] multipliers = {1.0, 1.2, 1.5, 2.0, 2.5};  // Adjust these values based on your estimation
        return multipliers[level - 1];
    }

    private String getPositiveWaysForLevel(int level) {
        // You can customize positive ways based on the level
        // For now, providing a generic message
        return "Improve skills, gain experience";
    }
}
