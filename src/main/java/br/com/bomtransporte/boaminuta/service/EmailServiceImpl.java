package br.com.bomtransporte.boaminuta.service;

import br.com.bomtransporte.boaminuta.config.SpringPropertyConfig;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import java.util.Properties;

@Service
public class EmailServiceImpl  {
    @Autowired
    private JavaMailSender mailSender;

    @Autowired
    private SpringPropertyConfig springPropertyConfig;

    public String enviar(String destinatario, String assunto, String corpoHtml) {
        try {
            MimeMessage mail = mailSender.createMimeMessage();

            MimeMessageHelper helper = new MimeMessageHelper( mail );
            helper.setFrom(springPropertyConfig.getUsername());
            helper.setTo(destinatario);
            helper.setSubject(assunto);
            helper.setText(corpoHtml, true);

            mailSender.send(mail);

            return "Email enviado com sucesso!";
        } catch (Exception e) {
            e.printStackTrace();
            return "Erro ao enviar email.";
        }
    }

}
