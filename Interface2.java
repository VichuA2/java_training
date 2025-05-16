import java.util.*;
interface Readable{
    void Read();
}
interface Writable{
    void Write();
}
interface Storable{
    void Store();
}
class File implements Readable,Writable,Storable{
    public void Read(){
        System.out.println("Bharani1");
    }
    public void Write(){
        System.out.println("Bharani4");
    }
    public void Store(){
        System.out.println("Bharani3");
    }
}
class Interface2{
    public static void main(String args[]){
        File s=new File();
        s.Read();
        s.Write();
        s.Store();
    }
}
