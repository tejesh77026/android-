////////////////////////////

public class address{
    
    public String name;
    public int sapid;
    
    public  address(String name,int sapid){
        this.name=name;
        this.sapid=sapid;
    }
    
    public void print(){
        System.out.println("Name:"+name+"sapid:"+sapid);
    }
    
}