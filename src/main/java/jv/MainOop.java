package jv;

import java.util.List;
import java.util.Set;

public class MainOop {
    public static void main(String[] args) {

        Human olya = new Human("Olga", 30, true); // создали объект - инициализация объекта
        Human katya = new Human("Katya", 35, true);
        Human tanya = new Human("Tanya", 40, true);
        Human sanya = new Human("Sanya", 41, true);
        Human manya = new Human("Manya", 41, true);
        Human[]friends = new Human[]{katya, tanya}; //инициализация массива
/////List
        List<Human> friendsList = List.of(katya, tanya);
        List<Human> friendsListExtra = List.of(sanya, manya);

        olya.addFriends(friendsList);
        olya.addFriends(friendsListExtra);

        olya.printAllFriends();
//        olya.printAllFriendsBack();
        olya.printFriendByNameIfPresent1("Nadya");
        olya.printFriendByNameIfPresent1("Katya");
        olya.printFriendByNameIfPresent1("Manya");

/////Set
        Set<Human> friendsListSet = Set.of(katya, tanya);
        Set<Human> friendsListExtraSet = Set.of(sanya, manya);

        olya.addFriendsSet(friendsListSet);
        olya.addFriendsSet(friendsListExtraSet);

        olya.printAllFriendsSet();
        olya.printFriendByNameIfPresentSet1("Nadya");
        olya.printFriendByNameIfPresentSet1("Katya");


/////Map
        Set<Human> friendsListMap = Set.of(katya, tanya);
        Set<Human> friendsListExtraMap = Set.of(sanya, manya);

        olya.addFriendMap(friendsListMap);
        olya.addFriendMap(friendsListExtraMap);

        olya.printAllFriendsMap();
        olya.printFriendByNameIfPresentMap("Nadya");
        olya.printFriendByNameIfPresentMap("Katya");

//        olya.setName("Olga");
//        olya.setAge(30);
//        olya.setCute(true);
//        System.out.println(olya.toString());
    }
}
