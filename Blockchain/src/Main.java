
public class Main {
	
	public static void main(String[] args) {
		
		Blockchain blockchain = new Blockchain(4);
		
		blockchain.addBlock(blockchain.newBlock("First Cryptocurrency"));
		blockchain.addBlock(blockchain.newBlock("Gustavo Tempel"));
		blockchain.addBlock(blockchain.newBlock("Xavier Secco"));
		
		System.out.println(blockchain);
		
		blockchain.addBlock(new Block(15, System.currentTimeMillis(), "aaaaaa", "Block invalid"));
		
		System.out.println("Blockchain valid = " + blockchain.isBlockChainValid());
		
		System.out.println(blockchain);
	}

}
