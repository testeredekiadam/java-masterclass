package challenge;

public class SearchTree implements NodeList {
	
	private ListItem root = null;

	public SearchTree(ListItem root) {
		this.root = root;
	}

	@Override
	public ListItem getRoot() {
		return this.root;
	}

	@Override
	public boolean addItem(ListItem item) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeItem(ListItem item) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void traverse(ListItem root) {
		//recursive method
		
		if(root != null) {
			traverse(root.previous());
			System.out.println(root.getValue());
			traverse(root.next());
		}
		
	}
	
	

}
