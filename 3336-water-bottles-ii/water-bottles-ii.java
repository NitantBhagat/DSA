class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        return iterate(numBottles,numExchange,0,0);
    }

    private static int iterate(int bottles, int exchange, int empty, int drunk){
        if(bottles >0 || empty>=exchange){
        if(empty>=exchange){
            return iterate(bottles + 1, exchange + 1, empty - exchange, drunk);

        }else if(bottles > 0){
            return iterate( 0, exchange, empty + bottles , drunk + bottles);
        }
        
    }
    return drunk;
    }

}