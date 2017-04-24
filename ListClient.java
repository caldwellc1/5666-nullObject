public class ListClient {
    public static void main(String[] args) {
	ListNode list;
	list = new IntListNode(1, 
		     new IntListNode(22, 
			  new IntListNode(333, null)));
	list.print();
	System.out.println("List length = " + list.length());
    }
}

interface ListNode {
    ListNode next();
    int length();
    void print();
    public static final ListNode NULL = new ListNode()
    {
        public ListNode next(){
            return null;
        }    
        public void print(){}
        public int length(){ return 0;}
    };
}

class IntListNode implements ListNode {
    private int value;
    IntListNode next;
    public IntListNode() { value = 0; next = null; }
    public IntListNode(int value, IntListNode next) {
    	this.value = value;
	    this.next = next;
    }
    public int value() 
    { 
        return value; 
    }
    public void setValue(int newValue) 
    { 
        value = newValue; 
    }
    public IntListNode next() 
    { 
        return next; 
    }
    public void setNext(IntListNode newNext) 
    {
         next = newNext; 
    }
    public int length() { 
	    if (next() == null) return 1;
    	else return 1 + next().length();
    }
    public void print() {
    	System.out.println(value);
	    if (next() != null) next().print();
    }
}
