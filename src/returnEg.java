public class returnEg {
    public static void main(String[] args) {
        String str=search(3);
            System.out.println(str);
            System.out.println(search(10));
    }
        public static String search(int key){
            int[] numbers ={1,2,3,4,5,6,7,8,9};
            for(int i :numbers)
            {
                if(i == key)
                {
                    return "Success";
                }
            }return "Failure";
        }
    }
    
