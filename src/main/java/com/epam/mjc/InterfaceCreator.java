package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        Operation<Integer> divideBy = new Operation<Integer>() {
            @Override
            public List<Integer> apply(List<Integer> arg){
                List<Integer> list = new ArrayList<>();

                for(Integer i : arg){
                    list.add(i / divider);
                }

                return list;
            }
        };

        return divideBy;
    }
}
