public class cap {
    
    private int rows;
    
    public cap(int rows){
    this.rows=rows; 
    }
    public int getRows(){
    return rows; 
    }
    
    public void row1(){
    for(int i=1; i <=getRows(); i++){
    for(int j =i; j <=getRows(); j++){
    System.out.print("*"); 
    }
      System.out.println(); 
    }
}  
  public void row2(){
  for(int i =1; i<=getRows(); i++){
  for(int j=1; j<=i; j++){
  System.out.print("*");
  }
  System.out.println();
  }
  }
   public void row3(){
    for(int i=1; i <=getRows(); i++){
    for(int j =i; j >=getRows(); ++j){
    System.out.print("*"); 
    }
      System.out.println(); 
    }
} 
    }

