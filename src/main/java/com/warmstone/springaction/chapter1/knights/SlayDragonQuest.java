package com.warmstone.springaction.chapter1.knights;

import java.io.PrintStream;

public class SlayDragonQuest implements Quest{

    private PrintStream printStream;

    public SlayDragonQuest(PrintStream printStream) {
        this.printStream = printStream;
    }

    @Override
    public void embark() {
        printStream.println("Embarking on quest to slay the dragon!!!");
    }
}
