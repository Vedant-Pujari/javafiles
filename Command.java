class Command{
    public static void main(String argss[]){
        String args[] = new String[argss.length];

        // for(int i=0;i<argss.length;i++){
        //     System.out.println("argss: " + argss[i]);
        // }
        // for(int i=0;i<args.length;i++){
        //     System.out.println("args: " + args[i]);
        // }
        for(int i=0;i<argss.length;i++){
            args[i] = argss[i];
        }
        // for(int i=0;i<args.length;i++){
        //     System.out.println("again args: " + args[i]);
        // }


        String s[] = new String[args.length];
        int arr[] = new int[args.length];


        for(int i=0;i<args.length;i++){
            try{
            if(Integer.parseInt(args[i])>47 && Integer.parseInt(args[i])<58){
                arr[i] = Integer.parseInt(args[i]);
                System.out.println(Integer.parseInt(args[i]));
            }
            }
            catch(Exception e){
                System.out.println("Integer: " + e);
                try{
                    for(int j=0;j<args.length;j++){
                        if(Integer.parseInt(args[j])>64 && Integer.parseInt(args[j])<91||Integer.parseInt(args[j])>96 && Integer.parseInt(args[j])<123){
                            s[j] = args[j];
                            System.out.println("String in s is " + s[j]);
                        }
                        
                    }
                }
                catch(Exception e1){
                    System.out.println("String: " + e1);
                }
            }
        }
        
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        //     System.out.println(s[i]);
        // }

        // String arg[] = new String[args.length];
        // char a = args[0].charAt(0);
        // System.out.println(a);
    }
}