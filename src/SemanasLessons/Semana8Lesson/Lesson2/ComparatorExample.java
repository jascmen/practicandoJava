package SemanasLessons.Semana8Lesson.Lesson2;

import java.util.*;

public class ComparatorExample {
    public static void main(String[] args) {
        List<Player> footballPlayers = new ArrayList<>();
        Player player1 = new Player();
        player1.setAge(20);
        Player player2 = new Player();
        player2.setAge(18);
        Player player3 = new Player();
        player3.setAge(19);

        footballPlayers.add(player1);
        footballPlayers.add(player2);
        footballPlayers.add(player3);

        System.out.println("Lista de jugadores inicial: " + footballPlayers);
        Collections.sort(footballPlayers, new PlayerAgeComparator());
        System.out.println("Lista de jugadores ordenada por edad: " + footballPlayers);

    }
}

class PlayerAgeComparator implements Comparator<Player> {
    @Override
    public int compare(Player p1, Player p2){
        return Integer.compare(p1.getAge(), p2.getAge());

    }
    //-1 si p1 < p2
    //0 si p1 == p2
    //1 si p1 > p2
}

class Player{
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return "Player{" +
                "age=" + age +
                '}';
    }
}
