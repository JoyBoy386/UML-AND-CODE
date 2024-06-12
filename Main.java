import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create sample objectives
        String[] objectives = {
                "Keep your diet well-balanced, prioritising healthy fats and protein.",
                "Exercise regularly, including both cardiovascular and strength training workouts.",
                "Consume hydration by drinking at least 8 glasses of water per day.",
                "Get at least 7-8 hours of sleep each night to support recovery and overall health."
        };

        // Create start and end dates
        Date startDate = new Date(); // current date as start date
        Date endDate = new Date(startDate.getTime() + (1000L * 60 * 60 * 24 * 30)); // 30 days from the start date

        // Create FitnessPlan object
        FitnessPlan plan = new FitnessPlan("Ahmad Ali", 21, 72.0, 183.0, objectives, startDate, endDate);

        // Print fitness plan details
        System.out.println("-------------------------------");
        System.out.println("Name: " + plan.getName());
        System.out.println("Age: " + plan.getAge());
        System.out.println("Weight: " + plan.getWeight() + " kg");
        System.out.println("Height: " + plan.getHeight() + " cm");
        System.out.println("BMI: " + String.format("%.2f", plan.getBMI()));
        if (plan.getBMI() < 18.5) {
            System.out.println("Underweight");
        } else if (plan.getBMI() < 24.9) {
            System.out.println("Normal weight");
        } else {
            System.out.println("Overweight");
        }
        System.out.println("Plan Start Date: " + plan.formatDate(plan.getStartDate()));
        System.out.println("Plan End Date: " + plan.formatDate(plan.getEndDate()));
        System.out.println("-------------------------------");

        System.out.println("Fitness Plan Objectives:");
        for (String objective : plan.getObjectives()) {
            System.out.println("- " + objective);
        }
        System.out.println("-------------------------------");
    }
}