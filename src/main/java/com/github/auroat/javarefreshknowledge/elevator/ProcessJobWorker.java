package com.github.auroat.javarefreshknowledge.elevator;

public class ProcessJobWorker implements Runnable {
    private Elevator elevator;

    ProcessJobWorker(Elevator elevator) {
        this.elevator = elevator;
    }

    @Override
    public void run() {
        /**
         * start the elevator
         */
        elevator.startElevator();
    }
}
