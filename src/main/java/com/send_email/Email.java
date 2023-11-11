package com.send_email;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class Email {
    private String from;
    private String to;
    private String subject;
    private String body;
    private MultipartFile file;

}
