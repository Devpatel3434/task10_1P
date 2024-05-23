package web;

public class TaskSubmissionService {

    public boolean submitTask(String studentId, String taskName) {
        if(studentId == null || taskName == null || studentId.isEmpty() || taskName.isEmpty()) {
            return false;
        }
        
        // Validate task name
        if (!isValidTaskName(taskName)) {
            return false;
        }
        
        // Simulate task submission logic (e.g., save task to database)
        System.out.println("Task submitted successfully for Student ID: " + studentId + ", Task Name: " + taskName);
        return true;
    }
    
    // Method to validate task name
    private boolean isValidTaskName(String taskName) {
        // Task name should not contain only numbers
        return !(taskName.matches("^[0-9]+$"));
    }
}
