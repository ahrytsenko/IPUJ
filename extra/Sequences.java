class Sequences {

    public static void main(String[] args) {
        
        public final int ATTEMPTS = 1000;
        public final int MAX_DIE_VALUE = 6;
        
        int[] oneDie = new int[MAX_DIE_VALUE];
        int[] twoDice = new int[MAX_DIE_VALUE*2];
        int[] threeDice = new int[MAX_DIE_VALUE*3];
        
        for(int i = 0; i < ATTEMPTS; i++) {
            oneDie[getDieValue(MAX_DIE_VALUE)]++;
        }

        for(int i = 0; i < ATTEMPTS*2; i++) {
            oneDie[getDieValue(MAX_DIE_VALUE) + getDieValue(MAX_DIE_VALUE)]++;
        }

        for(int i = 0; i < ATTEMPTS*3; i++) {
            oneDie[getDieValue(MAX_DIE_VALUE) + getDieValue(MAX_DIE_VALUE) + getDieValue(MAX_DIE_VALUE)]++;
        }
        
        System.out.println("One Die's values distribution:");
        for(int i = 0; i < oneDie.length; i++) {
            System.out.printf("Die value: %d - %d", (i+1), oneDie[i]);
        }
        
        System.out.println("\nTwo Dice's values distribution:");
        for(int i = 0; i < twoDice.length; i++) {
            System.out.printf("Dice value: %d - %d", (i+1), twoDice[i]);
        }
        
        System.out.println("\nTree Dice's values distribution:");
        for(int i = 0; i < threeDice.length; i++) {
            System.out.printf("Dice value: %d - %d", (i+1), treeDice[i]);
        }
        
    }
    
    public static int getDieValue(int maxValue) {
        return ((int)(Math.random()*maxValue))+1;
    }
}
