
public class Queue  {


    LinkedList <String> List;

    public Queue() {
        List = new LinkedList<String>();
    }

    public void Add(String name) {
        List.AddAtEnd(name);
    }

    public String Process() {
        String name = List.ValueAt(0);
        List.RemoveFromBeginning();
        return name;
    }

    public int NumInFront(String name) {
        if(List.IndexOf(name)!=-1){
            return List.IndexOf(name);
        }
        else
        {
            System.out.println(name + " is not in the queue.");
            return -1;
        }
    }

    public void printQueue() {
        System.out.println("[*]Queue: " + List);
    }
    public int getSize() {
        return List.getSize();
    }

    public String nextUp() {
        return List.ValueAt(0);
    }
}
