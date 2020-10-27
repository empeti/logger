package com.empeti.rest.service.api.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class LogApiController {
    @PostMapping("logger")
    public ResponseEntity<String> test(@RequestBody String message) throws JsonProcessingException {
        LogMessage logMessage = new ObjectMapper().readValue(message, LogMessage.class);
        return new ResponseEntity<>(logMessage.getMessage(), HttpStatus.OK);
    }
}
