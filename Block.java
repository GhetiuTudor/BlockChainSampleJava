import java.util.Arrays;

public class Block {

    private String[] transactions;
    private int hash;
    private int prevHash;

    public Block(String[] transactions, int prevHash) {
        this.transactions = transactions;
        this.prevHash = prevHash;
        //compute the block hash as the hash of an integer array containing the hashed String[] and prevHash
        this.hash= Arrays.hashCode(new int[] {Arrays.hashCode(this.transactions), this.prevHash});
    }

    public String[] getTransactions() {
        return transactions;
    }

    public void setTransactions(String[] transactions) {
        this.transactions = transactions;
    }

    public int getHash() {
        return hash;
    }

    public void setHash(int hash) {
        this.hash = hash;
    }

    public int getPrevHash() {
        return prevHash;
    }

    public void setPrevHash(int prevHash) {
        this.prevHash = prevHash;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Block{");
        sb.append("transactions=").append(Arrays.toString(transactions));
        sb.append(", hash=").append(hash);
        sb.append(", prevHash=").append(prevHash);
        sb.append('}');
        return sb.toString();
    }
}
