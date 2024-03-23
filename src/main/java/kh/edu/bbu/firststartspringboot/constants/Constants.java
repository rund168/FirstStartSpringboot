package kh.edu.bbu.firststartspringboot.constants;

import kh.edu.bbu.firststartspringboot.models.request.KeyValueItem;

import java.util.ArrayList;
import java.util.List;

public interface Constants {

    String DELETE = "DEL";
    String ACTIVE = "ACT";

    static  List<KeyValueItem> getAllStatus(){
        List<KeyValueItem> list = new ArrayList<>();
        list.add(new KeyValueItem(1,"ACT","Active"));
        list.add(new KeyValueItem(2,"DEL","Delete"));
        list.add(new KeyValueItem(3,"IAC","In Active"));
        return list;
    }
    static List<String> getAllStatusString(){
        List<String> list = new ArrayList<>();
        list.add("ACT");
        list.add("IAC");
        list.add("DEL");
        return list;
    }
}
