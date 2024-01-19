package Excepciones;

import java.util.ArrayList;
import java.util.List;

public class StackExample01 {
    private final List<String> storage = new ArrayList<>();

    public void push(String s) {
        //escribe aquí tu código
        storage.add(0,s);
    }

    public String pop() {
        //escribe aquí tu código
        String result = storage.get(0);
        storage.remove(0);
        return result;
    }

    public String peek() {
        //escribe aquí tu código
        return storage.get(0);
    }

    public boolean empty() {
        //escribe aquí tu código
        if(storage.size()==0){
            return true;
        }else{
            return false;
        }
    }

    public int search(String s) {
        //escribe aquí tu código
        int result = -1;
        for(int i=0;i<storage.size();i++){
            if(storage.get(i).equals(s)){
                result = i;
            }
        }
        return result;
    }
}
