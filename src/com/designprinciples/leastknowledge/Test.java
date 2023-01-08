package com.designprinciples.leastknowledge;

public class Test {
    public static void main (String[] args) {
        Boss boss = new Boss();
        Leader leader = new Leader();
        boss.commandCheckNumber(leader);
    }
}
