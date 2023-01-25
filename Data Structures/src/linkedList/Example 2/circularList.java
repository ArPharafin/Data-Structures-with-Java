
package linkedList.circular;
public class circularList {
Node tail;
public circularList(){
    tail=null;
}
    public void insert(int Variables){
     Node temp=new Node(Variables);
     if(tail==null){
         temp.next=temp;
         tail=temp;}
     else{
         temp.next=tail.next;
         tail.next=temp;
         tail=temp;}
}
    void sort(){
        Node temp=tail.next.next;
        System.out.println(tail.next.value);
        while(temp!=tail.next){
            System.out.println(temp.value);
            temp=temp.next;}
}
    Node search(int Variables){
        Node temp=tail.next.next;
        if(tail.next.value==Variables){
            return tail.next;}
        else{
            while(temp!=tail.next){
                if(temp.value==Variables){
                    return temp;}}}
        return null;    
}
    void delete(int Variables){
        Node temp=tail.next.next;
        Node previous=tail.next;
        if(tail.next.value==Variables){
            tail.next=tail.next.next;}
        else{
            while(temp!=tail.next){
                if(temp.value==Variables){
                    previous.next=temp.next;}
                if(temp==tail){
                    tail=previous;}}
            previous=temp;
            temp=temp.next;}
}
    
}
