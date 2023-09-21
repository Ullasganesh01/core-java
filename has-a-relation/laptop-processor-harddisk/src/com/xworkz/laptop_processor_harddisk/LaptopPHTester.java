package com.xworkz.laptop_processor_harddisk;

import com.xworkz.laptop_processor_harddisk.hard_disk.HardDisk;
import com.xworkz.laptop_processor_harddisk.laptop.Laptop;
import com.xworkz.laptop_processor_harddisk.processor.Processor;

public class LaptopPHTester {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        Processor processor = new Processor();
        HardDisk hardDisk = new HardDisk();

        laptop.processor = processor;
        laptop.hardDisk = hardDisk;
    }
}
