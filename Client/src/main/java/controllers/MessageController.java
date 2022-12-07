package controllers;

import java.util.ArrayList;
import java.util.HashSet;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import models.Id;
import models.Message;


public class MessageController {
    TransactionController transactionController = new TransactionController();

    private HashSet<Message> messagesSeen;
    // why a HashSet??

    public ArrayList<Message> getMessages() {
        return null;
    }
    public ArrayList<Message> getMessagesForId(Id Id) {
        return null;
    }
    public Message getMessageForSequence(String seq) {
        return null;
    }
    public ArrayList<Message> getMessagesFromFriend(Id myId, Id friendId) {
        return null;
    }

    public Message postMessage(Id myId, Id toId, String msg) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        String to = (toId != null) ? toId.getGithub() : "";
        String payload = mapper.writeValueAsString(new Message(myId.getGithub(), to, msg));

        String result = transactionController.post(String.format("/ids/%s/messages", myId.getGithub()), payload);
        System.out.println(result);
        return mapper.readValue(result, Message.class);
        return null;
    }
 
}