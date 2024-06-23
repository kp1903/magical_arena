public class Arena {
    public Player fight(Player player1, Player player2) {
        while (player1.isAlive() && player2.isAlive()) {
            if (player1.getHealth() < player2.getHealth()) {
                player1.attack(player2);
                if (player2.isAlive()) {
                    player2.attack(player1);
                }
            } else {
                player2.attack(player1);
                if (player1.isAlive()) {
                    player1.attack(player2);
                }
            }
        }
        return player1.isAlive() ? player1 : player2;
    }
}