package com.send_email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
public class Controller {
    private final MailSenderService mailService;

    @Autowired
    public Controller(MailSenderService mailService) {
        this.mailService = mailService;
    }
    @PostMapping("/send")
    public ResponseEntity<Email> sendEmail(Email email) {
        mailService.sendEmail(email);
        return new ResponseEntity<>(email,HttpStatus.OK);
    }
}
