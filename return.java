class Return{
    public static void main(String args[]){
        boolean t = true;
        
        System.out.println("Before the return.");
        
        if(t) return ;// return to IncompatibleClassChangeError
        System.out.println("This won't excute.");
    }
}