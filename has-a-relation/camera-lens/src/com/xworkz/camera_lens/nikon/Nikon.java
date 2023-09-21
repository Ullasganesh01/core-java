package com.xworkz.camera_lens.nikon;

import com.xworkz.camera_lens.camera.Camera;
import com.xworkz.camera_lens.lens.Lens;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Nikon extends Camera {
    private int screenWidth;

    @Override
    public void click() {
        System.out.println("inside child");
        if(screenWidth > 10)
        super.click();
    }
}
