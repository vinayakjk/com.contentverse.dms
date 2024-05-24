package cv_resources;
import javax.mail.*;
import javax.mail.internet.*;
import java.io.File;
import java.util.Arrays;
import java.util.Properties;

public class CV_SendEmailViaSMTP extends ExtentReportNG {

    public static void main(String[] args) 
    {
        CV_SendEmailViaSMTP sender = new CV_SendEmailViaSMTP();
        sender.SendEmail();
    }

    public void SendEmail() {
        // Your Gmail credentials
        String from = "cmsautomation0@gmail.com";
        String appPassword = "zixw ibsb iafh wqdu"; // Use the App Password here
        String to = "rajendra.mane@sundynetech.com";
        String subject = "Report";
        String body = "This is Auto Send Mail";

        // Get the latest file from the reports folder
        String reportsFolder = System.getProperty("user.dir") + "//reports";
        File latestFile = getLatestFile(reportsFolder);

        if (latestFile != null) {
            // File to be attached
            String attachmentPath = latestFile.getAbsolutePath();

            Properties props = new Properties();
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.port", "587");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", "true");

            Session session = Session.getInstance(props, new Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(from, appPassword);
                }
            });

            try {
                Message message = new MimeMessage(session);
                message.setFrom(new InternetAddress(from));
                message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
                message.setSubject(subject);

                // Create the email body part
                MimeBodyPart messageBodyPart = new MimeBodyPart();
                messageBodyPart.setText(body);

                // Create the attachment
                MimeBodyPart attachmentPart = new MimeBodyPart();
                attachmentPart.attachFile(new File(attachmentPath));

                // Add the parts to the message
                Multipart multipart = new MimeMultipart();
                multipart.addBodyPart(messageBodyPart);
                multipart.addBodyPart(attachmentPart);

                // Set the multipart content to the message
                message.setContent(multipart);

                // Send the message
                Transport.send(message);
                System.out.println("Email sent successfully!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else 
        {
            System.out.println("No files found in the reports folder.");
        }
    }

    private File getLatestFile(String folderPath) {
        File folder = new File(folderPath);
        File[] files = folder.listFiles();

        if (files != null && files.length > 0) {
            // Sort files by last modified timestamp
            Arrays.sort(files, (f1, f2) -> Long.compare(f2.lastModified(), f1.lastModified()));
            return files[0]; // Return the latest file
        } else {
            return null; // No files found
        }
    }
}
