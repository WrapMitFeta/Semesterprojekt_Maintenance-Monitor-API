package com.group5.maintenancemonitor.controller;

import com.group5.maintenancemonitor.model.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MaintenanceController {

    private Message message = new Message();

    /**
     * Sets the current service message of the electricity plant
     *
     * @param message The message to set
     * @return
     */
    @GetMapping("/api/message/set")
    public String setMessage(@RequestParam(value = "m") String message) {
        this.message.setMessage(message);
        return "ok";
    }
}
