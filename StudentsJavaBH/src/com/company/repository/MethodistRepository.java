package com.company.repository;

import com.company.module.Methodist;
import com.company.util.Parser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MethodistRepository {
    private List<Methodist> methodists = new ArrayList<>();

    public MethodistRepository() throws IOException {
        this.methodists = Parser.parsMethodist("methodistFile.txt");
    }

    public void addMethodist(Methodist addMethodist){
        methodists.add(addMethodist);
    }
    public void removeMethodist(Methodist removeMethodist){
        methodists.remove(removeMethodist);
    }

    public List<Methodist> getMethodists() {
        return methodists;
    }
}
