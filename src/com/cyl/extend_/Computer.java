package com.cyl.extend_;

public class Computer {
    public String CPU;
    public String disk;
    public String memory;

    Computer() {

    }
    Computer(String cpu, String disk, String memory) {
        setCPU(cpu);
        setDisk(disk);
        setMemory(memory);
    }
    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public void getDetails() {
        System.out.println("cpu=" + CPU + "disk=" + disk + "memory=" + memory);
    }
}
