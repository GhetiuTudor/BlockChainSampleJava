import java.util.ArrayList;

public class BlockchainProg {
    public static void main(String [] args){

        ArrayList<Block> blocks=  new ArrayList<>();

        String[] initialValues= {"X has $50","Y has $100"};
        //we use 0 for the prevHash of the genesis block
        Block firstBlock= new Block(initialValues, 0);
        blocks.add(firstBlock); //hash=753948055
        //System.out.println("the first block: "+ firstBlock.toString());
       // System.out.println("the blockchain is: "+ blocks.toString());

        String[] XGivesItAway= {"X gives Y $50","Y gives Z $30"};
        Block secondBlock= new Block(XGivesItAway, firstBlock.getHash());
        blocks.add(secondBlock); //hash=480230963
        //System.out.println("the blockchain is: "+ blocks.toString());

        String[] XGetsItBack= {"Y gives X $50","Y gives Z $10"};
        Block thirdBlock= new Block(XGivesItAway, secondBlock.getHash());
        blocks.add(thirdBlock); //hash=206513871
        System.out.println("the blockchain is: "+ blocks.toString());

    }
}
