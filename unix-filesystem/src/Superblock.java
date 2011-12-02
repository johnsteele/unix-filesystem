
public class Superblock {

	/**
	 * The number of disk blocks. 
	 */
	public int totalBlocks; 
	
	/**
	 * The number of inodes.
	 */
	public int totalInodes;
	
	/**
	 * The block number of the free list's head.
	 */
	public int freeList;
}
