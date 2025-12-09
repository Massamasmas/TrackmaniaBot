public class Node
{
    static int numNodes = 0;
    int nodeNum;
    double activation;
    double weight;

    public Node(double w)
    {
        weight = w;
        numNodes ++;
        nodeNum = numNodes;
    }

    public Node()
    {
        weight = generateWeight();
        numNodes ++;
        nodeNum = numNodes;
    }


    public static double generateWeight()
    {
        int decimalPlaces = 5; //how many decimals are stored after 0
        double multiplier = Math.pow(10, decimalPlaces);
        double outRandom = Math.round(Math.random() * multiplier) / multiplier;
        return(outRandom);
    }

    public static double generateWeight(int decimalPlaces)
    {
        double multiplier = Math.pow(10, decimalPlaces);
        double outRandom = Math.round(Math.random() * multiplier) / multiplier;
        return(outRandom);
    }

    public void modWeight(double d)
    {
        weight += d;
    }

    public void modWeight(int d)
    {
        weight += d;
    }

    public double getWeight()
    {
        return(weight);
    }

    public String toString()
    {
        return("Node " + nodeNum + " has weight of " + weight);
    }

}
