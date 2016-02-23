package main;

import net.sf.json.JSONObject;
public class Test2 {
public static void main(String args[]) {
       Person person = new Person();
        person.setName("swiftlet");
        person.setSex("men");
        person.setAddress("china");
        JSONObject json = JSONObject.fromObject(person);
        System.out.println(json.toString());
    }
}