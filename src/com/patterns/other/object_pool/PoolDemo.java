package com.patterns.other.object_pool;

import java.util.LinkedList;
import java.util.List;

public class PoolDemo {
    public static void main(String[] args) {
        ObjectPool objectPool = new ObjectPool();
        objectPool.addPObject();
        PObject pObjectInUse = objectPool.getPObject();
        objectPool.releasePObject(pObjectInUse);
    }
}

class PObject {
    String str;
}

class ObjectPool {
    List<PObject> free = new LinkedList<>();
    List<PObject> used = new LinkedList<>();

    public PObject addPObject() {
        PObject pObj = new PObject();
        free.add(pObj);
        return pObj;
    }

    public PObject getPObject() {
        if (free.isEmpty()) {
            System.out.println("sorry the pool is empty, you need to add some objects first");
            return null;
        } else {
            PObject pObj = free.get(0);
            used.add(pObj);
            free.remove(pObj);
            return pObj;
        }
    }

    public void releasePObject(PObject pObj) {
        used.remove(pObj);
        free.add(pObj);
    }
}