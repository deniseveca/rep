public class Cercle {
    private float x;
    private float y;
    
    Cercle(float xx, float yy)
    {
        x=xx;
        y=yy;
    }
    
    public Cercle(){
    this.x = (float) 10.0;
    this.y = (float) 5.0; 
    }
    
    public Cercle (Cercle c){
        this.x = c.x;
        this.y = c.y;
    }
	public float getX(){
        return this.x;
    }  
    public float getY(){
        return this.y;
    }  
    public void setX(float a){
        this.x=a;
    }        
    public void setY(float b){
        this.y=b;
    } 
	public String toString(){
        return ("X és " +this.x+ " i Y és "+ this.y);
    }

    public boolean Equals(Cercle c){
        return (this.x == c.x && this.y == c.y );                
    }
	
	
	    public static void main(String[] args) {


    }

}