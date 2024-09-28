package br.com.gabrielfernandes.email_springboot_service;
public record Email(
    String to, String subject, String body
) {
    
}
