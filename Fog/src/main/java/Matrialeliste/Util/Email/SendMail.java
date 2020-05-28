package Matrialeliste.Util.Email;

import java.io.File;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

/**
 * Sender en mail til sælger
 */
public class SendMail {

    public static void send(String fileName, String Subject, String text) {

        String to = "cphprojekter@gmail.com";

        String from = "cphprojekter@gmail.com";

        String host = "smtp.gmail.com";

        Properties properties = System.getProperties();

        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");

        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from, "1123581321#");
            }
        });

        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject(Subject);
            Multipart multipart = new MimeMultipart();
            MimeBodyPart attachPart = new MimeBodyPart();

            String attachFile = fileName;
            DataSource source = new FileDataSource(attachFile);
            attachPart.setDataHandler(new DataHandler(source));
            attachPart.setFileName(new File(attachFile).getName());

            multipart.addBodyPart(attachPart);
            MimeBodyPart body = new MimeBodyPart();
            body.setText(text);
            multipart.addBodyPart(body);
            message.setContent(multipart);
            Transport.send(message);

        } catch (MessagingException mex) {
            mex.printStackTrace();
        }

    }

}