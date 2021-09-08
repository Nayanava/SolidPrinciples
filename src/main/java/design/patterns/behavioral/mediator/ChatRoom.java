package design.patterns.behavioral.mediator;
/**
 * @author nayanava
 */

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class ChatRoom {
    private List<Person> participants = new LinkedList<>();
    public void joinChatRoom(Person p) {
        participants.add(p);
        broadCast(p.getName(), "has joined the chat room");
        p.setChatRoom(this);
    }
    public void broadCast(String source, String message) {
        for(var participant : participants) {
            if(!participant.getName().equals(source))
            participant.receive(source, message);
        }
    }

    public void unicast(String source, String destination, String message) {
        participants.stream()
                .filter(participant -> participant.getName().equals(destination))
                .findFirst()
                .ifPresent(participant -> participant.receive(source, message));
    }
}
