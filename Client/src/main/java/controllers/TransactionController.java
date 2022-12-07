package controllers;

import models.Id;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import java.net.URL;
import java.net.URLConnection;
import java.net.http.HttpClient;


//Transaction controller takes the messageController and IdController and
public class TransactionController {
    private String rootURL = "http://zipcode.rocks:8085";
    private MessageController msgCtrl;
    private IdController idCtrl;
    URL root;

    {
        try {
            root = new URL("http://zipcode.rocks:8085");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }



    public TransactionController(MessageController m, IdController j) {}

    public List<Id> getIds() {
        List<Id> listOfIds = new ArrayList<Id>();

    }
    public String postId(String idtoRegister, String githubName) {
        Id tid = new Id(idtoRegister, githubName);
        tid = idCtrl.postId(tid);
        return ("Id registered.");
    }

    public String post (String url, String content){

    }
}
