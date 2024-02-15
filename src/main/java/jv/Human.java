package jv;

import java.util.*;

public class Human {
    private String name;

    private int age;

    private boolean isCute;
//    private Human[] friends; // массив
    private List<Human> friends = new ArrayList<>(); //коллекция List


// считается плохим стилем
// Alt+Insert -> Setter
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public void setCute(boolean cute) {
//        isCute = cute;
//    }

    //конструктор
    public Human(String name, int age, boolean isCute){
        this.name=name;
        this.age=age;
        this.isCute=isCute;
    }

    public Human(){}
//////List
    public void addFriends (List<Human> friends){
        this.friends.addAll(friends);
    }

    //Циклы
    //пройти по массиву от 0 элемента и выше
    public void printAllFriends(){
        for (int i=0; i<friends.size(); i++){
            System.out.println("List: "+friends.get(i));
        }
    }

    //пройти по массиву от последнего элемента и ниже
    public void printAllFriendsBack(){
        for (int i=(friends.size()-1); i>=0; i--){
            System.out.println(friends.get(i));
        }
    }

    //вывести только при нахождении нужного элемента
    public void printFriendByNameIfPresent1(String name){
        for (int i = 0; i < friends.size(); i++) {
            Human friend = friends.get(i);
            if (friend.name.equals(name)){
                System.out.println("List: "+friend);
//                break; //выдет из цикла и все равно напишет "not found"
                return; //выдет из метода
            }
        }
        System.out.println("List: not found!");
    }
    // тоже самое что и printFriendByNameIfPresent1 - написано по другому
    public void printFriendByNameIfPresent2(String name){
        for (int i = 0; i < friends.size(); i++) {
            Human friend = friends.get(i);
            if (!friend.name.equals(name)){
                continue; // прерывай эту итерацию и переключайся на следующую
            } else {
                System.out.println(friend);
            }
        }
    }

    public void printFriendByNameIfPresent3(String name){
        for (Human friend : friends) {
            if (friend.name.equals(name)){
                System.out.println(friend);
//                break; //выдет из цикла и все равно напишет "not found"
                return; //выдет из метода
            }
        }
        System.out.println("not found!");
    }

    public void printFriendByNameIfPresent4(String name) {
        int index = 0;
        while (index < friends.size()) {
            Human friend = friends.get(index);
            if (friend.name.equals(name)) {
                System.out.println(friend);
//                break; //выдет из цикла и все равно напишет "not found"
                return; //выдет из метода
            }
        }
    }

    public void printFriendByNameIfPresent5(String name) {
        int index = 0;
        do {
            Human friend = friends.get(index);
            if (friend.name.equals(name)) {
                System.out.println(friend);
//                break; //выдет из цикла и все равно напишет "not found"
                return; //выдет из метода
            }
        }
        while (index < friends.size());
    }

    /////Set
    private Set<Human> friendsSet = new HashSet<>(); //коллекция Set

    public void addFriendsSet (Set<Human> friendsSet){
        this.friendsSet.addAll(friendsSet);
    }
    public void printAllFriendsSet(){
        for (Human friendSe:friendsSet){
            System.out.println("SET: "+friendsSet); //у Set нет поиска по индексу
        }
    }

    public void printFriendByNameIfPresentSet1(String name){
        for (int i = 0; i < friends.size(); i++) {
            Human friend = friends.get(i);
            if (friend.name.equals(name)){
                System.out.println("Set: "+friend);
//                break; //выдет из цикла и все равно напишет "not found"
                return; //выдет из метода
            }
        }
        System.out.println("not found!");
    }

//////Map
public Map<String, Human> friendsMap = new HashMap<>();

    public void addFriendMap(Set<Human> friends) {
        for (Human friend : friends) {
            this.friendsMap.put(friend.name, friend);
        }
    }

    public void printAllFriendsMap() {
        for (Human friend : friendsMap.values()) {
            System.out.println("Map: "+friend);
        }
    }

    public void printFriendByNameIfPresentMap(String name) {
        Human human = friendsMap.get(name);
        if (human != null) {
            System.out.println("Map1: "+human);
            return;
        }
        System.out.println("Map1: not found!");
    }

            @Override
            public String toString () {
                return name + ", age: " + age + ", isCute: " + isCute + ", and friends: " + friends;
            }
        }
