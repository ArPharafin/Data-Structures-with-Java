
package doublylinkedList;
public class List {
    Variables head;
    Variables tail;
    public List(){
        head=null;
        tail=null;
}
    public void addtoFirst(Variables fresh){
    if(tail==null)
        tail=fresh;
    else
        head.rear=fresh;
    fresh.next=head;
    head=fresh;
}
    public void addtoLast(Variables fresh){
        if(tail==null)
            tail=fresh;
    else
            head.rear=fresh;
            fresh.next=head;
            head=fresh;
}
    public void addVariables(Variables fresh){
        if(head==null)
            head=fresh;
        else
            tail.next=fresh;
        fresh.rear=tail;
        tail=fresh;
}
    public void delfromFirst(){
        head=head.next;
        if(head==null)
            tail=null;
        else
            head.rear=null;
}
    public void delfromLast(){
        tail=tail.next;
        if(tail==null){
        head=null;}
        else{
        tail.rear=null;}
}
    public void delVar(Variables deletable){
        deletable.next.rear =deletable.rear;
        deletable.rear.next= deletable.next;
}
        
    
    
    
    
}
