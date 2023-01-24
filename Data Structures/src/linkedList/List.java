
package linkedList;
public class List {
    Variables head;
    Variables tail;
    public List(){
        head=null;
        tail=null;
    }
    public void addFirst(Variables fresh){
        if(tail==null){
            tail=fresh;
            head=fresh;}
        else{
            fresh.next=head;
            head=fresh;}
    }
    public void  addLast(Variables fresh){
        if(head==null){
            head=fresh;
        }
        else{
            tail.next=fresh;
            tail=fresh;}
    }
    public void addMid(Variables fresh,Variables prev){
        fresh.next=prev.next;
        prev.next=fresh;
    }
    public void delfromFirst(){
        head=head.next;
        if(head==null){
            tail=null;}
    }
    public void delfromLast(){
       Variables tmp,prev;
       tmp=head;
       prev=null;
       while(tmp!=head){
           prev=tmp;
           tmp=tmp.next;}
       //if list is empty
       if(prev==null){
           head=null;}
       else{
           prev.next=null;
           tail=prev;}
    }
    public void delfromMid(Variables deletable){
        Variables tmp=head,prev=null;
        while(tmp.data!=deletable.data){
            prev=tmp;
            tmp=tmp.next;}
        prev.next=tmp.next;
    }
    public int varSize(){
        int counter=0;
        Variables tmp;
        tmp=head;
        while(tmp!=null){
            tmp=tmp.next;
            counter++;}
        return counter;
    }
    public List Aggregation (List l1,List l2){
        List tmp;
        if(l1.head==null)
            return l2;
        if(l2.head==null)
            return l1;
        tmp=new List();
        tmp.head=l1.head;
        tmp.tail=l2.tail;
        l1.tail.next=l2.head;
        return tmp;
    }
     
    public void moveToFirst(){
        //if list is empty or have an a one variable
        if(head==null|| head.next==null){
            return;}
        Variables prev=null,tmp=head;
        while(tmp!=null){
            prev=tmp;
            tmp=tmp.next;}
            prev.next=null;
            tmp.next=head;
            head=tmp;
    }
    //lowest to highest
    public void sortedInsert(Variables fresh){
        Variables tmp;
        //if list is empty or have an one variable
        if(head==null ||head.data>=fresh.data){
          fresh.next=head;
          head=fresh;}
        else{
        tmp=head;
        while(tmp.next!=null&& tmp.next.data< fresh.data){
            tmp=tmp.next;
            fresh.next=tmp.next;
            tmp.next=fresh;}}
    }
    public String view(){
        Variables tmp=head;
        String result="";
        while(tmp!=null){
           result+=tmp.data +"->";
           tmp=tmp.next;}
        return result;
    }
            }
