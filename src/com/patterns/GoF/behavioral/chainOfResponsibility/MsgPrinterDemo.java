package com.patterns.GoF.behavioral.chainOfResponsibility;

public class MsgPrinterDemo {
    public static void main(String[] args) {
        MsgPrinter msgPrinter = new ConsoleMsgPrinter();
        msgPrinter.setNextMsgPrinter(msgPrinter);
    }
}

abstract class MsgPrinter {
    MsgPrinter nextMsgPrinter;

    void setNextMsgPrinter(MsgPrinter msgPrinter) {
        nextMsgPrinter = msgPrinter;
    }

    void print(String msg) {
        nextMsgPrinter.printMsg(msg);
        if (nextMsgPrinter != null) {
            nextMsgPrinter.printMsg(msg);
        }
    }

    abstract void printMsg(String msg);
}

class ConsoleMsgPrinter extends MsgPrinter {

    @Override
    void printMsg(String msg) {
        System.out.println("printed to console: " + msg);
    }
}

class FileMsgPrinter extends MsgPrinter {

    @Override
    void printMsg(String msg) {
        System.out.println("printed to file: " + msg);
    }
}

class DBMsgPrinter extends MsgPrinter {

    @Override
    void printMsg(String msg) {
        System.out.println("printed to DB: " + msg);
    }
}