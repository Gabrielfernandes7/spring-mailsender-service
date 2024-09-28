package br.com.gabrielfernandes.email_springboot_service;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
@RequestMapping("email")
public class EmailController {
    private final EmailService emailService;

    public EmailController(EmailService emailService) {
        this.emailService = emailService;
    }

    // enviado no corpo da requisição
    @PostMapping
    public void sendEmail(@RequestBody Email email) {
        emailService.sendEmail(email);
    }
    
}
