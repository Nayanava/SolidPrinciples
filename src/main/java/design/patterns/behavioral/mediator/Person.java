package design.patterns.behavioral.mediator;
/**
 * @author nayanava
 */

import java.io.*;

public class Person {
    private String name;
    private ChatRoom chatRoom;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setChatRoom(ChatRoom chatRoom) {
        this.chatRoom = chatRoom;
    }

    public void send(String message) {
        chatRoom.broadCast(name, message);
    }

    public void receive(String sender, String message) {
        String receivedMessage = sender + ": " + message;
        System.out.println("[" + name + "'s chat room] " + receivedMessage);
    }

    public void privateMessage(String who, String message) {
        chatRoom.unicast(this.name, who, message);
    }
}
