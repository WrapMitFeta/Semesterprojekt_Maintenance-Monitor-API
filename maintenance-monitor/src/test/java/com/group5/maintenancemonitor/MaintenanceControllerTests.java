package com.group5.maintenancemonitor;

import com.group5.maintenancemonitor.controller.MaintenanceController;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaintenanceControllerTests {

    @Test
    void testSetMessage() {
        // Given
        MaintenanceController controller = new MaintenanceController();
        String message = "Service checks: No power until 5:00 pm";

        // When
        String result = controller.setMessage(message);

        // Then
        assertEquals("ok", result);
    }
}
