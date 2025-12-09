import java.util.ArrayList;
import java.util.List;

public class NodeInit
{
    static List <Node> instances = new ArrayList<>();

    public static void init(int numNodes)
    {

        for (int i = 1; i <= numNodes; i++)
        {
            Node n1 = new Node();
            instances.add(n1);
        }

        for (Node instance : instances)
        {
            System.out.println(instance);
        }
    }
}
