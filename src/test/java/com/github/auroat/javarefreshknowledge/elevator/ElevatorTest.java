package com.github.auroat.javarefreshknowledge.elevator;

import org.junit.jupiter.api.Test;

public class ElevatorTest {
    @Test
    void testElevator() {
        Elevator elevator = new Elevator();

        // A person wants to go in the UP direction from source floor 0
        ExternalRequest er = new ExternalRequest(Direction.UP, 0);

        // The destination floor is 5
        InternalRequest ir = new InternalRequest(5);
        Request request1 = new Request(ir, er);
    }

    @Test
    void testElevatorTwo() {
        Elevator elevator = new Elevator();

        /**
         * Thread for starting the elevator
         */
        ProcessJobWorker processJobWorker = new ProcessJobWorker(elevator);
        Thread t2 = new Thread(processJobWorker);
        t2.start();

        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        ExternalRequest er = new ExternalRequest(Direction.DOWN, 5);
        InternalRequest ir = new InternalRequest(0);
        Request requestOne = new Request(ir, er);

        /**
         * Pass job to the elevator
         */
        new Thread(new AddJobWorker(elevator, requestOne)).start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
