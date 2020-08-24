//////////////////////////////

public class salary extends address{
    
    private double salary;
    
    public salary(String name ,int sapcode, double salary){
        super(name,sapcode);
        set(salary);
    }
    
    public double  get(){
        return salary;
    }
    
    public  void  set(double newsalary){
        salary=newsalary;
    }
    
    public void print(){
        System.out.println("Name :"+name+ "\n"+ "sapis"+sapid +"\n"+"salary:"+salary);
    }
}

