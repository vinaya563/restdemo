package com.example.demo.service;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.FileInputStream;
@Service
public class FirebaseIntialize {
   @PostConstruct
    public void intialize(){
       try {
           FileInputStream serviceAccount =
                   new FileInputStream("C:\\Users\\Vinaya\\Downloads\\restdemo-master\\restdemo-master\\serviceAccount.json");

           FirebaseOptions options = new FirebaseOptions.Builder()
                   .setCredentials(GoogleCredentials.fromStream(serviceAccount))

                   .build();

           FirebaseApp.initializeApp(options);

       } catch(Exception e){
           e.printStackTrace();
       }

    }
}
