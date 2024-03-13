class FixedStack implements IntStack {
    private int stck[];
    private int tos;

    FixedStack(int size)
    {
        stck = new int[size];
        tos = -1;
    }
    public void push(int item)
    {
        if(tos==stck.length-1)
            System.out.println("Stack is full.");
        else
            return stck[tos--];
    }
}