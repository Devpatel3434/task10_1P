package web.service;

import static org.junit.Assert.*;
import org.junit.Test;

import web.TaskSubmissionService;

public class TestTaskSubmissionService {
	
	@Test
    public void testSubmitTask1() {
        TaskSubmissionService TaskSubmissionService = new TaskSubmissionService();
        boolean result = TaskSubmissionService.submitTask("S222622553", "Task34");
        assertTrue(result);
    }
    @Test
    public void testSubmitTaskWithNullValues() {
        TaskSubmissionService taskSubmissionService = new TaskSubmissionService();
        assertFalse(taskSubmissionService.submitTask(null, null));
    }
    
    @Test
    public void testSubmitTaskWithEmptyValues() {
        TaskSubmissionService taskSubmissionService = new TaskSubmissionService();
        assertFalse(taskSubmissionService.submitTask("", ""));
    }
    
    @Test
    public void testSubmitTaskWithEmptyStudentId() {
        TaskSubmissionService taskSubmissionService = new TaskSubmissionService();
        assertFalse(taskSubmissionService.submitTask("", "Task34"));
    }
    
    @Test
    public void testSubmitTaskWithEmptyTaskName() {
        TaskSubmissionService taskSubmissionService = new TaskSubmissionService();
        assertFalse(taskSubmissionService.submitTask("S222622553", ""));
    }
    
    @Test
    public void testSubmitTaskWithNullStudentId() {
        TaskSubmissionService taskSubmissionService = new TaskSubmissionService();
        assertFalse(taskSubmissionService.submitTask(null, "Task34"));
    }
    
    @Test
    public void testSubmitTaskWithNullTaskName() {
        TaskSubmissionService taskSubmissionService = new TaskSubmissionService();
        assertFalse(taskSubmissionService.submitTask("S222622553", null));
    }
    
    @Test
    public void testSubmitTaskWithNumericTaskName() {
        TaskSubmissionService taskSubmissionService = new TaskSubmissionService();
        assertFalse(taskSubmissionService.submitTask("S222622553", "12345"));
    }
   

}
