public interface IEmployee {
    void foo();
    
   /* static class NullEmployee implements IEmployee {
    	public void foo() { 
            System.out.println("NULL"); 
        }
    }
    public static final IEmployee NULL = new NullEmployee();
    */
    public static final IEmployee NULL = new IEmployee(){
        public void foo(){}    
    };
}

class Employee implements IEmployee {
    public void foo() { System.out.println("not null"); }
}

class Client {
    public static void main(String[] args) {
	IEmployee a = new Employee();
	if (a == IEmployee.NULL) {
	    System.out.println("a is NULL");
	}
	a.foo();

	a = IEmployee.NULL;
	if (a == IEmployee.NULL) {
	    System.out.println("a is NULL");
	}
	a.foo();
    }
}
    
