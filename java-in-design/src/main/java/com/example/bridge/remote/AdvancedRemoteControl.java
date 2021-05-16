package com.example.bridge.remote;

import com.example.bridge.device.Device;

//
public class AdvancedRemoteControl extends RemoteControl {

    public AdvancedRemoteControl(Device device) {
        super(device);
    }

    // 음소거 기능
    void mute() {
        device.setVolume(0);
    }
}