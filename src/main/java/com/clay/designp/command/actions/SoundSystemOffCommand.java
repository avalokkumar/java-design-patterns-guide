package com.clay.designp.command.actions;

import com.clay.designp.command.model.SoundSystem;

public class SoundSystemOffCommand implements Command {
    private SoundSystem soundSystem;
    
    public SoundSystemOffCommand(SoundSystem soundSystem) {
        this.soundSystem = soundSystem;
    }
    
    public void execute() {
        soundSystem.off();
    }
}