import java.util.Scanner;

class node{
    int key;
    node nextnode;
    node(int key){
        this.key=key;
        nextnode=null;
    }
}
public class circularlinkedlist{
    node listhead;
    node listtail;

public void insert(int key){
    node temp=new node(key);//is used to create a new Node object with the given key value.
    if(listhead==null){
        listhead=temp;
    }
    if(listtail==null){
        listtail=temp;
    }
    else{
        listtail.nextnode=temp;
        listtail=temp;
    }
    listtail.nextnode=listhead;
}
public void display(){
    if(listhead==null)
        return;
    node temp=listhead;
    System.out.println(temp.key);
    temp=temp.nextnode;
    while(temp!=listhead){
        System.out.println(temp.key);
        temp=temp.nextnode;
    }
}


    public static void main(String[] args) {
        circularlinkedlist c= new circularlinkedlist();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the nodes");
        int n=sc.nextInt();
        System.out.println("enter " +n+ " nodes");
        for(int i=0;i<n;i++){
            c.insert(sc.nextInt());
        }
        c.display();

        
    }
}
