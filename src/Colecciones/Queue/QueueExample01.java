package Colecciones.Queue;

import java.util.AbstractQueue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class QueueExample01 extends AbstractQueue<String> {
    private final List<String> values = new ArrayList<>();

    @Override
    public Iterator<String> iterator() {
        //escribe aquí tu código

        return values.listIterator();
    }

    @Override
    public int size() {
        //escribe aquí tu código

        return values.size();
    }

    @Override
    public boolean offer(String o) {
        //escribe aquí tu código
        return values.add(o);
    }

    @Override
    public String poll() {
        //escribe aquí tu código
        if (values.isEmpty()) {
            return null;
        }else
            return values.remove(0);
    }

    @Override
    public String peek() {
        //escribe aquí tu código
        if (values.isEmpty()) {
            return null;
        }else
            return values.get(0);
    }
}
