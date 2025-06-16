public class Main {
  public static void main(String[] args) {
    System.out.println("SEMonster!");
    Monster monster = new Monster();
    System.out.println(monster.toString());
    System.out.println("召喚したモンスターは" + monster.name + "です。レア度は" + monster.rare + "です。");
  }
}
