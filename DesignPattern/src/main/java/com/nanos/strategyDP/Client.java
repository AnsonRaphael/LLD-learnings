package com.nanos.strategyDP;

public class Client {

// in SDP we introduce a family of algorithm or startegies which encapsulate specif behaviour which can enable dynamic switching between them.
    // here by intrudicng sorting startegy as interface the client can switch between different sorting startegy based on its need
    public static void main(String[] args) {
        StrategyContext strategyContext = new StrategyContext(new BubbleSort());
        strategyContext.startegy.sort(new int[3]);
    }
}
