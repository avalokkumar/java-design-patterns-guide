package com.clay.designp.command;

import com.clay.designp.command.actions.*;
import com.clay.designp.command.model.RemoteControl;
import com.clay.designp.command.model.SoundSystem;
import com.clay.designp.command.model.TV;

import java.util.ArrayList;
import java.util.List;

public class Example {

    public static void main(String[] args) {
        // Set up the receivers
        TV tv = new TV();
        SoundSystem soundSystem = new SoundSystem();

        // Set up the commands
        Command tvOn = new TVOnCommand(tv);
        Command tvOff = new TVOffCommand(tv);
        Command soundOn = new SoundSystemOnCommand(soundSystem);
        Command soundOff = new SoundSystemOffCommand(soundSystem);

        // Set up a scene with multiple commands
        List<Command> sceneCommands = new ArrayList<>();
        sceneCommands.add(tvOn);
        sceneCommands.add(soundOn);
        Scene partyScene = new Scene(sceneCommands);

        // Set up the invoker
        RemoteControl remoteControl = new RemoteControl();

        // Execute some commands
        remoteControl.setCommand(tvOn);
        remoteControl.pressButton();

        remoteControl.setCommand(soundOff);
        remoteControl.pressButton();

        // Execute a scene
        remoteControl.setCommand(partyScene);
        remoteControl.pressButton();
    }
}
