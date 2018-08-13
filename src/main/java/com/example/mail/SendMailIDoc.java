/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.mail;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import org.apache.logging.log4j.LogManager;

/**
 *
 * @author zagraevskaya
 */
public class SendMailIDoc {
  
  static final org.apache.logging.log4j.Logger mailLogger = LogManager.getLogger(SendMailIDoc.class);  
    
  public String email;

  public SendMailIDoc(String email){
    this.email=email;
  }  
    
  //Отправить Еmail с логином / паролем   
  public void sendEmail(String params){      
          String to = email;         // sender email 
          String from = "mail@accordbank.com.ua";       // receiver email 
          String host = "mgmtsrv64.accord.local";            // mail server host 

          Properties properties = System.getProperties(); 
          properties.setProperty("mail.smtp.host", host); 
          
           Session session = Session.getDefaultInstance(properties); // default session 
           
           try { 
                MimeMessage message = new MimeMessage(session); // email message 

                message.setFrom(new InternetAddress(from)); // setting header fields  

                message.addRecipient(Message.RecipientType.TO, new InternetAddress(to)); 

                message.setSubject("TEST/АКОРДБАНК.Запит на збільшення лімітів на відправку переказів по WU "); // subject line 
      
                message.setContent(params, "text/html; charset=utf-8");     
               
                Transport.send(message); 
               
                //System.out.println("Email Sent successfully...."+email); 
                mailLogger.log(org.apache.logging.log4j.Level.INFO,"Письмо отправлено : "+params+" email: "+email);
               } catch (MessagingException mex) {
                    mailLogger.log(org.apache.logging.log4j.Level.ERROR," Ошибка отправки письма: "+mex+" "+params);
                   //System.out.println("Ошибка отправки сообщения : "+mex);
                   mex.printStackTrace(); 
               }
           }

     } 
          
          
   
   
      

