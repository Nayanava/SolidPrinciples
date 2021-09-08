package design.patterns.behavioral.mediator;
/**
 * @author nayanava
 */

import solid.srp.Journal;

import java.io.*;

public class MediatorDemo {

    public static void main(String[] args) {
        ChatRoom room = new ChatRoom();
        Person souvik = new Person("Souvik");
        Person siddharth = new Person("Siddharth");

        room.joinChatRoom(siddharth);
        room.joinChatRoom(souvik);

        souvik.send("Hey Room");
        siddharth.send("Oh Hey Souvik");

        Person jayanta = new Person("Jayanta");
        room.joinChatRoom(jayanta);
        jayanta.send("Hi everyone!");
        siddharth.privateMessage("Jayanta", "Glad you could join us!");
    }
}
