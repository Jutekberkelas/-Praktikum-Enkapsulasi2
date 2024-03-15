
public class Bangundatar {
    private int p;
    private int l;
    private int s;
    
    Bangundatar(int p, int l){
        this.p = p;
        this.l = l;
    }
    
    Bangundatar(int s){
        this.s = s;
    }
    
    void setPanjangLebar(int p, int l){
        this.p = p;
        this.l = l;
    }
    
    void setSisi(int s){
        this.s = s;
    }
    
    int getPanjang(){
        return p;
    }
    
    int getLebar(){
        return l;
    }
    
    int getSisi(){
        return s;
    }
}
