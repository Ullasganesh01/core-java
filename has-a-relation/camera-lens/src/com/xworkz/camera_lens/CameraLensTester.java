package com.xworkz.camera_lens;

import com.xworkz.camera_lens.camera.Camera;
import com.xworkz.camera_lens.lens.Lens;
import com.xworkz.camera_lens.nikon.Nikon;

public class CameraLensTester {
    public static void main(String[] args) {
        Camera camera = new Camera();
        Lens lens = new Lens();
        camera.lens = lens;
        Nikon nikon = new Nikon();

        Camera camera1 = new Nikon(12);
        camera1.click();
    }
}
