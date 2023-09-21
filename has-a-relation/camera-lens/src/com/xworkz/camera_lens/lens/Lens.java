package com.xworkz.camera_lens.lens;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Lens {
    private int pixels;
    public void zoom(int pixels){
        System.out.println("Zoom : " + getPixels());
    }

}
