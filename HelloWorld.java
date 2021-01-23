public class HelloWorld{
     public static void main(String []args){
        int[]list = {1,2,3,4,5,6,7,8,9};
        printList(list, 2);
     }

     public void printList(int[]list, int n){
         if(n > list.length)
            return;
        System.out.println(list[n]);
        printList(list, n+3);
     }
     
}