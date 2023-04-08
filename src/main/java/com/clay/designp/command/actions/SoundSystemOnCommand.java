package com.clay.designp.command.actions;

import com.clay.designp.command.model.SoundSystem;

public class SoundSystemOnCommand implements Command {
    private SoundSystem soundSystem;
    
    public SoundSystemOnCommand(SoundSystem soundSystem) {
        this.soundSystem = soundSystem;
    }
    
    public void execute() {
        soundSystem.on();
    }
}
